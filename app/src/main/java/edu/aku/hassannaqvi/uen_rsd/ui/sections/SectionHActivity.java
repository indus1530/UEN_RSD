package edu.aku.hassannaqvi.uen_rsd.ui.sections;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.uen_rsd.MainActivity;
import edu.aku.hassannaqvi.uen_rsd.R;
import edu.aku.hassannaqvi.uen_rsd.data.model.Form;
import edu.aku.hassannaqvi.uen_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivitySectionHBinding;


public class SectionHActivity extends AppCompatActivity {
    ActivitySectionHBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h);
        bi.setCallback(this);
        bi.setForm(form);
        setupSkips();
    }


    private void setupSkips() {
        /*rglsnr(bi.str01s, bi.str01n, bi.fldGrpCVstr01t);
        rglsnr(bi.str02s, bi.str02n, bi.fldGrpCVstr02t);
        rglsnr(bi.str03s, bi.str03n, bi.fldGrpCVstr03t);
        rglsnr(bi.str04s, bi.str04n, bi.fldGrpCVstr04t);
        rglsnr(bi.str05s, bi.str05n, bi.fldGrpCVstr05t);
        rglsnr(bi.str06s, bi.str06n, bi.fldGrpCVstr06t);
        rglsnr(bi.str07s, bi.str07n, bi.fldGrpCVstr07t);
        rglsnr(bi.str08s, bi.str08n, bi.fldGrpCVstr08t);
        rglsnr(bi.str09s, bi.str09n, bi.fldGrpCVstr09t);*/
    }


    private void rglsnr(RadioGroup rg, RadioButton rb, CardView cv) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(cv);
            cv.setVisibility(View.GONE);
            if (rb.getId() == i) {
                cv.setVisibility(View.VISIBLE);
            }
        });

    }


    private void saveDraft() {
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SG, form.sGtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!addForm()) return;
        saveDraft();
        if (updateDB()) {
            setResult(2);
            finish();
            startActivity(new Intent(this, MainActivity.class));
            //startActivity(new Intent(this, RegisterActivity.class));
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
        //startActivity(new Intent(this, RegisterActivity.class));
    }


    private boolean bothValueCheck(EditTextPicker edx1, EditTextPicker edx2) {
        if (!edx1.getText().toString().isEmpty() || !edx2.getText().toString().isEmpty()) {
            if (Integer.parseInt(edx1.getText().toString()) + Integer.parseInt(edx2.getText().toString()) == 0)
                return Validator.emptyCustomTextBox(this, edx1, "Both Values Can't be Zero");
            else return true;
        }
        return true;
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
       /* if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!bothValueCheck(bi.str01d, bi.str01m)) return false;
        if (!bothValueCheck(bi.str02d, bi.str02m)) return false;
        if (!bothValueCheck(bi.str03d, bi.str03m)) return false;
        if (!bothValueCheck(bi.str04d, bi.str04m)) return false;
        if (!bothValueCheck(bi.str05d, bi.str05m)) return false;
        if (!bothValueCheck(bi.str06d, bi.str06m)) return false;
        if (!bothValueCheck(bi.str07d, bi.str07m)) return false;
        if (!bothValueCheck(bi.str08d, bi.str08m)) return false;
        return bothValueCheck(bi.str09d, bi.str09m);*/
    }


    private boolean addForm() {
        if (!form.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
        long rowid = db.addForm(form);
        form.setId(String.valueOf(rowid));
        if (rowid > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(Form.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }
}
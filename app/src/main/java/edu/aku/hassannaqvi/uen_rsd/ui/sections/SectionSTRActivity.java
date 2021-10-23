package edu.aku.hassannaqvi.uen_rsd.ui.sections;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

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

import edu.aku.hassannaqvi.uen_rsd.R;
import edu.aku.hassannaqvi.uen_rsd.data.model.Form;
import edu.aku.hassannaqvi.uen_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivitySectionStrBinding;


public class SectionSTRActivity extends AppCompatActivity {
    ActivitySectionStrBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_str);
        setupSkips();
        setSupportActionBar(bi.toolbar);
    }


    private void setupSkips() {
        rglsnr(bi.str01s, bi.str01n, bi.fldGrpCVstr01t);
        rglsnr(bi.str02s, bi.str02n, bi.fldGrpCVstr02t);
        rglsnr(bi.str03s, bi.str03n, bi.fldGrpCVstr03t);
        rglsnr(bi.str04s, bi.str04n, bi.fldGrpCVstr04t);
        rglsnr(bi.str05s, bi.str05n, bi.fldGrpCVstr05t);
        rglsnr(bi.str06s, bi.str06n, bi.fldGrpCVstr06t);
        rglsnr(bi.str07s, bi.str07n, bi.fldGrpCVstr07t);
        rglsnr(bi.str08s, bi.str08n, bi.fldGrpCVstr08t);
        rglsnr(bi.str09s, bi.str09n, bi.fldGrpCVstr09t);


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

        form.setStr01s(bi.str01y.isChecked() ? "1"
                : bi.str01n.isChecked() ? "2"
                : "-1");

        form.setStr01d(bi.str01d.getText().toString().isEmpty() ? "-1" : bi.str01d.getText().toString());
        form.setStr01m(bi.str01m.getText().toString().isEmpty() ? "-1" : bi.str01m.getText().toString());
        form.setStr02s(bi.str02y.isChecked() ? "1"
                : bi.str02n.isChecked() ? "2"
                : "-1");

        form.setStr02d(bi.str02d.getText().toString().isEmpty() ? "-1" : bi.str02d.getText().toString());
        form.setStr02m(bi.str02m.getText().toString().isEmpty() ? "-1" : bi.str02m.getText().toString());
        form.setStr03s(bi.str03y.isChecked() ? "1"
                : bi.str03n.isChecked() ? "2"
                : "-1");

        form.setStr03d(bi.str03d.getText().toString().isEmpty() ? "-1" : bi.str03d.getText().toString());
        form.setStr03m(bi.str03m.getText().toString().isEmpty() ? "-1" : bi.str03m.getText().toString());
        form.setStr04s(bi.str04y.isChecked() ? "1"
                : bi.str04n.isChecked() ? "2"
                : "-1");

        form.setStr04d(bi.str04d.getText().toString().isEmpty() ? "-1" : bi.str04d.getText().toString());
        form.setStr04m(bi.str04m.getText().toString().isEmpty() ? "-1" : bi.str04m.getText().toString());
        form.setStr05s(bi.str05y.isChecked() ? "1"
                : bi.str05n.isChecked() ? "2"
                : "-1");

        form.setStr05d(bi.str05d.getText().toString().isEmpty() ? "-1" : bi.str05d.getText().toString());
        form.setStr05m(bi.str05m.getText().toString().isEmpty() ? "-1" : bi.str05m.getText().toString());
        form.setStr06s(bi.str06y.isChecked() ? "1"
                : bi.str06n.isChecked() ? "2"
                : "-1");

        form.setStr06d(bi.str06d.getText().toString().isEmpty() ? "-1" : bi.str06d.getText().toString());
        form.setStr06m(bi.str06m.getText().toString().isEmpty() ? "-1" : bi.str06m.getText().toString());
        form.setStr07s(bi.str07y.isChecked() ? "1"
                : bi.str07n.isChecked() ? "2"
                : "-1");

        form.setStr07d(bi.str07d.getText().toString().isEmpty() ? "-1" : bi.str07d.getText().toString());
        form.setStr07m(bi.str07m.getText().toString().isEmpty() ? "-1" : bi.str07m.getText().toString());
        form.setStr08s(bi.str08y.isChecked() ? "1"
                : bi.str08n.isChecked() ? "2"
                : "-1");

        form.setStr08d(bi.str08d.getText().toString().isEmpty() ? "-1" : bi.str08d.getText().toString());
        form.setStr08m(bi.str08m.getText().toString().isEmpty() ? "-1" : bi.str08m.getText().toString());
        form.setStr09s(bi.str09y.isChecked() ? "1"
                : bi.str09n.isChecked() ? "2"
                : "-1");

        form.setStr09d(bi.str09d.getText().toString().isEmpty() ? "-1" : bi.str09d.getText().toString());
        form.setStr09m(bi.str09m.getText().toString().isEmpty() ? "-1" : bi.str09m.getText().toString());


    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SSTR, form.sSTRtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        if (!addForm()) return;
        saveDraft();
        if (updateDB()) {
            setResult(2);
            finish();
            // startActivity(new Intent(this, RegisterActivity.class));
        }
    }


    public void BtnEnd(View view) {
        finish();
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
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!bothValueCheck(bi.str01d, bi.str01m)) return false;
        if (!bothValueCheck(bi.str02d, bi.str02m)) return false;
        if (!bothValueCheck(bi.str03d, bi.str03m)) return false;
        if (!bothValueCheck(bi.str04d, bi.str04m)) return false;
        if (!bothValueCheck(bi.str05d, bi.str05m)) return false;
        if (!bothValueCheck(bi.str06d, bi.str06m)) return false;
        if (!bothValueCheck(bi.str07d, bi.str07m)) return false;
        if (!bothValueCheck(bi.str08d, bi.str08m)) return false;
        return bothValueCheck(bi.str09d, bi.str09m);
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
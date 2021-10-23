package edu.aku.hassannaqvi.uen_rsd.ui.sections;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.uen_rsd.R;
import edu.aku.hassannaqvi.uen_rsd.data.model.Form;
import edu.aku.hassannaqvi.uen_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivitySectionFprBinding;

public class SectionFPRActivity extends AppCompatActivity {
    ActivitySectionFprBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_fpr);
        setupSkips();
        setSupportActionBar(bi.toolbar);
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setFpr01(bi.fpr01.getText().toString().isEmpty() ? "-1" : bi.fpr01.getText().toString());
        form.setFpr0197(bi.fpr0197.isChecked() ? "97" : "-1");

        form.setFpr02(bi.fpr02.getText().toString().isEmpty() ? "-1" : bi.fpr02.getText().toString());
        form.setFpr0297(bi.fpr0297.isChecked() ? "97" : "-1");

        form.setFpr03(bi.fpr03.getText().toString().isEmpty() ? "-1" : bi.fpr03.getText().toString());
        form.setFpr0397(bi.fpr0397.isChecked() ? "97" : "-1");

        form.setFpr04(bi.fpr04.getText().toString().isEmpty() ? "-1" : bi.fpr04.getText().toString());
        form.setFpr0497(bi.fpr0497.isChecked() ? "97" : "-1");

        form.setFpr05(bi.fpr05.getText().toString().isEmpty() ? "-1" : bi.fpr05.getText().toString());
        form.setFpr0597(bi.fpr0597.isChecked() ? "97" : "-1");

        form.setFpr06(bi.fpr06.getText().toString().isEmpty() ? "-1" : bi.fpr06.getText().toString());
        form.setFpr0697(bi.fpr0697.isChecked() ? "97" : "-1");

        form.setFpr07(bi.fpr07.getText().toString().isEmpty() ? "-1" : bi.fpr07.getText().toString());
        form.setFpr0797(bi.fpr0797.isChecked() ? "97" : "-1");

        form.setFpr08(bi.fpr08.getText().toString().isEmpty() ? "-1" : bi.fpr08.getText().toString());
        form.setFpr0897(bi.fpr0897.isChecked() ? "97" : "-1");

        form.setFpr09(bi.fpr09.getText().toString().isEmpty() ? "-1" : bi.fpr09.getText().toString());
        form.setFpr0997(bi.fpr0997.isChecked() ? "97" : "-1");

        form.setFpr10(bi.fpr10.getText().toString().isEmpty() ? "-1" : bi.fpr10.getText().toString());
        form.setFpr1097(bi.fpr1097.isChecked() ? "97" : "-1");

        form.setFpr11(bi.fpr11.getText().toString().isEmpty() ? "-1" : bi.fpr11.getText().toString());
        form.setFpr1197(bi.fpr1197.isChecked() ? "97" : "-1");

    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SFPR, form.sFPRtoString());
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
            //startActivity(new Intent(this, RegisterActivity.class));
        }
    }


    public void BtnEnd(View view) {
        finish();
        //  startActivity(new Intent(this, RegisterActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
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
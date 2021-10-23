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
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivitySectionObsBinding;


public class SectionOBSActivity extends AppCompatActivity {
    ActivitySectionObsBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_obs);
        setupSkips();
        setSupportActionBar(bi.toolbar);
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setObs01(bi.obs01.getText().toString().isEmpty() ? "-1" : bi.obs01.getText().toString());
        form.setObs0197(bi.obs0197.isChecked() ? "97" : "-1");

        form.setObs02(bi.obs02.getText().toString().isEmpty() ? "-1" : bi.obs02.getText().toString());
        form.setObs0297(bi.obs0297.isChecked() ? "97" : "-1");

        form.setObs03(bi.obs03.getText().toString().isEmpty() ? "-1" : bi.obs03.getText().toString());
        form.setObs0397(bi.obs0397.isChecked() ? "97" : "-1");

        form.setObs04(bi.obs04.getText().toString().isEmpty() ? "-1" : bi.obs04.getText().toString());
        form.setObs0497(bi.obs0497.isChecked() ? "97" : "-1");

        form.setObs05(bi.obs05.getText().toString().isEmpty() ? "-1" : bi.obs05.getText().toString());
        form.setObs0597(bi.obs0597.isChecked() ? "97" : "-1");

        form.setObs06(bi.obs06.getText().toString().isEmpty() ? "-1" : bi.obs06.getText().toString());
        form.setObs0697(bi.obs0697.isChecked() ? "97" : "-1");

        form.setObs07(bi.obs07.getText().toString().isEmpty() ? "-1" : bi.obs07.getText().toString());
        form.setObs0797(bi.obs0797.isChecked() ? "97" : "-1");

        form.setObs08(bi.obs08.getText().toString().isEmpty() ? "-1" : bi.obs08.getText().toString());
        form.setObs0897(bi.obs0897.isChecked() ? "97" : "-1");

        form.setObs09(bi.obs09.getText().toString().isEmpty() ? "-1" : bi.obs09.getText().toString());
        form.setObs0997(bi.obs0997.isChecked() ? "97" : "-1");

        form.setObs10(bi.obs10.getText().toString().isEmpty() ? "-1" : bi.obs10.getText().toString());
        form.setObs1097(bi.obs1097.isChecked() ? "97" : "-1");

        form.setObs11(bi.obs11.getText().toString().isEmpty() ? "-1" : bi.obs11.getText().toString());
        form.setObs1197(bi.obs1197.isChecked() ? "97" : "-1");

        form.setObs12(bi.obs12.getText().toString().isEmpty() ? "-1" : bi.obs12.getText().toString());
        form.setObs1297(bi.obs1297.isChecked() ? "97" : "-1");

        form.setObs13(bi.obs13.getText().toString().isEmpty() ? "-1" : bi.obs13.getText().toString());
        form.setObs1397(bi.obs1397.isChecked() ? "97" : "-1");

        form.setObs14(bi.obs14.getText().toString().isEmpty() ? "-1" : bi.obs14.getText().toString());
        form.setObs1497(bi.obs1497.isChecked() ? "97" : "-1");

        form.setObs15(bi.obs15.getText().toString().isEmpty() ? "-1" : bi.obs15.getText().toString());
        form.setObs1597(bi.obs1597.isChecked() ? "97" : "-1");

        form.setObs16(bi.obs16.getText().toString().isEmpty() ? "-1" : bi.obs16.getText().toString());
        form.setObs1697(bi.obs1697.isChecked() ? "97" : "-1");

        form.setObs17(bi.obs17.getText().toString().isEmpty() ? "-1" : bi.obs17.getText().toString());
        form.setObs1797(bi.obs1797.isChecked() ? "97" : "-1");

        form.setObs18(bi.obs18.getText().toString().isEmpty() ? "-1" : bi.obs18.getText().toString());
        form.setObs1897(bi.obs1897.isChecked() ? "97" : "-1");

        form.setObs19(bi.obs19.getText().toString().isEmpty() ? "-1" : bi.obs19.getText().toString());
        form.setObs1997(bi.obs1997.isChecked() ? "97" : "-1");

        form.setObs20(bi.obs20.getText().toString().isEmpty() ? "-1" : bi.obs20.getText().toString());
        form.setObs2097(bi.obs2097.isChecked() ? "97" : "-1");

    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SOBS, form.sOBStoString());
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
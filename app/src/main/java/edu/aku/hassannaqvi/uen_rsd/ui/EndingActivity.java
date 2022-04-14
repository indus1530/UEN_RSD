package edu.aku.hassannaqvi.uen_rsd.ui;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import net.sqlcipher.database.SQLiteException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_rsd.R;
import edu.aku.hassannaqvi.uen_rsd.core.MainApp;
import edu.aku.hassannaqvi.uen_rsd.data.model.EntryLog;
import edu.aku.hassannaqvi.uen_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivityEndingBinding;


public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    int sectionMainCheck;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);
        bi.setForm(MainApp.form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        boolean check = getIntent().getBooleanExtra("complete", false);
        //sectionMainCheck = getIntent().getIntExtra(SECTION_MAIN_CHECK_FOR_END, 0);

        if (check) {
            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(false);
            /*bi.istatusc.setEnabled(false);*/
        } else {
            bi.istatusa.setEnabled(false);
            bi.istatusb.setEnabled(true);
            /*bi.istatusc.setEnabled(true);*/
            bi.btnEnd.setBackgroundColor(getResources().getColor(R.color.redLight));
        }

    }

    private void saveDraft() {

        form.setiStatus(bi.istatusa.isChecked() ? "1"
                : bi.istatusb.isChecked() ? "2"
                /*: bi.istatusc.isChecked() ? "3"*/
                : "-1");
        form.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));

    }


    public void BtnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            recordEntry();
            finish();
     //       gotoActivity(this, MainActivity.class);
        } else {
            Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        //int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_ISTATUS, form.getiStatus());
        int updcount = db.updateEnding();
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    private void recordEntry() {

        EntryLog entryLog = new EntryLog();
        entryLog.populateMetaHHForm();
        Long rowId = null;
        try {
            rowId = db.addEntryLog(entryLog);
        } catch (SQLiteException e) {
            Toast.makeText(this, "SQLiteException(EntryLog)" + entryLog, Toast.LENGTH_SHORT).show();
        }
        if (rowId != -1) {
            entryLog.setId(String.valueOf(rowId));
            entryLog.setUid(entryLog.getDeviceId() + entryLog.getId());
            db.updatesEntryLogColumn(EntryLog.EntryLogTable.COLUMN_UID, entryLog.getUid(), entryLog.getId());
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}

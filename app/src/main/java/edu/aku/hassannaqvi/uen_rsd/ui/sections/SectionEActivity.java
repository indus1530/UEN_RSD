package edu.aku.hassannaqvi.uen_rsd.ui.sections;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.uen_rsd.R;
import edu.aku.hassannaqvi.uen_rsd.data.model.Form;
import edu.aku.hassannaqvi.uen_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivitySectionEBinding;
import edu.aku.hassannaqvi.uen_rsd.ui.RegisterActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.TakePhoto;


public class SectionEActivity extends AppCompatActivity {
    ActivitySectionEBinding bi;
    private int PhotoSerial = 0;
    private String photolist;
    ActivityResultLauncher<Intent> takePhotoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();

                        Toast.makeText(SectionEActivity.this, "Photo Taken", Toast.LENGTH_SHORT).show();

                        String fileName = data.getStringExtra("FileName");
                        //   photolist = photolist + fileName + ";";
                        PhotoSerial++;

                        bi.f5image.setText(bi.f5image.getText().toString() + PhotoSerial + " - " + fileName + ";\r\n");
                    } else {
                        Toast.makeText(SectionEActivity.this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                        //TODO: Implement functionality below when photo was not taken
                        // ...
                        bi.f5image.setText("Photo not taken.");
                    }

                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(SectionEActivity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e);
        bi.setCallback(this);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        setupSkips();
    }


    private void setupSkips() {
        bi.imgcheck.setOnCheckedChangeListener((compoundButton, b) -> bi.f5image.setEnabled(!b));
    }


    private void saveDraft() {
    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SE, form.sEtoString());
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
            setResult(RESULT_OK);
            finish();
       //     startActivity(new Intent(this, RegisterActivity.class));
        }
    }


    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
        //startActivity(new Intent(this, RegisterActivity.class));
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


/*    public void takePhoto(View view) {
        Intent intent = new Intent(this, TakePhoto.class);
        *//*intent.putExtra("picID", info.getCluster() + "_" + info.getHhno() + "_" + info.getCb01() + "_");
        intent.putExtra("childName", info.getCb02());*//*
        intent.putExtra("picID", bi.f5image.getId() + "_" + bi.txtf5image.getId() + "_" + R.string.f1title + "_");
        intent.putExtra("imgName", R.string.f5image);
        intent.putExtra("picView", view.getId());
        startActivityForResult(intent, 1); // Activity is started with requestCode 1 = Front
    }*/

    public void takePhoto(View view) {

        Intent intent = new Intent(this, TakePhoto.class);
        intent.putExtra("picID", form.getHfCode() + "_" + form.getReportingMonth());
        intent.putExtra("id", form.getHfCode() + "_" + form.getReportingMonth());

        //TODO: Change string (R.string.fXtitle)
        intent.putExtra("picView", this.getResources().getString(R.string.f5title));

        takePhotoLauncher.launch(intent);

    }

/*    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_CANCELED) {
            Toast.makeText(this, requestCode + "_" + resultCode, Toast.LENGTH_SHORT).show();
            String fileName = data.getStringExtra("FileName");
            if (requestCode == 1 && resultCode == 1) {
                photoCount++;
                if (photoCount > 0) bi.imgcheck.setVisibility(View.GONE);
                bi.txtf5image.setText(photoCount + " - " + fileName);
                bi.txtf5image.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                if (photoCount == 5) bi.f5image.setEnabled(false);
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();
            } else if (requestCode == 1 && resultCode != 1) {
                photoCount = 0;
                bi.f5image.setEnabled(true);
                bi.txtf5image.setText(bi.txtf5image.getText().toString());
                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();
            }
        } else {
            if (photoCount == 0) bi.imgcheck.setVisibility(View.VISIBLE);
            bi.txtf5image.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.camera_unchecked, 0, 0);
            bi.f5image.setEnabled(true);
            bi.txtf5image.setText(bi.txtf5image.getText().toString());
            Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();
        }
    }*/

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
        finish();
    }

}
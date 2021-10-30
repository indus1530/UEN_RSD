package edu.aku.hassannaqvi.uen_rsd.ui;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_rsd.R;
import edu.aku.hassannaqvi.uen_rsd.core.MainApp;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivityRegisterBinding;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionBActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionC1Activity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionDActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionEActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionFActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionGActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionHActivity;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    ActivityRegisterBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_register);
        bi.setCallback(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: test1");
        if (form.getiStatus().equals("1")) {
            bi.btnContinue.setVisibility(View.GONE);
            bi.btnEnd.setVisibility(View.GONE);
        }
        updateSections();

    }

    private void updateSections() {

        try {
            if (!new JSONObject(form.sAtoString()).get("f106").equals("")) {
                bi.formA.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
             //   bi.formAv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                //bi.checkedAv.setvisibility(View.VISIBLE);
                bi.checkedAv.setVisibility(View.VISIBLE);
            }

            if (!new JSONObject(form.sBtoString()).get("f203").equals("")) {
                bi.formB.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
             // bi.formBv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedBv.setVisibility(View.VISIBLE);

            }

            if (!new JSONObject(form.sCtoString()).get("f342").equals("")) {
                bi.formC.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
            //    bi.formCv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedCv.setVisibility(View.VISIBLE);

            }

            if (!new JSONObject(form.sDtoString()).get("f419").equals("")) {
                bi.formD.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
              //  bi.formDv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedDv.setVisibility(View.VISIBLE);

            }

            if (!new JSONObject(form.sEtoString()).get("f516").equals("")) {
                bi.formE.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
             //   bi.formEv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedEv.setVisibility(View.VISIBLE);

            }

            if (!new JSONObject(form.sFtoString()).get("f603").equals("")) {
                bi.formF.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
            //    bi.formFv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedFv.setVisibility(View.VISIBLE);

            }

            if (!new JSONObject(form.sGtoString()).get("f705").equals("")) {
                bi.formG.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
            //   bi.formGv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedGv.setVisibility(View.VISIBLE);

            }

            if (!new JSONObject(form.sHtoString()).get("f8091").equals("")) {
                bi.formH.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
              //  bi.formHv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.camera_checked, 0, 0, 0);
                bi.checkedHv.setVisibility(View.VISIBLE);

            }
            if (!bi.formA.isEnabled()
                    && !bi.formB.isEnabled()
                    && !bi.formC.isEnabled()
                    && !bi.formD.isEnabled()
                    && !bi.formE.isEnabled()
                    && !bi.formF.isEnabled()
                    && !bi.formG.isEnabled()
                    && !bi.formH.isEnabled()
            ) bi.btnEnd.setVisibility(View.GONE);

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnContinue() {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
    }


    public void BtnEnd() {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        //MainApp.endActivity(this, EndingActivity.class).putExtra("complete", false);

    }


    public void openRegister(View view) {
        Intent oF = new Intent();
        int REQUEST_CODE = 0;
        if (!MainApp.user.getUserName().equals("0000")) {
            switch (view.getId()) {
                case R.id.formA:
                    oF = new Intent(this, SectionAActivity.class);
                    REQUEST_CODE = 1;
                    break;
                case R.id.formB:
                    oF = new Intent(this, SectionBActivity.class);
                    REQUEST_CODE = 2;
                    break;
                case R.id.formC:
                    oF = new Intent(this, SectionC1Activity.class);
                    REQUEST_CODE = 3;
                    break;
                case R.id.formD:
                    oF = new Intent(this, SectionDActivity.class);
                    REQUEST_CODE = 4;
                    break;
                case R.id.formE:
                    oF = new Intent(this, SectionEActivity.class);
                    REQUEST_CODE = 5;
                    break;
                case R.id.formF:
                    oF = new Intent(this, SectionFActivity.class);
                    REQUEST_CODE = 6;
                    break;
                case R.id.formG:
                    oF = new Intent(this, SectionGActivity.class);
                    REQUEST_CODE = 7;
                    break;
                case R.id.formH:
                    oF = new Intent(this, SectionHActivity.class);
                    REQUEST_CODE = 8;
                    break;
            }
            startActivityForResult(oF, REQUEST_CODE);
        } else {
            Toast.makeText(this, "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
      //  Log.d(TAG, "onActivityResult: test1");
        updateSections();
        if (resultCode == RESULT_OK
                && !bi.formA.isEnabled()
                && !bi.formB.isEnabled()
                && !bi.formC.isEnabled()
                && !bi.formD.isEnabled()
                && !bi.formE.isEnabled()
                && !bi.formF.isEnabled()
                && !bi.formG.isEnabled()
                && !bi.formH.isEnabled()
                && !form.getiStatus().equals("1")
        ) {
            bi.btnContinue.setVisibility(View.VISIBLE);
        } else {
            bi.btnContinue.setVisibility(View.GONE);
            //Toast.makeText(this, "Enabled!", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Not Allowed!")
                .setMessage("Going back is not allowed here.")
                .setPositiveButton(android.R.string.ok, null).create().show();
    }

}

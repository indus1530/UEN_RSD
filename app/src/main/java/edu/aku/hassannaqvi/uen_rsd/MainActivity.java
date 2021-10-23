package edu.aku.hassannaqvi.uen_rsd;

import static edu.aku.hassannaqvi.uen_rsd.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.uen_rsd.core.AndroidManager;
import edu.aku.hassannaqvi.uen_rsd.core.MainApp;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionCFPActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionEPIActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionFPRActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionIdentificationActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionOBSActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionSHFActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (MainApp.admin) {
            findViewById(R.id.adminView).setVisibility(View.VISIBLE);
        }
    }


    /*public void sectionPress(View view) {
        finish();
        startActivity(new Intent(this, SectionIdentificationActivity.class));
    }*/


    public void sectionPress(View v) {
        Intent oF = null;
        switch (v.getId()) {
            case R.id.openForm:
                oF = new Intent(this, SectionIdentificationActivity.class);
                break;
            case R.id.sec1:
                oF = new Intent(this, SectionAActivity.class);
                break;
            case R.id.sec2:
                if (form == null)
                    oF = new Intent(this, SectionEPIActivity.class);
                break;
            case R.id.sec3:
                if (form == null)
                    oF = new Intent(this, SectionSHFActivity.class);
                break;
            case R.id.sec4:
                if (form == null)
                    oF = new Intent(this, SectionOBSActivity.class);
                break;
            case R.id.sec5:
                if (form == null)
                    oF = new Intent(this, SectionFPRActivity.class);
                break;
            case R.id.onhold:
                if (form == null)
                    oF = new Intent(this, SectionCFPActivity.class);
                break;
            case R.id.openDBManager:
                if (form == null)
                    oF = new Intent(this, AndroidManager.class);
                break;
        }
        //finish();
        startActivity(oF);
    }


}
package edu.aku.hassannaqvi.uen_rsd;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.uen_rsd.core.AndroidManager;
import edu.aku.hassannaqvi.uen_rsd.core.MainApp;
import edu.aku.hassannaqvi.uen_rsd.data.model.Form;
import edu.aku.hassannaqvi.uen_rsd.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.uen_rsd.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.uen_rsd.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.SyncActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionBActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionC1Activity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionDActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionEActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionFActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionGActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionHActivity;
import edu.aku.hassannaqvi.uen_rsd.ui.sections.SectionIdentificationActivity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

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
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionIdentificationActivity.class));
                break;
            case R.id.seca:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionAActivity.class));
                break;
            case R.id.secb:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBActivity.class));
                break;
            case R.id.secc:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC1Activity.class));
                break;
            case R.id.secd:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionDActivity.class));
                break;
            case R.id.sece:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionEActivity.class));
                break;
            case R.id.secf:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionFActivity.class));
                break;
            case R.id.secg:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionGActivity.class));
                break;
            case R.id.sech:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionHActivity.class));
                break;
            case R.id.openDBManager:
                MainApp.form = new Form();
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidDatabaseManager.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;
    }

}
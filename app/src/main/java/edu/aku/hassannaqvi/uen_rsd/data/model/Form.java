package edu.aku.hassannaqvi.uen_rsd.data.model;


import android.database.Cursor;
import android.provider.BaseColumns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;

import edu.aku.hassannaqvi.uen_rsd.BR;
import edu.aku.hassannaqvi.uen_rsd.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    //Not saving in DB
    private final LocalDate localDate = null;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String districtCode = StringUtils.EMPTY;
    private String districtName = StringUtils.EMPTY;
    private String hfCode = StringUtils.EMPTY;
    private String hfName = StringUtils.EMPTY;
    private String reportingMonth = StringUtils.EMPTY;
    private String reportingYear = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;


    // SECTION VARIABLES
    private String sMHR = StringUtils.EMPTY; //Maternal Health Register
    private String sEPI = StringUtils.EMPTY; //EPI Health Register
    private String sSHF = StringUtils.EMPTY; //Secondary healthcare facilities- Ob/Gyn OPD register
    private String sOBS = StringUtils.EMPTY; //Obstetric Register
    private String sFPR = StringUtils.EMPTY; //FP Register
    private String sCFP = StringUtils.EMPTY; //Collect through Stickers new variables in DHIS
    private String sSTR = StringUtils.EMPTY; //Stock Out Registers

    // FIELD VARIABLES
    private String mhr01 = StringUtils.EMPTY;
    private String mhr0197 = StringUtils.EMPTY;
    private String mhr02 = StringUtils.EMPTY;
    private String mhr0297 = StringUtils.EMPTY;
    private String mhr03 = StringUtils.EMPTY;
    private String mhr0397 = StringUtils.EMPTY;
    private String mhr04 = StringUtils.EMPTY;
    private String mhr0497 = StringUtils.EMPTY;
    private String mhr05 = StringUtils.EMPTY;
    private String mhr0597 = StringUtils.EMPTY;
    private String epi01 = StringUtils.EMPTY;
    private String epi0197 = StringUtils.EMPTY;
    private String shf01 = StringUtils.EMPTY;
    private String shf0197 = StringUtils.EMPTY;
    private String shf02 = StringUtils.EMPTY;
    private String shf0297 = StringUtils.EMPTY;
    private String obs01 = StringUtils.EMPTY;
    private String obs0197 = StringUtils.EMPTY;
    private String obs02 = StringUtils.EMPTY;
    private String obs0297 = StringUtils.EMPTY;
    private String obs03 = StringUtils.EMPTY;
    private String obs0397 = StringUtils.EMPTY;
    private String obs04 = StringUtils.EMPTY;
    private String obs0497 = StringUtils.EMPTY;
    private String obs05 = StringUtils.EMPTY;
    private String obs0597 = StringUtils.EMPTY;
    private String obs06 = StringUtils.EMPTY;
    private String obs0697 = StringUtils.EMPTY;
    private String obs07 = StringUtils.EMPTY;
    private String obs0797 = StringUtils.EMPTY;
    private String obs08 = StringUtils.EMPTY;
    private String obs0897 = StringUtils.EMPTY;
    private String obs09 = StringUtils.EMPTY;
    private String obs0997 = StringUtils.EMPTY;
    private String obs10 = StringUtils.EMPTY;
    private String obs1097 = StringUtils.EMPTY;
    private String obs11 = StringUtils.EMPTY;
    private String obs1197 = StringUtils.EMPTY;
    private String obs12 = StringUtils.EMPTY;
    private String obs1297 = StringUtils.EMPTY;
    private String obs13 = StringUtils.EMPTY;
    private String obs1397 = StringUtils.EMPTY;
    private String obs14 = StringUtils.EMPTY;
    private String obs1497 = StringUtils.EMPTY;
    private String obs15 = StringUtils.EMPTY;
    private String obs1597 = StringUtils.EMPTY;
    private String obs16 = StringUtils.EMPTY;
    private String obs1697 = StringUtils.EMPTY;
    private String obs17 = StringUtils.EMPTY;
    private String obs1797 = StringUtils.EMPTY;
    private String obs18 = StringUtils.EMPTY;
    private String obs1897 = StringUtils.EMPTY;
    private String obs19 = StringUtils.EMPTY;
    private String obs1997 = StringUtils.EMPTY;
    private String obs20 = StringUtils.EMPTY;
    private String obs2097 = StringUtils.EMPTY;
    private String fpr01 = StringUtils.EMPTY;
    private String fpr0197 = StringUtils.EMPTY;
    private String fpr02 = StringUtils.EMPTY;
    private String fpr0297 = StringUtils.EMPTY;
    private String fpr03 = StringUtils.EMPTY;
    private String fpr0397 = StringUtils.EMPTY;
    private String fpr04 = StringUtils.EMPTY;
    private String fpr0497 = StringUtils.EMPTY;
    private String fpr05 = StringUtils.EMPTY;
    private String fpr0597 = StringUtils.EMPTY;
    private String fpr06 = StringUtils.EMPTY;
    private String fpr0697 = StringUtils.EMPTY;
    private String fpr07 = StringUtils.EMPTY;
    private String fpr0797 = StringUtils.EMPTY;
    private String fpr08 = StringUtils.EMPTY;
    private String fpr0897 = StringUtils.EMPTY;
    private String fpr09 = StringUtils.EMPTY;
    private String fpr0997 = StringUtils.EMPTY;
    private String fpr10 = StringUtils.EMPTY;
    private String fpr1097 = StringUtils.EMPTY;
    private String fpr11 = StringUtils.EMPTY;
    private String fpr1197 = StringUtils.EMPTY;
    private String cfp01 = StringUtils.EMPTY;
    private String cfp0197 = StringUtils.EMPTY;
    private String cfp02 = StringUtils.EMPTY;
    private String cfp0297 = StringUtils.EMPTY;
    private String cfp03 = StringUtils.EMPTY;
    private String cfp0397 = StringUtils.EMPTY;
    private String str01s = StringUtils.EMPTY;
    private String str01d = StringUtils.EMPTY;
    private String str01m = StringUtils.EMPTY;
    private String str02s = StringUtils.EMPTY;
    private String str02d = StringUtils.EMPTY;
    private String str02m = StringUtils.EMPTY;
    private String str03s = StringUtils.EMPTY;
    private String str03d = StringUtils.EMPTY;
    private String str03m = StringUtils.EMPTY;
    private String str04s = StringUtils.EMPTY;
    private String str04d = StringUtils.EMPTY;
    private String str04m = StringUtils.EMPTY;
    private String str05s = StringUtils.EMPTY;
    private String str05d = StringUtils.EMPTY;
    private String str05m = StringUtils.EMPTY;
    private String str06s = StringUtils.EMPTY;
    private String str06d = StringUtils.EMPTY;
    private String str06m = StringUtils.EMPTY;
    private String str07s = StringUtils.EMPTY;
    private String str07d = StringUtils.EMPTY;
    private String str07m = StringUtils.EMPTY;
    private String str08s = StringUtils.EMPTY;
    private String str08d = StringUtils.EMPTY;
    private String str08m = StringUtils.EMPTY;
    private String str09s = StringUtils.EMPTY;
    private String str09d = StringUtils.EMPTY;
    private String str09m = StringUtils.EMPTY;
    private transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();


    public Form() {

    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    @Bindable
    public String getUid() {
        return uid;
    }

    public Form setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public Form setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public Form setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public Form setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public Form setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getReportingMonth() {
        return reportingMonth;
    }

    public Form setReportingMonth(String reportingMonth) {
        this.reportingMonth = reportingMonth;
        return this;
    }

    @Bindable
    public String getReportingYear() {
        return reportingYear;
    }

    public Form setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public Form setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public Form setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    @Bindable
    public String getsMHR() {
        return sMHR;
    }

    public Form setsMHR(String sMHR) {
        this.sMHR = sMHR;
        return this;
    }

    @Bindable
    public String getsEPI() {
        return sEPI;
    }

    public void setsEPI(String sEPI) {
        this.sEPI = sEPI;
        notifyChange(BR.sEPI);
    }

    @Bindable
    public String getsSHF() {
        return sSHF;
    }

    public void setsSHF(String sSHF) {
        this.sSHF = sSHF;
        notifyChange(BR.sSHF);
    }

    @Bindable
    public String getsOBS() {
        return sOBS;
    }

    public void setsOBS(String sOBS) {
        this.sOBS = sOBS;
        notifyChange(BR.sOBS);
    }

    @Bindable
    public String getsFPR() {
        return sFPR;
    }

    public void setsFPR(String sFPR) {
        this.sFPR = sFPR;
        notifyChange(BR.sFPR);
    }

    @Bindable
    public String getsCFP() {
        return sCFP;
    }

    public void setsCFP(String sCFP) {
        this.sCFP = sCFP;
        notifyChange(BR.sCFP);
    }

    @Bindable
    public String getsSTR() {
        return sSTR;
    }

    public void setsSTR(String sSTR) {
        this.sSTR = sSTR;
        notifyChange(BR.sSTR);
    }


    @Bindable
    public String getMhr01() {
        return mhr01;
    }

    public void setMhr01(String mhr01) {
        this.mhr01 = mhr01;
        notifyPropertyChanged(BR.mhr01);
    }


    @Bindable
    public String getMhr0197() {
        return mhr0197;
    }

    public void setMhr0197(String mhr0197) {
        this.mhr0197 = mhr0197;
        notifyPropertyChanged(BR.mhr0197);
    }

    @Bindable
    public String getMhr02() {
        return mhr02;
    }

    public void setMhr02(String mhr02) {
        this.mhr02 = mhr02;
        notifyPropertyChanged(BR.mhr02);
    }

    @Bindable
    public String getMhr0297() {
        return mhr0297;
    }

    public void setMhr0297(String mhr0297) {
        this.mhr0297 = mhr0297;
        notifyPropertyChanged(BR.mhr0297);
    }

    @Bindable
    public String getMhr03() {
        return mhr03;
    }

    public void setMhr03(String mhr03) {
        this.mhr03 = mhr03;
        notifyPropertyChanged(BR.mhr03);
    }

    @Bindable
    public String getMhr0397() {
        return mhr0397;
    }

    public void setMhr0397(String mhr0397) {
        this.mhr0397 = mhr0397;
        notifyPropertyChanged(BR.mhr0397);
    }

    @Bindable
    public String getMhr04() {
        return mhr04;
    }

    public void setMhr04(String mhr04) {
        this.mhr04 = mhr04;
        notifyPropertyChanged(BR.mhr04);
    }


    @Bindable
    public String getMhr0497() {
        return mhr0497;
    }

    public void setMhr0497(String mhr0497) {
        this.mhr0497 = mhr0497;
        notifyPropertyChanged(BR.mhr0497);
    }

    @Bindable
    public String getMhr05() {
        return mhr05;
    }

    public void setMhr05(String mhr05) {
        this.mhr05 = mhr05;
        notifyPropertyChanged(BR.mhr05);
    }


    @Bindable
    public String getMhr0597() {
        return mhr0597;
    }

    public void setMhr0597(String mhr0597) {
        this.mhr0597 = mhr0597;
        notifyPropertyChanged(BR.mhr0597);
    }

    @Bindable
    public String getEpi01() {
        return epi01;
    }

    public void setEpi01(String epi01) {
        this.epi01 = epi01;
        notifyPropertyChanged(BR.epi01);
    }


    @Bindable
    public String getEpi0197() {
        return epi0197;
    }

    public void setEpi0197(String epi0197) {
        this.epi0197 = epi0197;
        notifyPropertyChanged(BR.epi0197);
    }

    @Bindable
    public String getShf01() {
        return shf01;
    }

    public void setShf01(String shf01) {
        this.shf01 = shf01;
        notifyPropertyChanged(BR.shf01);
    }


    @Bindable
    public String getShf0197() {
        return shf0197;
    }

    public void setShf0197(String shf0197) {
        this.shf0197 = shf0197;
        notifyPropertyChanged(BR.shf0197);
    }

    @Bindable
    public String getShf02() {
        return shf02;
    }

    public void setShf02(String shf02) {
        this.shf02 = shf02;
        notifyPropertyChanged(BR.shf02);
    }


    @Bindable
    public String getShf0297() {
        return shf0297;
    }

    public void setShf0297(String shf0297) {
        this.shf0297 = shf0297;
        notifyPropertyChanged(BR.shf0297);
    }

    @Bindable
    public String getObs01() {
        return obs01;
    }

    public void setObs01(String obs01) {
        this.obs01 = obs01;
        notifyPropertyChanged(BR.obs01);
    }


    @Bindable
    public String getObs0197() {
        return obs0197;
    }

    public void setObs0197(String obs0197) {
        this.obs0197 = obs0197;
        notifyPropertyChanged(BR.obs0197);
    }

    @Bindable
    public String getObs02() {
        return obs02;
    }

    public void setObs02(String obs02) {
        this.obs02 = obs02;
        notifyPropertyChanged(BR.obs02);
    }


    @Bindable
    public String getObs0297() {
        return obs0297;
    }

    public void setObs0297(String obs0297) {
        this.obs0297 = obs0297;
        notifyPropertyChanged(BR.obs0297);
    }

    @Bindable
    public String getObs03() {
        return obs03;
    }

    public void setObs03(String obs03) {
        this.obs03 = obs03;
        notifyPropertyChanged(BR.obs03);
    }


    @Bindable
    public String getObs0397() {
        return obs0397;
    }

    public void setObs0397(String obs0397) {
        this.obs0397 = obs0397;
        notifyPropertyChanged(BR.obs0397);
    }

    @Bindable
    public String getObs04() {
        return obs04;
    }

    public void setObs04(String obs04) {
        this.obs04 = obs04;
        notifyPropertyChanged(BR.obs04);
    }


    @Bindable
    public String getObs0497() {
        return obs0497;
    }

    public void setObs0497(String obs0497) {
        this.obs0497 = obs0497;
        notifyPropertyChanged(BR.obs0497);
    }

    @Bindable
    public String getObs05() {
        return obs05;
    }

    public void setObs05(String obs05) {
        this.obs05 = obs05;
        notifyPropertyChanged(BR.obs05);
    }


    @Bindable
    public String getObs0597() {
        return obs0597;
    }

    public void setObs0597(String obs0597) {
        this.obs0597 = obs0597;
        notifyPropertyChanged(BR.obs0597);
    }

    @Bindable
    public String getObs06() {
        return obs06;
    }

    public void setObs06(String obs06) {
        this.obs06 = obs06;
        notifyPropertyChanged(BR.obs06);
    }


    @Bindable
    public String getObs0697() {
        return obs0697;
    }

    public void setObs0697(String obs0697) {
        this.obs0697 = obs0697;
        notifyPropertyChanged(BR.obs0697);
    }

    @Bindable
    public String getObs07() {
        return obs07;
    }

    public void setObs07(String obs07) {
        this.obs07 = obs07;
        notifyPropertyChanged(BR.obs07);
    }


    @Bindable
    public String getObs0797() {
        return obs0797;
    }

    public void setObs0797(String obs0797) {
        this.obs0797 = obs0797;
        notifyPropertyChanged(BR.obs0797);
    }

    @Bindable
    public String getObs08() {
        return obs08;
    }

    public void setObs08(String obs08) {
        this.obs08 = obs08;
        notifyPropertyChanged(BR.obs08);
    }


    @Bindable
    public String getObs0897() {
        return obs0897;
    }

    public void setObs0897(String obs0897) {
        this.obs0897 = obs0897;
        notifyPropertyChanged(BR.obs0897);
    }

    @Bindable
    public String getObs09() {
        return obs09;
    }

    public void setObs09(String obs09) {
        this.obs09 = obs09;
        notifyPropertyChanged(BR.obs09);
    }


    @Bindable
    public String getObs0997() {
        return obs0997;
    }

    public void setObs0997(String obs0997) {
        this.obs0997 = obs0997;
        notifyPropertyChanged(BR.obs0997);
    }

    @Bindable
    public String getObs10() {
        return obs10;
    }

    public void setObs10(String obs10) {
        this.obs10 = obs10;
        notifyPropertyChanged(BR.obs10);
    }


    @Bindable
    public String getObs1097() {
        return obs1097;
    }

    public void setObs1097(String obs1097) {
        this.obs1097 = obs1097;
        notifyPropertyChanged(BR.obs1097);
    }

    @Bindable
    public String getObs11() {
        return obs11;
    }

    public void setObs11(String obs11) {
        this.obs11 = obs11;
        notifyPropertyChanged(BR.obs11);
    }


    @Bindable
    public String getObs1197() {
        return obs1197;
    }

    public void setObs1197(String obs1197) {
        this.obs1197 = obs1197;
        notifyPropertyChanged(BR.obs1197);
    }

    @Bindable
    public String getObs12() {
        return obs12;
    }

    public void setObs12(String obs12) {
        this.obs12 = obs12;
        notifyPropertyChanged(BR.obs12);
    }


    @Bindable
    public String getObs1297() {
        return obs1297;
    }

    public void setObs1297(String obs1297) {
        this.obs1297 = obs1297;
        notifyPropertyChanged(BR.obs1297);
    }

    @Bindable
    public String getObs13() {
        return obs13;
    }

    public void setObs13(String obs13) {
        this.obs13 = obs13;
        notifyPropertyChanged(BR.obs13);
    }


    @Bindable
    public String getObs1397() {
        return obs1397;
    }

    public void setObs1397(String obs1397) {
        this.obs1397 = obs1397;
        notifyPropertyChanged(BR.obs1397);
    }

    @Bindable
    public String getObs14() {
        return obs14;
    }

    public void setObs14(String obs14) {
        this.obs14 = obs14;
        notifyPropertyChanged(BR.obs14);
    }


    @Bindable
    public String getObs1497() {
        return obs1497;
    }

    public void setObs1497(String obs1497) {
        this.obs1497 = obs1497;
        notifyPropertyChanged(BR.obs1497);
    }

    @Bindable
    public String getObs15() {
        return obs15;
    }

    public void setObs15(String obs15) {
        this.obs15 = obs15;
        notifyPropertyChanged(BR.obs15);
    }


    @Bindable
    public String getObs1597() {
        return obs1597;
    }

    public void setObs1597(String obs1597) {
        this.obs1597 = obs1597;
        notifyPropertyChanged(BR.obs1597);
    }

    @Bindable
    public String getObs16() {
        return obs16;
    }

    public void setObs16(String obs16) {
        this.obs16 = obs16;
        notifyPropertyChanged(BR.obs16);
    }


    @Bindable
    public String getObs1697() {
        return obs1697;
    }

    public void setObs1697(String obs1697) {
        this.obs1697 = obs1697;
        notifyPropertyChanged(BR.obs1697);
    }

    @Bindable
    public String getObs17() {
        return obs17;
    }

    public void setObs17(String obs17) {
        this.obs17 = obs17;
        notifyPropertyChanged(BR.obs17);
    }


    @Bindable
    public String getObs1797() {
        return obs1797;
    }

    public void setObs1797(String obs1797) {
        this.obs1797 = obs1797;
        notifyPropertyChanged(BR.obs1797);
    }

    @Bindable
    public String getObs18() {
        return obs18;
    }

    public void setObs18(String obs18) {
        this.obs18 = obs18;
        notifyPropertyChanged(BR.obs18);
    }


    @Bindable
    public String getObs1897() {
        return obs1897;
    }

    public void setObs1897(String obs1897) {
        this.obs1897 = obs1897;
        notifyPropertyChanged(BR.obs1897);
    }

    @Bindable
    public String getObs19() {
        return obs19;
    }

    public void setObs19(String obs19) {
        this.obs19 = obs19;
        notifyPropertyChanged(BR.obs19);
    }


    @Bindable
    public String getObs1997() {
        return obs1997;
    }

    public void setObs1997(String obs1997) {
        this.obs1997 = obs1997;
        notifyPropertyChanged(BR.obs1997);
    }

    @Bindable
    public String getObs20() {
        return obs20;
    }

    public void setObs20(String obs20) {
        this.obs20 = obs20;
        notifyPropertyChanged(BR.obs20);
    }


    @Bindable
    public String getObs2097() {
        return obs2097;
    }

    public void setObs2097(String obs2097) {
        this.obs2097 = obs2097;
        notifyPropertyChanged(BR.obs2097);
    }

    @Bindable
    public String getFpr01() {
        return fpr01;
    }

    public void setFpr01(String fpr01) {
        this.fpr01 = fpr01;
        notifyPropertyChanged(BR.fpr01);
    }

    @Bindable
    public String getFpr0197() {
        return fpr0197;
    }

    public void setFpr0197(String fpr0197) {
        this.fpr0197 = fpr0197;
        notifyPropertyChanged(BR.fpr0197);
    }

    @Bindable
    public String getFpr02() {
        return fpr02;
    }

    public void setFpr02(String fpr02) {
        this.fpr02 = fpr02;
        notifyPropertyChanged(BR.fpr02);
    }

    @Bindable
    public String getFpr0297() {
        return fpr0297;
    }

    public void setFpr0297(String fpr0297) {
        this.fpr0297 = fpr0297;
        notifyPropertyChanged(BR.fpr0297);
    }

    @Bindable
    public String getFpr03() {
        return fpr03;
    }

    public void setFpr03(String fpr03) {
        this.fpr03 = fpr03;
        notifyPropertyChanged(BR.fpr03);
    }

    @Bindable
    public String getFpr0397() {
        return fpr0397;
    }

    public void setFpr0397(String fpr0397) {
        this.fpr0397 = fpr0397;
        notifyPropertyChanged(BR.fpr0397);
    }

    @Bindable
    public String getFpr04() {
        return fpr04;
    }

    public void setFpr04(String fpr04) {
        this.fpr04 = fpr04;
        notifyPropertyChanged(BR.fpr04);
    }

    @Bindable
    public String getFpr0497() {
        return fpr0497;
    }

    public void setFpr0497(String fpr0497) {
        this.fpr0497 = fpr0497;
        notifyPropertyChanged(BR.fpr0497);
    }

    @Bindable
    public String getFpr05() {
        return fpr05;
    }

    public void setFpr05(String fpr05) {
        this.fpr05 = fpr05;
        notifyPropertyChanged(BR.fpr05);
    }

    @Bindable
    public String getFpr0597() {
        return fpr0597;
    }

    public void setFpr0597(String fpr0597) {
        this.fpr0597 = fpr0597;
        notifyPropertyChanged(BR.fpr0597);
    }

    @Bindable
    public String getFpr06() {
        return fpr06;
    }

    public void setFpr06(String fpr06) {
        this.fpr06 = fpr06;
        notifyPropertyChanged(BR.fpr06);
    }

    @Bindable
    public String getFpr0697() {
        return fpr0697;
    }

    public void setFpr0697(String fpr0697) {
        this.fpr0697 = fpr0697;
        notifyPropertyChanged(BR.fpr0697);
    }

    @Bindable
    public String getFpr07() {
        return fpr07;
    }

    public void setFpr07(String fpr07) {
        this.fpr07 = fpr07;
        notifyPropertyChanged(BR.fpr07);
    }

    @Bindable
    public String getFpr0797() {
        return fpr0797;
    }

    public void setFpr0797(String fpr0797) {
        this.fpr0797 = fpr0797;
        notifyPropertyChanged(BR.fpr0797);
    }

    @Bindable
    public String getFpr08() {
        return fpr08;
    }

    public void setFpr08(String fpr08) {
        this.fpr08 = fpr08;
        notifyPropertyChanged(BR.fpr08);
    }

    @Bindable
    public String getFpr0897() {
        return fpr0897;
    }

    public void setFpr0897(String fpr0897) {
        this.fpr0897 = fpr0897;
        notifyPropertyChanged(BR.fpr0897);
    }

    @Bindable
    public String getFpr09() {
        return fpr09;
    }

    public void setFpr09(String fpr09) {
        this.fpr09 = fpr09;
        notifyPropertyChanged(BR.fpr09);
    }

    @Bindable
    public String getFpr0997() {
        return fpr0997;
    }

    public void setFpr0997(String fpr0997) {
        this.fpr0997 = fpr0997;
        notifyPropertyChanged(BR.fpr0997);
    }

    @Bindable
    public String getFpr10() {
        return fpr10;
    }

    public void setFpr10(String fpr10) {
        this.fpr10 = fpr10;
        notifyPropertyChanged(BR.fpr10);
    }

    @Bindable
    public String getFpr1097() {
        return fpr1097;
    }

    public void setFpr1097(String fpr1097) {
        this.fpr1097 = fpr1097;
        notifyPropertyChanged(BR.fpr1097);
    }

    @Bindable
    public String getFpr11() {
        return fpr11;
    }

    public void setFpr11(String fpr11) {
        this.fpr11 = fpr11;
        notifyPropertyChanged(BR.fpr11);
    }

    @Bindable
    public String getFpr1197() {
        return fpr1197;
    }

    public void setFpr1197(String fpr1197) {
        this.fpr1197 = fpr1197;
        notifyPropertyChanged(BR.fpr1197);
    }

    @Bindable
    public String getCfp01() {
        return cfp01;
    }

    public void setCfp01(String cfp01) {
        this.cfp01 = cfp01;
        notifyPropertyChanged(BR.cfp01);
    }

    @Bindable
    public String getCfp0197() {
        return cfp0197;
    }

    public void setCfp0197(String cfp0197) {
        this.cfp0197 = cfp0197;
        notifyPropertyChanged(BR.cfp0197);
    }


    @Bindable
    public String getCfp02() {
        return cfp02;
    }

    public void setCfp02(String cfp02) {
        this.cfp02 = cfp02;
        notifyPropertyChanged(BR.cfp02);
    }


    @Bindable
    public String getCfp0297() {
        return cfp0297;
    }

    public void setCfp0297(String cfp0297) {
        this.cfp0297 = cfp0297;
        notifyPropertyChanged(BR.cfp0297);
    }

    @Bindable
    public String getCfp03() {
        return cfp03;
    }

    public void setCfp03(String cfp03) {
        this.cfp03 = cfp03;
        notifyPropertyChanged(BR.cfp03);
    }


    @Bindable
    public String getCfp0397() {
        return cfp0397;
    }

    public void setCfp0397(String cfp0397) {
        this.cfp0397 = cfp0397;
        notifyPropertyChanged(BR.cfp0397);
    }

    @Bindable
    public String getStr01s() {
        return str01s;
    }

    public void setStr01s(String str01s) {
        this.str01s = str01s;
        notifyPropertyChanged(BR.str01s);
    }

    @Bindable
    public String getStr01d() {
        return str01d;
    }

    public void setStr01d(String str01d) {
        this.str01d = str01d;
        notifyPropertyChanged(BR.str01d);
    }

    @Bindable
    public String getStr01m() {
        return str01m;
    }

    public void setStr01m(String str01m) {
        this.str01m = str01m;
        notifyPropertyChanged(BR.str01m);
    }

    @Bindable
    public String getStr02s() {
        return str02s;
    }

    public void setStr02s(String str02s) {
        this.str02s = str02s;
        notifyPropertyChanged(BR.str02s);
    }

    @Bindable
    public String getStr02d() {
        return str02d;
    }

    public void setStr02d(String str02d) {
        this.str02d = str02d;
        notifyPropertyChanged(BR.str02d);
    }

    @Bindable
    public String getStr02m() {
        return str02m;
    }

    public void setStr02m(String str02m) {
        this.str02m = str02m;
        notifyPropertyChanged(BR.str02m);
    }

    @Bindable
    public String getStr03s() {
        return str03s;
    }

    public void setStr03s(String str03s) {
        this.str03s = str03s;
        notifyPropertyChanged(BR.str03s);
    }

    @Bindable
    public String getStr03d() {
        return str03d;
    }

    public void setStr03d(String str03d) {
        this.str03d = str03d;
        notifyPropertyChanged(BR.str03d);
    }

    @Bindable
    public String getStr03m() {
        return str03m;
    }

    public void setStr03m(String str03m) {
        this.str03m = str03m;
        notifyPropertyChanged(BR.str03m);
    }

    @Bindable
    public String getStr04s() {
        return str04s;
    }

    public void setStr04s(String str04s) {
        this.str04s = str04s;
        notifyPropertyChanged(BR.str04s);
    }

    @Bindable
    public String getStr04d() {
        return str04d;
    }

    public void setStr04d(String str04d) {
        this.str04d = str04d;
        notifyPropertyChanged(BR.str04d);
    }

    @Bindable
    public String getStr04m() {
        return str04m;
    }

    public void setStr04m(String str04m) {
        this.str04m = str04m;
        notifyPropertyChanged(BR.str04m);
    }

    @Bindable
    public String getStr05s() {
        return str05s;
    }

    public void setStr05s(String str05s) {
        this.str05s = str05s;
        notifyPropertyChanged(BR.str05s);
    }

    @Bindable
    public String getStr05d() {
        return str05d;
    }

    public void setStr05d(String str05d) {
        this.str05d = str05d;
        notifyPropertyChanged(BR.str05d);
    }

    @Bindable
    public String getStr05m() {
        return str05m;
    }

    public void setStr05m(String str05m) {
        this.str05m = str05m;
        notifyPropertyChanged(BR.str05m);
    }

    @Bindable
    public String getStr06s() {
        return str06s;
    }

    public void setStr06s(String str06s) {
        this.str06s = str06s;
        notifyPropertyChanged(BR.str06s);
    }

    @Bindable
    public String getStr06d() {
        return str06d;
    }

    public void setStr06d(String str06d) {
        this.str06d = str06d;
        notifyPropertyChanged(BR.str06d);
    }

    @Bindable
    public String getStr06m() {
        return str06m;
    }

    public void setStr06m(String str06m) {
        this.str06m = str06m;
        notifyPropertyChanged(BR.str06m);
    }

    @Bindable
    public String getStr07s() {
        return str07s;
    }

    public void setStr07s(String str07s) {
        this.str07s = str07s;
        notifyPropertyChanged(BR.str07s);
    }

    @Bindable
    public String getStr07d() {
        return str07d;
    }

    public void setStr07d(String str07d) {
        this.str07d = str07d;
        notifyPropertyChanged(BR.str07d);
    }

    @Bindable
    public String getStr07m() {
        return str07m;
    }

    public void setStr07m(String str07m) {
        this.str07m = str07m;
        notifyPropertyChanged(BR.str07m);
    }

    @Bindable
    public String getStr08s() {
        return str08s;
    }

    public void setStr08s(String str08s) {
        this.str08s = str08s;
        notifyPropertyChanged(BR.str08s);
    }

    @Bindable
    public String getStr08d() {
        return str08d;
    }

    public void setStr08d(String str08d) {
        this.str08d = str08d;
        notifyPropertyChanged(BR.str08d);
    }

    @Bindable
    public String getStr08m() {
        return str08m;
    }

    public void setStr08m(String str08m) {
        this.str08m = str08m;
        notifyPropertyChanged(BR.str08m);
    }

    @Bindable
    public String getStr09s() {
        return str09s;
    }

    public void setStr09s(String str09s) {
        this.str09s = str09s;
        notifyPropertyChanged(BR.str09s);
    }

    @Bindable
    public String getStr09d() {
        return str09d;
    }

    public void setStr09d(String str09d) {
        this.str09d = str09d;
        notifyPropertyChanged(BR.str09d);
    }

    @Bindable
    public String getStr09m() {
        return str09m;
    }

    public void setStr09m(String str09m) {
        this.str09m = str09m;
        notifyPropertyChanged(BR.str09m);
    }


    public Form Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FormsTable.COLUMN_ID);
        this.uid = jsonObject.getString(FormsTable.COLUMN_UID);
        this.userName = jsonObject.getString(FormsTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FormsTable.COLUMN_SYSDATE);
        this.districtCode = jsonObject.getString(FormsTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(FormsTable.COLUMN_DISTRICT_NAME);
        this.hfCode = jsonObject.getString(FormsTable.COLUMN_HF_CODE);
        this.hfName = jsonObject.getString(FormsTable.COLUMN_HF_NAME);
        this.reportingMonth = jsonObject.getString(FormsTable.COLUMN_REPORTING_MONTH);
        this.reportingYear = jsonObject.getString(FormsTable.COLUMN_REPORTING_YEAR);
        this.deviceId = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(FormsTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FormsTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);

        this.sMHR = jsonObject.getString(FormsTable.COLUMN_SMHR);

        return this;

    }


    public Form Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));
        this.districtCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_NAME));
        this.hfCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_CODE));
        this.hfName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_NAME));
        this.reportingMonth = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REPORTING_MONTH));
        this.reportingYear = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REPORTING_YEAR));
        this.deviceId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA));

        sMHRHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SMHR)));
        sEPIHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SEPI)));
        sSHFHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SSHF)));
        sOBSHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SOBS)));
        sFPRHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SFPR)));
        sCFPHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCFP)));
        sSTRHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SSTR)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }


    public String sMHRtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("mhr01", mhr01)
                    .put("mhr0197", mhr0197)
                    .put("mhr02", mhr02)
                    .put("mhr0297", mhr0297)
                    .put("mhr03", mhr03)
                    .put("mhr0397", mhr0397)
                    .put("mhr04", mhr04)
                    .put("mhr0497", mhr0497)
                    .put("mhr05", mhr05)
                    .put("mhr0597", mhr0597);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sEPItoString() {
        JSONObject json = new JSONObject();

        try {
            json
                    .put("epi01", epi01)
                    .put("epi0197", epi0197);


        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sSHFtoString() {
        JSONObject json = new JSONObject();

        try {
            json

                    .put("shf01", shf01)
                    .put("shf0197", shf0197)
                    .put("shf02", shf02)
                    .put("shf0297", shf0297);


        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sOBStoString() {
        JSONObject json = new JSONObject();

        try {
            json

                    .put("obs01", obs01)
                    .put("obs0197", obs0197)
                    .put("obs02", obs02)
                    .put("obs0297", obs0297)
                    .put("obs03", obs03)
                    .put("obs0397", obs0397)
                    .put("obs04", obs04)
                    .put("obs0497", obs0497)
                    .put("obs05", obs05)
                    .put("obs0597", obs0597)
                    .put("obs06", obs06)
                    .put("obs0697", obs0697)
                    .put("obs07", obs07)
                    .put("obs0797", obs0797)
                    .put("obs08", obs08)
                    .put("obs0897", obs0897)
                    .put("obs09", obs09)
                    .put("obs0997", obs0997)
                    .put("obs10", obs10)
                    .put("obs1097", obs1097)
                    .put("obs11", obs11)
                    .put("obs1197", obs1197)
                    .put("obs12", obs12)
                    .put("obs1297", obs1297)
                    .put("obs13", obs13)
                    .put("obs1397", obs1397)
                    .put("obs14", obs14)
                    .put("obs1497", obs1497)
                    .put("obs15", obs15)
                    .put("obs1597", obs1597)
                    .put("obs16", obs16)
                    .put("obs1697", obs1697)
                    .put("obs17", obs17)
                    .put("obs1797", obs1797)
                    .put("obs18", obs18)
                    .put("obs1897", obs1897)
                    .put("obs19", obs19)
                    .put("obs1997", obs1997)
                    .put("obs20", obs20)
                    .put("obs2097", obs2097);


        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sFPRtoString() {
        JSONObject json = new JSONObject();

        try {
            json

                    .put("fpr01", fpr01)
                    .put("fpr0197", fpr0197)
                    .put("fpr02", fpr02)
                    .put("fpr0297", fpr0297)
                    .put("fpr03", fpr03)
                    .put("fpr0397", fpr0397)
                    .put("fpr04", fpr04)
                    .put("fpr0497", fpr0497)
                    .put("fpr05", fpr05)
                    .put("fpr0597", fpr0597)
                    .put("fpr06", fpr06)
                    .put("fpr0697", fpr0697)
                    .put("fpr07", fpr07)
                    .put("fpr0797", fpr0797)
                    .put("fpr08", fpr08)
                    .put("fpr0897", fpr0897)
                    .put("fpr09", fpr09)
                    .put("fpr0997", fpr0997)
                    .put("fpr10", fpr10)
                    .put("fpr1097", fpr1097)
                    .put("fpr11", fpr11)
                    .put("fpr1197", fpr1197);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sCFPtoString() {
        JSONObject json = new JSONObject();

        try {
            json
                    .put("cfp01", cfp01)
                    .put("cfp0197", cfp0197)
                    .put("cfp02", cfp02)
                    .put("cfp0297", cfp0297)
                    .put("cfp03", cfp03)
                    .put("cfp0397", cfp0397);


        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String sSTRtoString() {
        JSONObject json = new JSONObject();

        try {
            json
                    .put("str01s", str01s)
                    .put("str01d", str01d)
                    .put("str01m", str01m)
                    .put("str02s", str02s)
                    .put("str02d", str02d)
                    .put("str02m", str02m)
                    .put("str03s", str03s)
                    .put("str03d", str03d)
                    .put("str03m", str03m)
                    .put("str04s", str04s)
                    .put("str04d", str04d)
                    .put("str04m", str04m)
                    .put("str05s", str05s)
                    .put("str05d", str05d)
                    .put("str05m", str05m)
                    .put("str06s", str06s)
                    .put("str06d", str06d)
                    .put("str06m", str06m)
                    .put("str07s", str07s)
                    .put("str07d", str07d)
                    .put("str07m", str07m)
                    .put("str08s", str08s)
                    .put("str08d", str08d)
                    .put("str08m", str08m)
                    .put("str09s", str09s)
                    .put("str09d", str09d)
                    .put("str09m", str09m);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsTable.COLUMN_ID, this.id);
            json.put(FormsTable.COLUMN_UID, this.uid);
            json.put(FormsTable.COLUMN_USERNAME, this.userName);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
            json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode);
            json.put(FormsTable.COLUMN_DISTRICT_NAME, this.districtName);
            json.put(FormsTable.COLUMN_HF_CODE, this.hfCode);
            json.put(FormsTable.COLUMN_HF_NAME, this.hfName);
            json.put(FormsTable.COLUMN_REPORTING_MONTH, this.reportingMonth);
            json.put(FormsTable.COLUMN_REPORTING_YEAR, this.reportingYear);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(FormsTable.COLUMN_APPVERSION, this.appver);
            json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endTime);
            json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
            json.put(FormsTable.COLUMN_ISTATUS96x, this.iStatus96x);
            json.put(FormsTable.COLUMN_SYNCED, this.synced);
            json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
            json.put(FormsTable.COLUMN_SMHR, new JSONObject(sMHRtoString()));
            json.put(FormsTable.COLUMN_SEPI, new JSONObject(sEPItoString()));
            json.put(FormsTable.COLUMN_SSHF, new JSONObject(sSHFtoString()));
            json.put(FormsTable.COLUMN_SOBS, new JSONObject(sOBStoString()));
            json.put(FormsTable.COLUMN_SFPR, new JSONObject(sFPRtoString()));
            json.put(FormsTable.COLUMN_SCFP, new JSONObject(sCFPtoString()));
            json.put(FormsTable.COLUMN_SSTR, new JSONObject(sSTRtoString()));


            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sMHRHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.mhr01 = json.getString("mhr01");
                this.mhr0197 = json.getString("mhr0197");
                this.mhr02 = json.getString("mhr02");
                this.mhr0297 = json.getString("mhr0297");
                this.mhr03 = json.getString("mhr03");
                this.mhr0397 = json.getString("mhr0397");
                this.mhr04 = json.getString("mhr04");
                this.mhr0497 = json.getString("mhr0497");
                this.mhr05 = json.getString("mhr05");
                this.mhr0597 = json.getString("mhr0597");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sEPIHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.epi01 = json.getString("epi01");
                this.epi0197 = json.getString("epi0197");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sSHFHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.shf01 = json.getString("shf01");
                this.shf0197 = json.getString("shf0197");
                this.shf02 = json.getString("shf02");
                this.shf0297 = json.getString("shf0297");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sOBSHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.obs01 = json.getString("obs01");
                this.obs0197 = json.getString("obs0197");
                this.obs02 = json.getString("obs02");
                this.obs0297 = json.getString("obs0297");
                this.obs03 = json.getString("obs03");
                this.obs0397 = json.getString("obs0397");
                this.obs04 = json.getString("obs04");
                this.obs0497 = json.getString("obs0497");
                this.obs05 = json.getString("obs05");
                this.obs0597 = json.getString("obs0597");
                this.obs06 = json.getString("obs06");
                this.obs0697 = json.getString("obs0697");
                this.obs07 = json.getString("obs07");
                this.obs0797 = json.getString("obs0797");
                this.obs08 = json.getString("obs08");
                this.obs0897 = json.getString("obs0897");
                this.obs09 = json.getString("obs09");
                this.obs0997 = json.getString("obs0997");
                this.obs10 = json.getString("obs10");
                this.obs1097 = json.getString("obs1097");
                this.obs11 = json.getString("obs11");
                this.obs1197 = json.getString("obs1197");
                this.obs12 = json.getString("obs12");
                this.obs1297 = json.getString("obs1297");
                this.obs13 = json.getString("obs13");
                this.obs1397 = json.getString("obs1397");
                this.obs14 = json.getString("obs14");
                this.obs1497 = json.getString("obs1497");
                this.obs15 = json.getString("obs15");
                this.obs1597 = json.getString("obs1597");
                this.obs16 = json.getString("obs16");
                this.obs1697 = json.getString("obs1697");
                this.obs17 = json.getString("obs17");
                this.obs1797 = json.getString("obs1797");
                this.obs18 = json.getString("obs18");
                this.obs1897 = json.getString("obs1897");
                this.obs19 = json.getString("obs19");
                this.obs1997 = json.getString("obs1997");
                this.obs20 = json.getString("obs20");
                this.obs2097 = json.getString("obs2097");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sFPRHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);


                this.fpr01 = json.getString("fpr01");
                this.fpr0197 = json.getString("fpr0197");
                this.fpr02 = json.getString("fpr02");
                this.fpr0297 = json.getString("fpr0297");
                this.fpr03 = json.getString("fpr03");
                this.fpr0397 = json.getString("fpr0397");
                this.fpr04 = json.getString("fpr04");
                this.fpr0497 = json.getString("fpr0497");
                this.fpr05 = json.getString("fpr05");
                this.fpr0597 = json.getString("fpr0597");
                this.fpr06 = json.getString("fpr06");
                this.fpr0697 = json.getString("fpr0697");
                this.fpr07 = json.getString("fpr07");
                this.fpr0797 = json.getString("fpr0797");
                this.fpr08 = json.getString("fpr08");
                this.fpr0897 = json.getString("fpr0897");
                this.fpr09 = json.getString("fpr09");
                this.fpr0997 = json.getString("fpr0997");
                this.fpr10 = json.getString("fpr10");
                this.fpr1097 = json.getString("fpr1097");
                this.fpr11 = json.getString("fpr11");
                this.fpr1197 = json.getString("fpr1197");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sCFPHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);


                this.cfp01 = json.getString("cfp01");
                this.cfp0197 = json.getString("cfp0197");
                this.cfp02 = json.getString("cfp02");
                this.cfp0297 = json.getString("cfp0297");
                this.cfp03 = json.getString("cfp03");
                this.cfp0397 = json.getString("cfp0397");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sSTRHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);


                this.str01s = json.getString("str01s");
                this.str01d = json.getString("str01d");
                this.str01m = json.getString("str01m");
                this.str02s = json.getString("str02s");
                this.str02d = json.getString("str02d");
                this.str02m = json.getString("str02m");
                this.str03s = json.getString("str03s");
                this.str03d = json.getString("str03d");
                this.str03m = json.getString("str03m");
                this.str04s = json.getString("str04s");
                this.str04d = json.getString("str04d");
                this.str04m = json.getString("str04m");
                this.str05s = json.getString("str05s");
                this.str05d = json.getString("str05d");
                this.str05m = json.getString("str05m");
                this.str06s = json.getString("str06s");
                this.str06d = json.getString("str06d");
                this.str06m = json.getString("str06m");
                this.str07s = json.getString("str07s");
                this.str07d = json.getString("str07d");
                this.str07m = json.getString("str07m");
                this.str08s = json.getString("str08s");
                this.str08d = json.getString("str08d");
                this.str08m = json.getString("str08m");
                this.str09s = json.getString("str09s");
                this.str09d = json.getString("str09d");
                this.str09m = json.getString("str09m");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private synchronized void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }


    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "FormsRSD";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_HF_NAME = "hfName";
        public static final String COLUMN_REPORTING_MONTH = "reportingMonth";
        public static final String COLUMN_REPORTING_YEAR = "reportingYear";
        public static final String COLUMN_SMHR = "sMHR";
        public static final String COLUMN_SEPI = "sEPI";
        public static final String COLUMN_SSHF = "sSHF";
        public static final String COLUMN_SOBS = "sOBS";
        public static final String COLUMN_SFPR = "sFPR";
        public static final String COLUMN_SCFP = "sCFP";
        public static final String COLUMN_SSTR = "sSTR";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";

    }
}

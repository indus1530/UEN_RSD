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
    private String h101 = StringUtils.EMPTY;
    private String h102 = StringUtils.EMPTY;
    private String h103 = StringUtils.EMPTY;
    private String h104 = StringUtils.EMPTY;
    private String f101 = StringUtils.EMPTY;
    private String f101ax = StringUtils.EMPTY;
    private String f102 = StringUtils.EMPTY;
    private String f102ax = StringUtils.EMPTY;
    private String f103 = StringUtils.EMPTY;
    private String f103ax = StringUtils.EMPTY;
    private String f104 = StringUtils.EMPTY;
    private String f104ax = StringUtils.EMPTY;
    private String f105 = StringUtils.EMPTY;
    private String f105ax = StringUtils.EMPTY;
    private String f106 = StringUtils.EMPTY;
    private String f106ax = StringUtils.EMPTY;
    private String f1image = StringUtils.EMPTY;
    private String f201 = StringUtils.EMPTY;
    private String f201ax = StringUtils.EMPTY;
    private String f202 = StringUtils.EMPTY;
    private String f202ax = StringUtils.EMPTY;
    private String f203 = StringUtils.EMPTY;
    private String f203ax = StringUtils.EMPTY;
    private String f2image = StringUtils.EMPTY;
    private String f301 = StringUtils.EMPTY;
    private String f301ax = StringUtils.EMPTY;
    private String f302 = StringUtils.EMPTY;
    private String f302ax = StringUtils.EMPTY;
    private String f303 = StringUtils.EMPTY;
    private String f303ax = StringUtils.EMPTY;
    private String f304 = StringUtils.EMPTY;
    private String f304ax = StringUtils.EMPTY;
    private String f305 = StringUtils.EMPTY;
    private String f305ax = StringUtils.EMPTY;
    private String f306 = StringUtils.EMPTY;
    private String f306ax = StringUtils.EMPTY;
    private String f307 = StringUtils.EMPTY;
    private String f307ax = StringUtils.EMPTY;
    private String f308 = StringUtils.EMPTY;
    private String f308ax = StringUtils.EMPTY;
    private String f309 = StringUtils.EMPTY;
    private String f309ax = StringUtils.EMPTY;
    private String f310 = StringUtils.EMPTY;
    private String f310ax = StringUtils.EMPTY;
    private String f311 = StringUtils.EMPTY;
    private String f311ax = StringUtils.EMPTY;
    private String f312 = StringUtils.EMPTY;
    private String f312ax = StringUtils.EMPTY;
    private String f313 = StringUtils.EMPTY;
    private String f313ax = StringUtils.EMPTY;
    private String f314 = StringUtils.EMPTY;
    private String f314ax = StringUtils.EMPTY;
    private String f315 = StringUtils.EMPTY;
    private String f315ax = StringUtils.EMPTY;
    private String f316 = StringUtils.EMPTY;
    private String f316ax = StringUtils.EMPTY;
    private String f317 = StringUtils.EMPTY;
    private String f317ax = StringUtils.EMPTY;
    private String f318 = StringUtils.EMPTY;
    private String f318ax = StringUtils.EMPTY;
    private String f319 = StringUtils.EMPTY;
    private String f319ax = StringUtils.EMPTY;
    private String f320 = StringUtils.EMPTY;
    private String f320ax = StringUtils.EMPTY;
    private String f321 = StringUtils.EMPTY;
    private String f321ax = StringUtils.EMPTY;
    private String f322 = StringUtils.EMPTY;
    private String f322ax = StringUtils.EMPTY;
    private String f323 = StringUtils.EMPTY;
    private String f323ax = StringUtils.EMPTY;
    private String f324 = StringUtils.EMPTY;
    private String f324ax = StringUtils.EMPTY;
    private String f325 = StringUtils.EMPTY;
    private String f325ax = StringUtils.EMPTY;
    private String f326 = StringUtils.EMPTY;
    private String f326ax = StringUtils.EMPTY;
    private String f327 = StringUtils.EMPTY;
    private String f327ax = StringUtils.EMPTY;
    private String f328 = StringUtils.EMPTY;
    private String f328ax = StringUtils.EMPTY;
    private String f329 = StringUtils.EMPTY;
    private String f329ax = StringUtils.EMPTY;
    private String f330 = StringUtils.EMPTY;
    private String f330ax = StringUtils.EMPTY;
    private String f331 = StringUtils.EMPTY;
    private String f331ax = StringUtils.EMPTY;
    private String f332 = StringUtils.EMPTY;
    private String f332ax = StringUtils.EMPTY;
    private String f333 = StringUtils.EMPTY;
    private String f333ax = StringUtils.EMPTY;
    private String f334 = StringUtils.EMPTY;
    private String f334ax = StringUtils.EMPTY;
    private String f335 = StringUtils.EMPTY;
    private String f335ax = StringUtils.EMPTY;
    private String f336 = StringUtils.EMPTY;
    private String f336ax = StringUtils.EMPTY;
    private String f337 = StringUtils.EMPTY;
    private String f337ax = StringUtils.EMPTY;
    private String f338 = StringUtils.EMPTY;
    private String f338ax = StringUtils.EMPTY;
    private String f339 = StringUtils.EMPTY;
    private String f339ax = StringUtils.EMPTY;
    private String f340 = StringUtils.EMPTY;
    private String f340ax = StringUtils.EMPTY;
    private String f341 = StringUtils.EMPTY;
    private String f341ax = StringUtils.EMPTY;
    private String f342 = StringUtils.EMPTY;
    private String f342ax = StringUtils.EMPTY;
    private String f3image = StringUtils.EMPTY;
    private String f401 = StringUtils.EMPTY;
    private String f401ax = StringUtils.EMPTY;
    private String f402 = StringUtils.EMPTY;
    private String f402ax = StringUtils.EMPTY;
    private String f403 = StringUtils.EMPTY;
    private String f403ax = StringUtils.EMPTY;
    private String f404 = StringUtils.EMPTY;
    private String f404ax = StringUtils.EMPTY;
    private String f405 = StringUtils.EMPTY;
    private String f405ax = StringUtils.EMPTY;
    private String f406 = StringUtils.EMPTY;
    private String f406ax = StringUtils.EMPTY;
    private String f407 = StringUtils.EMPTY;
    private String f407ax = StringUtils.EMPTY;
    private String f408 = StringUtils.EMPTY;
    private String f408ax = StringUtils.EMPTY;
    private String f409 = StringUtils.EMPTY;
    private String f409ax = StringUtils.EMPTY;
    private String f410 = StringUtils.EMPTY;
    private String f410ax = StringUtils.EMPTY;
    private String f411 = StringUtils.EMPTY;
    private String f411ax = StringUtils.EMPTY;
    private String f412 = StringUtils.EMPTY;
    private String f412ax = StringUtils.EMPTY;
    private String f413 = StringUtils.EMPTY;
    private String f413ax = StringUtils.EMPTY;
    private String f414 = StringUtils.EMPTY;
    private String f414ax = StringUtils.EMPTY;
    private String f415 = StringUtils.EMPTY;
    private String f415ax = StringUtils.EMPTY;
    private String f416 = StringUtils.EMPTY;
    private String f416ax = StringUtils.EMPTY;
    private String f417 = StringUtils.EMPTY;
    private String f417ax = StringUtils.EMPTY;
    private String f418 = StringUtils.EMPTY;
    private String f418ax = StringUtils.EMPTY;
    private String f419 = StringUtils.EMPTY;
    private String f419ax = StringUtils.EMPTY;
    private String f4image = StringUtils.EMPTY;
    private String f501 = StringUtils.EMPTY;
    private String f501ax = StringUtils.EMPTY;
    private String f502 = StringUtils.EMPTY;
    private String f502ax = StringUtils.EMPTY;
    private String f503 = StringUtils.EMPTY;
    private String f503ax = StringUtils.EMPTY;
    private String f504 = StringUtils.EMPTY;
    private String f504ax = StringUtils.EMPTY;
    private String f505 = StringUtils.EMPTY;
    private String f505ax = StringUtils.EMPTY;
    private String f506 = StringUtils.EMPTY;
    private String f506ax = StringUtils.EMPTY;
    private String f507 = StringUtils.EMPTY;
    private String f507ax = StringUtils.EMPTY;
    private String f508 = StringUtils.EMPTY;
    private String f508ax = StringUtils.EMPTY;
    private String f509 = StringUtils.EMPTY;
    private String f509ax = StringUtils.EMPTY;
    private String f510 = StringUtils.EMPTY;
    private String f510ax = StringUtils.EMPTY;
    private String f511 = StringUtils.EMPTY;
    private String f511ax = StringUtils.EMPTY;
    private String f512 = StringUtils.EMPTY;
    private String f512ax = StringUtils.EMPTY;
    private String f513 = StringUtils.EMPTY;
    private String f513ax = StringUtils.EMPTY;
    private String f514 = StringUtils.EMPTY;
    private String f514ax = StringUtils.EMPTY;
    private String f515 = StringUtils.EMPTY;
    private String f515ax = StringUtils.EMPTY;
    private String f516 = StringUtils.EMPTY;
    private String f516ax = StringUtils.EMPTY;
    private String f5image = StringUtils.EMPTY;
    private String f601 = StringUtils.EMPTY;
    private String f601ax = StringUtils.EMPTY;
    private String f602 = StringUtils.EMPTY;
    private String f602ax = StringUtils.EMPTY;
    private String f603 = StringUtils.EMPTY;
    private String f603ax = StringUtils.EMPTY;
    private String f6image = StringUtils.EMPTY;
    private String f701 = StringUtils.EMPTY;
    private String f701ax = StringUtils.EMPTY;
    private String f702a = StringUtils.EMPTY;
    private String f702aax = StringUtils.EMPTY;
    private String f702b = StringUtils.EMPTY;
    private String f702bax = StringUtils.EMPTY;
    private String f703a = StringUtils.EMPTY;
    private String f703aax = StringUtils.EMPTY;
    private String f703b = StringUtils.EMPTY;
    private String f703bax = StringUtils.EMPTY;
    private String f703c = StringUtils.EMPTY;
    private String f703cax = StringUtils.EMPTY;
    private String f704 = StringUtils.EMPTY;
    private String f704ax = StringUtils.EMPTY;
    private String f705 = StringUtils.EMPTY;
    private String f705ax = StringUtils.EMPTY;
    private String f7image = StringUtils.EMPTY;
    private String f8011 = StringUtils.EMPTY;
    private String f8012m = StringUtils.EMPTY;
    private String f8012d = StringUtils.EMPTY;
    private String f8021 = StringUtils.EMPTY;
    private String f8022m = StringUtils.EMPTY;
    private String f8022d = StringUtils.EMPTY;
    private String f8031 = StringUtils.EMPTY;
    private String f8032m = StringUtils.EMPTY;
    private String f8032d = StringUtils.EMPTY;
    private String f8041 = StringUtils.EMPTY;
    private String f8042m = StringUtils.EMPTY;
    private String f8042d = StringUtils.EMPTY;
    private String f8051 = StringUtils.EMPTY;
    private String f8052m = StringUtils.EMPTY;
    private String f8052d = StringUtils.EMPTY;
    private String f8061 = StringUtils.EMPTY;
    private String f8062m = StringUtils.EMPTY;
    private String f8062d = StringUtils.EMPTY;
    private String f8071 = StringUtils.EMPTY;
    private String f8072m = StringUtils.EMPTY;
    private String f8072d = StringUtils.EMPTY;
    private String f8081 = StringUtils.EMPTY;
    private String f8082m = StringUtils.EMPTY;
    private String f8082d = StringUtils.EMPTY;
    private String f8091 = StringUtils.EMPTY;
    private String f8092m = StringUtils.EMPTY;
    private String f8092d = StringUtils.EMPTY;
    private String f8image = StringUtils.EMPTY;
    private String rsdremarks = StringUtils.EMPTY;
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
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH104() {
        return h104;
    }

    public void setH104(String h104) {
        this.h104 = h104;
        notifyPropertyChanged(BR.h104);
    }

    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF101ax() {
        return f101ax;
    }

    public void setF101ax(String f101ax) {
        this.f101ax = f101ax;
        notifyPropertyChanged(BR.f101ax);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF102ax() {
        return f102ax;
    }

    public void setF102ax(String f102ax) {
        this.f102ax = f102ax;
        notifyPropertyChanged(BR.f102ax);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF103ax() {
        return f103ax;
    }

    public void setF103ax(String f103ax) {
        this.f103ax = f103ax;
        notifyPropertyChanged(BR.f103ax);
    }

    @Bindable
    public String getF104() {
        return f104;
    }

    public void setF104(String f104) {
        this.f104 = f104;
        notifyPropertyChanged(BR.f104);
    }

    @Bindable
    public String getF104ax() {
        return f104ax;
    }

    public void setF104ax(String f104ax) {
        this.f104ax = f104ax;
        notifyPropertyChanged(BR.f104ax);
    }

    @Bindable
    public String getF105() {
        return f105;
    }

    public void setF105(String f105) {
        this.f105 = f105;
        notifyPropertyChanged(BR.f105);
    }

    @Bindable
    public String getF105ax() {
        return f105ax;
    }

    public void setF105ax(String f105ax) {
        this.f105ax = f105ax;
        notifyPropertyChanged(BR.f105ax);
    }

    @Bindable
    public String getF106() {
        return f106;
    }

    public void setF106(String f106) {
        this.f106 = f106;
        notifyPropertyChanged(BR.f106);
    }

    @Bindable
    public String getF106ax() {
        return f106ax;
    }

    public void setF106ax(String f106ax) {
        this.f106ax = f106ax;
        notifyPropertyChanged(BR.f106ax);
    }

    @Bindable
    public String getF1image() {
        return f1image;
    }

    public void setF1image(String f1image) {
        this.f1image = f1image;
        notifyPropertyChanged(BR.f1image);
    }

    @Bindable
    public String getF201() {
        return f201;
    }

    public void setF201(String f201) {
        this.f201 = f201;
        notifyPropertyChanged(BR.f201);
    }

    @Bindable
    public String getF201ax() {
        return f201ax;
    }

    public void setF201ax(String f201ax) {
        this.f201ax = f201ax;
        notifyPropertyChanged(BR.f201ax);
    }

    @Bindable
    public String getF202() {
        return f202;
    }

    public void setF202(String f202) {
        this.f202 = f202;
        notifyPropertyChanged(BR.f202);
    }

    @Bindable
    public String getF202ax() {
        return f202ax;
    }

    public void setF202ax(String f202ax) {
        this.f202ax = f202ax;
        notifyPropertyChanged(BR.f202ax);
    }

    @Bindable
    public String getF203() {
        return f203;
    }

    public void setF203(String f203) {
        this.f203 = f203;
        notifyPropertyChanged(BR.f203);
    }

    @Bindable
    public String getF203ax() {
        return f203ax;
    }

    public void setF203ax(String f203ax) {
        this.f203ax = f203ax;
        notifyPropertyChanged(BR.f203ax);
    }

    @Bindable
    public String getF2image() {
        return f2image;
    }

    public void setF2image(String f2image) {
        this.f2image = f2image;
        notifyPropertyChanged(BR.f2image);
    }

    @Bindable
    public String getF301() {
        return f301;
    }

    public void setF301(String f301) {
        this.f301 = f301;
        notifyPropertyChanged(BR.f301);
    }

    @Bindable
    public String getF301ax() {
        return f301ax;
    }

    public void setF301ax(String f301ax) {
        this.f301ax = f301ax;
        notifyPropertyChanged(BR.f301ax);
    }

    @Bindable
    public String getF302() {
        return f302;
    }

    public void setF302(String f302) {
        this.f302 = f302;
        notifyPropertyChanged(BR.f302);
    }

    @Bindable
    public String getF302ax() {
        return f302ax;
    }

    public void setF302ax(String f302ax) {
        this.f302ax = f302ax;
        notifyPropertyChanged(BR.f302ax);
    }

    @Bindable
    public String getF303() {
        return f303;
    }

    public void setF303(String f303) {
        this.f303 = f303;
        notifyPropertyChanged(BR.f303);
    }

    @Bindable
    public String getF303ax() {
        return f303ax;
    }

    public void setF303ax(String f303ax) {
        this.f303ax = f303ax;
        notifyPropertyChanged(BR.f303ax);
    }

    @Bindable
    public String getF304() {
        return f304;
    }

    public void setF304(String f304) {
        this.f304 = f304;
        notifyPropertyChanged(BR.f304);
    }

    @Bindable
    public String getF304ax() {
        return f304ax;
    }

    public void setF304ax(String f304ax) {
        this.f304ax = f304ax;
        notifyPropertyChanged(BR.f304ax);
    }

    @Bindable
    public String getF305() {
        return f305;
    }

    public void setF305(String f305) {
        this.f305 = f305;
        notifyPropertyChanged(BR.f305);
    }

    @Bindable
    public String getF305ax() {
        return f305ax;
    }

    public void setF305ax(String f305ax) {
        this.f305ax = f305ax;
        notifyPropertyChanged(BR.f305ax);
    }

    @Bindable
    public String getF306() {
        return f306;
    }

    public void setF306(String f306) {
        this.f306 = f306;
        notifyPropertyChanged(BR.f306);
    }

    @Bindable
    public String getF306ax() {
        return f306ax;
    }

    public void setF306ax(String f306ax) {
        this.f306ax = f306ax;
        notifyPropertyChanged(BR.f306ax);
    }

    @Bindable
    public String getF307() {
        return f307;
    }

    public void setF307(String f307) {
        this.f307 = f307;
        notifyPropertyChanged(BR.f307);
    }

    @Bindable
    public String getF307ax() {
        return f307ax;
    }

    public void setF307ax(String f307ax) {
        this.f307ax = f307ax;
        notifyPropertyChanged(BR.f307ax);
    }

    @Bindable
    public String getF308() {
        return f308;
    }

    public void setF308(String f308) {
        this.f308 = f308;
        notifyPropertyChanged(BR.f308);
    }

    @Bindable
    public String getF308ax() {
        return f308ax;
    }

    public void setF308ax(String f308ax) {
        this.f308ax = f308ax;
        notifyPropertyChanged(BR.f308ax);
    }

    @Bindable
    public String getF309() {
        return f309;
    }

    public void setF309(String f309) {
        this.f309 = f309;
        notifyPropertyChanged(BR.f309);
    }

    @Bindable
    public String getF309ax() {
        return f309ax;
    }

    public void setF309ax(String f309ax) {
        this.f309ax = f309ax;
        notifyPropertyChanged(BR.f309ax);
    }

    @Bindable
    public String getF310() {
        return f310;
    }

    public void setF310(String f310) {
        this.f310 = f310;
        notifyPropertyChanged(BR.f310);
    }

    @Bindable
    public String getF310ax() {
        return f310ax;
    }

    public void setF310ax(String f310ax) {
        this.f310ax = f310ax;
        notifyPropertyChanged(BR.f310ax);
    }

    @Bindable
    public String getF311() {
        return f311;
    }

    public void setF311(String f311) {
        this.f311 = f311;
        notifyPropertyChanged(BR.f311);
    }

    @Bindable
    public String getF311ax() {
        return f311ax;
    }

    public void setF311ax(String f311ax) {
        this.f311ax = f311ax;
        notifyPropertyChanged(BR.f311ax);
    }

    @Bindable
    public String getF312() {
        return f312;
    }

    public void setF312(String f312) {
        this.f312 = f312;
        notifyPropertyChanged(BR.f312);
    }

    @Bindable
    public String getF312ax() {
        return f312ax;
    }

    public void setF312ax(String f312ax) {
        this.f312ax = f312ax;
        notifyPropertyChanged(BR.f312ax);
    }

    @Bindable
    public String getF313() {
        return f313;
    }

    public void setF313(String f313) {
        this.f313 = f313;
        notifyPropertyChanged(BR.f313);
    }

    @Bindable
    public String getF313ax() {
        return f313ax;
    }

    public void setF313ax(String f313ax) {
        this.f313ax = f313ax;
        notifyPropertyChanged(BR.f313ax);
    }

    @Bindable
    public String getF314() {
        return f314;
    }

    public void setF314(String f314) {
        this.f314 = f314;
        notifyPropertyChanged(BR.f314);
    }

    @Bindable
    public String getF314ax() {
        return f314ax;
    }

    public void setF314ax(String f314ax) {
        this.f314ax = f314ax;
        notifyPropertyChanged(BR.f314ax);
    }

    @Bindable
    public String getF315() {
        return f315;
    }

    public void setF315(String f315) {
        this.f315 = f315;
        notifyPropertyChanged(BR.f315);
    }

    @Bindable
    public String getF315ax() {
        return f315ax;
    }

    public void setF315ax(String f315ax) {
        this.f315ax = f315ax;
        notifyPropertyChanged(BR.f315ax);
    }

    @Bindable
    public String getF316() {
        return f316;
    }

    public void setF316(String f316) {
        this.f316 = f316;
        notifyPropertyChanged(BR.f316);
    }

    @Bindable
    public String getF316ax() {
        return f316ax;
    }

    public void setF316ax(String f316ax) {
        this.f316ax = f316ax;
        notifyPropertyChanged(BR.f316ax);
    }

    @Bindable
    public String getF317() {
        return f317;
    }

    public void setF317(String f317) {
        this.f317 = f317;
        notifyPropertyChanged(BR.f317);
    }

    @Bindable
    public String getF317ax() {
        return f317ax;
    }

    public void setF317ax(String f317ax) {
        this.f317ax = f317ax;
        notifyPropertyChanged(BR.f317ax);
    }

    @Bindable
    public String getF318() {
        return f318;
    }

    public void setF318(String f318) {
        this.f318 = f318;
        notifyPropertyChanged(BR.f318);
    }

    @Bindable
    public String getF318ax() {
        return f318ax;
    }

    public void setF318ax(String f318ax) {
        this.f318ax = f318ax;
        notifyPropertyChanged(BR.f318ax);
    }

    @Bindable
    public String getF319() {
        return f319;
    }

    public void setF319(String f319) {
        this.f319 = f319;
        notifyPropertyChanged(BR.f319);
    }

    @Bindable
    public String getF319ax() {
        return f319ax;
    }

    public void setF319ax(String f319ax) {
        this.f319ax = f319ax;
        notifyPropertyChanged(BR.f319ax);
    }

    @Bindable
    public String getF320() {
        return f320;
    }

    public void setF320(String f320) {
        this.f320 = f320;
        notifyPropertyChanged(BR.f320);
    }

    @Bindable
    public String getF320ax() {
        return f320ax;
    }

    public void setF320ax(String f320ax) {
        this.f320ax = f320ax;
        notifyPropertyChanged(BR.f320ax);
    }

    @Bindable
    public String getF321() {
        return f321;
    }

    public void setF321(String f321) {
        this.f321 = f321;
        notifyPropertyChanged(BR.f321);
    }

    @Bindable
    public String getF321ax() {
        return f321ax;
    }

    public void setF321ax(String f321ax) {
        this.f321ax = f321ax;
        notifyPropertyChanged(BR.f321ax);
    }

    @Bindable
    public String getF322() {
        return f322;
    }

    public void setF322(String f322) {
        this.f322 = f322;
        notifyPropertyChanged(BR.f322);
    }

    @Bindable
    public String getF322ax() {
        return f322ax;
    }

    public void setF322ax(String f322ax) {
        this.f322ax = f322ax;
        notifyPropertyChanged(BR.f322ax);
    }

    @Bindable
    public String getF323() {
        return f323;
    }

    public void setF323(String f323) {
        this.f323 = f323;
        notifyPropertyChanged(BR.f323);
    }

    @Bindable
    public String getF323ax() {
        return f323ax;
    }

    public void setF323ax(String f323ax) {
        this.f323ax = f323ax;
        notifyPropertyChanged(BR.f323ax);
    }

    @Bindable
    public String getF324() {
        return f324;
    }

    public void setF324(String f324) {
        this.f324 = f324;
        notifyPropertyChanged(BR.f324);
    }

    @Bindable
    public String getF324ax() {
        return f324ax;
    }

    public void setF324ax(String f324ax) {
        this.f324ax = f324ax;
        notifyPropertyChanged(BR.f324ax);
    }

    @Bindable
    public String getF325() {
        return f325;
    }

    public void setF325(String f325) {
        this.f325 = f325;
        notifyPropertyChanged(BR.f325);
    }

    @Bindable
    public String getF325ax() {
        return f325ax;
    }

    public void setF325ax(String f325ax) {
        this.f325ax = f325ax;
        notifyPropertyChanged(BR.f325ax);
    }

    @Bindable
    public String getF326() {
        return f326;
    }

    public void setF326(String f326) {
        this.f326 = f326;
        notifyPropertyChanged(BR.f326);
    }

    @Bindable
    public String getF326ax() {
        return f326ax;
    }

    public void setF326ax(String f326ax) {
        this.f326ax = f326ax;
        notifyPropertyChanged(BR.f326ax);
    }

    @Bindable
    public String getF327() {
        return f327;
    }

    public void setF327(String f327) {
        this.f327 = f327;
        notifyPropertyChanged(BR.f327);
    }

    @Bindable
    public String getF327ax() {
        return f327ax;
    }

    public void setF327ax(String f327ax) {
        this.f327ax = f327ax;
        notifyPropertyChanged(BR.f327ax);
    }

    @Bindable
    public String getF328() {
        return f328;
    }

    public void setF328(String f328) {
        this.f328 = f328;
        notifyPropertyChanged(BR.f328);
    }

    @Bindable
    public String getF328ax() {
        return f328ax;
    }

    public void setF328ax(String f328ax) {
        this.f328ax = f328ax;
        notifyPropertyChanged(BR.f328ax);
    }

    @Bindable
    public String getF329() {
        return f329;
    }

    public void setF329(String f329) {
        this.f329 = f329;
        notifyPropertyChanged(BR.f329);
    }

    @Bindable
    public String getF329ax() {
        return f329ax;
    }

    public void setF329ax(String f329ax) {
        this.f329ax = f329ax;
        notifyPropertyChanged(BR.f329ax);
    }

    @Bindable
    public String getF330() {
        return f330;
    }

    public void setF330(String f330) {
        this.f330 = f330;
        notifyPropertyChanged(BR.f330);
    }

    @Bindable
    public String getF330ax() {
        return f330ax;
    }

    public void setF330ax(String f330ax) {
        this.f330ax = f330ax;
        notifyPropertyChanged(BR.f330ax);
    }

    @Bindable
    public String getF331() {
        return f331;
    }

    public void setF331(String f331) {
        this.f331 = f331;
        notifyPropertyChanged(BR.f331);
    }

    @Bindable
    public String getF331ax() {
        return f331ax;
    }

    public void setF331ax(String f331ax) {
        this.f331ax = f331ax;
        notifyPropertyChanged(BR.f331ax);
    }

    @Bindable
    public String getF332() {
        return f332;
    }

    public void setF332(String f332) {
        this.f332 = f332;
        notifyPropertyChanged(BR.f332);
    }

    @Bindable
    public String getF332ax() {
        return f332ax;
    }

    public void setF332ax(String f332ax) {
        this.f332ax = f332ax;
        notifyPropertyChanged(BR.f332ax);
    }

    @Bindable
    public String getF333() {
        return f333;
    }

    public void setF333(String f333) {
        this.f333 = f333;
        notifyPropertyChanged(BR.f333);
    }

    @Bindable
    public String getF333ax() {
        return f333ax;
    }

    public void setF333ax(String f333ax) {
        this.f333ax = f333ax;
        notifyPropertyChanged(BR.f333ax);
    }

    @Bindable
    public String getF334() {
        return f334;
    }

    public void setF334(String f334) {
        this.f334 = f334;
        notifyPropertyChanged(BR.f334);
    }

    @Bindable
    public String getF334ax() {
        return f334ax;
    }

    public void setF334ax(String f334ax) {
        this.f334ax = f334ax;
        notifyPropertyChanged(BR.f334ax);
    }

    @Bindable
    public String getF335() {
        return f335;
    }

    public void setF335(String f335) {
        this.f335 = f335;
        notifyPropertyChanged(BR.f335);
    }

    @Bindable
    public String getF335ax() {
        return f335ax;
    }

    public void setF335ax(String f335ax) {
        this.f335ax = f335ax;
        notifyPropertyChanged(BR.f335ax);
    }

    @Bindable
    public String getF336() {
        return f336;
    }

    public void setF336(String f336) {
        this.f336 = f336;
        notifyPropertyChanged(BR.f336);
    }

    @Bindable
    public String getF336ax() {
        return f336ax;
    }

    public void setF336ax(String f336ax) {
        this.f336ax = f336ax;
        notifyPropertyChanged(BR.f336ax);
    }

    @Bindable
    public String getF337() {
        return f337;
    }

    public void setF337(String f337) {
        this.f337 = f337;
        notifyPropertyChanged(BR.f337);
    }

    @Bindable
    public String getF337ax() {
        return f337ax;
    }

    public void setF337ax(String f337ax) {
        this.f337ax = f337ax;
        notifyPropertyChanged(BR.f337ax);
    }

    @Bindable
    public String getF338() {
        return f338;
    }

    public void setF338(String f338) {
        this.f338 = f338;
        notifyPropertyChanged(BR.f338);
    }

    @Bindable
    public String getF338ax() {
        return f338ax;
    }

    public void setF338ax(String f338ax) {
        this.f338ax = f338ax;
        notifyPropertyChanged(BR.f338ax);
    }

    @Bindable
    public String getF339() {
        return f339;
    }

    public void setF339(String f339) {
        this.f339 = f339;
        notifyPropertyChanged(BR.f339);
    }

    @Bindable
    public String getF339ax() {
        return f339ax;
    }

    public void setF339ax(String f339ax) {
        this.f339ax = f339ax;
        notifyPropertyChanged(BR.f339ax);
    }

    @Bindable
    public String getF340() {
        return f340;
    }

    public void setF340(String f340) {
        this.f340 = f340;
        notifyPropertyChanged(BR.f340);
    }

    @Bindable
    public String getF340ax() {
        return f340ax;
    }

    public void setF340ax(String f340ax) {
        this.f340ax = f340ax;
        notifyPropertyChanged(BR.f340ax);
    }

    @Bindable
    public String getF341() {
        return f341;
    }

    public void setF341(String f341) {
        this.f341 = f341;
        notifyPropertyChanged(BR.f341);
    }

    @Bindable
    public String getF341ax() {
        return f341ax;
    }

    public void setF341ax(String f341ax) {
        this.f341ax = f341ax;
        notifyPropertyChanged(BR.f341ax);
    }

    @Bindable
    public String getF342() {
        return f342;
    }

    public void setF342(String f342) {
        this.f342 = f342;
        notifyPropertyChanged(BR.f342);
    }

    @Bindable
    public String getF342ax() {
        return f342ax;
    }

    public void setF342ax(String f342ax) {
        this.f342ax = f342ax;
        notifyPropertyChanged(BR.f342ax);
    }

    @Bindable
    public String getF3image() {
        return f3image;
    }

    public void setF3image(String f3image) {
        this.f3image = f3image;
        notifyPropertyChanged(BR.f3image);
    }

    @Bindable
    public String getF401() {
        return f401;
    }

    public void setF401(String f401) {
        this.f401 = f401;
        notifyPropertyChanged(BR.f401);
    }

    @Bindable
    public String getF401ax() {
        return f401ax;
    }

    public void setF401ax(String f401ax) {
        this.f401ax = f401ax;
        notifyPropertyChanged(BR.f401ax);
    }

    @Bindable
    public String getF402() {
        return f402;
    }

    public void setF402(String f402) {
        this.f402 = f402;
        notifyPropertyChanged(BR.f402);
    }

    @Bindable
    public String getF402ax() {
        return f402ax;
    }

    public void setF402ax(String f402ax) {
        this.f402ax = f402ax;
        notifyPropertyChanged(BR.f402ax);
    }

    @Bindable
    public String getF403() {
        return f403;
    }

    public void setF403(String f403) {
        this.f403 = f403;
        notifyPropertyChanged(BR.f403);
    }

    @Bindable
    public String getF403ax() {
        return f403ax;
    }

    public void setF403ax(String f403ax) {
        this.f403ax = f403ax;
        notifyPropertyChanged(BR.f403ax);
    }

    @Bindable
    public String getF404() {
        return f404;
    }

    public void setF404(String f404) {
        this.f404 = f404;
        notifyPropertyChanged(BR.f404);
    }

    @Bindable
    public String getF404ax() {
        return f404ax;
    }

    public void setF404ax(String f404ax) {
        this.f404ax = f404ax;
        notifyPropertyChanged(BR.f404ax);
    }

    @Bindable
    public String getF405() {
        return f405;
    }

    public void setF405(String f405) {
        this.f405 = f405;
        notifyPropertyChanged(BR.f405);
    }

    @Bindable
    public String getF405ax() {
        return f405ax;
    }

    public void setF405ax(String f405ax) {
        this.f405ax = f405ax;
        notifyPropertyChanged(BR.f405ax);
    }

    @Bindable
    public String getF406() {
        return f406;
    }

    public void setF406(String f406) {
        this.f406 = f406;
        notifyPropertyChanged(BR.f406);
    }

    @Bindable
    public String getF406ax() {
        return f406ax;
    }

    public void setF406ax(String f406ax) {
        this.f406ax = f406ax;
        notifyPropertyChanged(BR.f406ax);
    }

    @Bindable
    public String getF407() {
        return f407;
    }

    public void setF407(String f407) {
        this.f407 = f407;
        notifyPropertyChanged(BR.f407);
    }

    @Bindable
    public String getF407ax() {
        return f407ax;
    }

    public void setF407ax(String f407ax) {
        this.f407ax = f407ax;
        notifyPropertyChanged(BR.f407ax);
    }

    @Bindable
    public String getF408() {
        return f408;
    }

    public void setF408(String f408) {
        this.f408 = f408;
        notifyPropertyChanged(BR.f408);
    }

    @Bindable
    public String getF408ax() {
        return f408ax;
    }

    public void setF408ax(String f408ax) {
        this.f408ax = f408ax;
        notifyPropertyChanged(BR.f408ax);
    }

    @Bindable
    public String getF409() {
        return f409;
    }

    public void setF409(String f409) {
        this.f409 = f409;
        notifyPropertyChanged(BR.f409);
    }

    @Bindable
    public String getF409ax() {
        return f409ax;
    }

    public void setF409ax(String f409ax) {
        this.f409ax = f409ax;
        notifyPropertyChanged(BR.f409ax);
    }

    @Bindable
    public String getF410() {
        return f410;
    }

    public void setF410(String f410) {
        this.f410 = f410;
        notifyPropertyChanged(BR.f410);
    }

    @Bindable
    public String getF410ax() {
        return f410ax;
    }

    public void setF410ax(String f410ax) {
        this.f410ax = f410ax;
        notifyPropertyChanged(BR.f410ax);
    }

    @Bindable
    public String getF411() {
        return f411;
    }

    public void setF411(String f411) {
        this.f411 = f411;
        notifyPropertyChanged(BR.f411);
    }

    @Bindable
    public String getF411ax() {
        return f411ax;
    }

    public void setF411ax(String f411ax) {
        this.f411ax = f411ax;
        notifyPropertyChanged(BR.f411ax);
    }

    @Bindable
    public String getF412() {
        return f412;
    }

    public void setF412(String f412) {
        this.f412 = f412;
        notifyPropertyChanged(BR.f412);
    }

    @Bindable
    public String getF412ax() {
        return f412ax;
    }

    public void setF412ax(String f412ax) {
        this.f412ax = f412ax;
        notifyPropertyChanged(BR.f412ax);
    }

    @Bindable
    public String getF413() {
        return f413;
    }

    public void setF413(String f413) {
        this.f413 = f413;
        notifyPropertyChanged(BR.f413);
    }

    @Bindable
    public String getF413ax() {
        return f413ax;
    }

    public void setF413ax(String f413ax) {
        this.f413ax = f413ax;
        notifyPropertyChanged(BR.f413ax);
    }

    @Bindable
    public String getF414() {
        return f414;
    }

    public void setF414(String f414) {
        this.f414 = f414;
        notifyPropertyChanged(BR.f414);
    }

    @Bindable
    public String getF414ax() {
        return f414ax;
    }

    public void setF414ax(String f414ax) {
        this.f414ax = f414ax;
        notifyPropertyChanged(BR.f414ax);
    }

    @Bindable
    public String getF415() {
        return f415;
    }

    public void setF415(String f415) {
        this.f415 = f415;
        notifyPropertyChanged(BR.f415);
    }

    @Bindable
    public String getF415ax() {
        return f415ax;
    }

    public void setF415ax(String f415ax) {
        this.f415ax = f415ax;
        notifyPropertyChanged(BR.f415ax);
    }

    @Bindable
    public String getF416() {
        return f416;
    }

    public void setF416(String f416) {
        this.f416 = f416;
        notifyPropertyChanged(BR.f416);
    }

    @Bindable
    public String getF416ax() {
        return f416ax;
    }

    public void setF416ax(String f416ax) {
        this.f416ax = f416ax;
        notifyPropertyChanged(BR.f416ax);
    }

    @Bindable
    public String getF417() {
        return f417;
    }

    public void setF417(String f417) {
        this.f417 = f417;
        notifyPropertyChanged(BR.f417);
    }

    @Bindable
    public String getF417ax() {
        return f417ax;
    }

    public void setF417ax(String f417ax) {
        this.f417ax = f417ax;
        notifyPropertyChanged(BR.f417ax);
    }

    @Bindable
    public String getF418() {
        return f418;
    }

    public void setF418(String f418) {
        this.f418 = f418;
        notifyPropertyChanged(BR.f418);
    }

    @Bindable
    public String getF418ax() {
        return f418ax;
    }

    public void setF418ax(String f418ax) {
        this.f418ax = f418ax;
        notifyPropertyChanged(BR.f418ax);
    }

    @Bindable
    public String getF419() {
        return f419;
    }

    public void setF419(String f419) {
        this.f419 = f419;
        notifyPropertyChanged(BR.f419);
    }

    @Bindable
    public String getF419ax() {
        return f419ax;
    }

    public void setF419ax(String f419ax) {
        this.f419ax = f419ax;
        notifyPropertyChanged(BR.f419ax);
    }

    @Bindable
    public String getF4image() {
        return f4image;
    }

    public void setF4image(String f4image) {
        this.f4image = f4image;
        notifyPropertyChanged(BR.f4image);
    }

    @Bindable
    public String getF501() {
        return f501;
    }

    public void setF501(String f501) {
        this.f501 = f501;
        notifyPropertyChanged(BR.f501);
    }

    @Bindable
    public String getF501ax() {
        return f501ax;
    }

    public void setF501ax(String f501ax) {
        this.f501ax = f501ax;
        notifyPropertyChanged(BR.f501ax);
    }

    @Bindable
    public String getF502() {
        return f502;
    }

    public void setF502(String f502) {
        this.f502 = f502;
        notifyPropertyChanged(BR.f502);
    }

    @Bindable
    public String getF502ax() {
        return f502ax;
    }

    public void setF502ax(String f502ax) {
        this.f502ax = f502ax;
        notifyPropertyChanged(BR.f502ax);
    }

    @Bindable
    public String getF503() {
        return f503;
    }

    public void setF503(String f503) {
        this.f503 = f503;
        notifyPropertyChanged(BR.f503);
    }

    @Bindable
    public String getF503ax() {
        return f503ax;
    }

    public void setF503ax(String f503ax) {
        this.f503ax = f503ax;
        notifyPropertyChanged(BR.f503ax);
    }

    @Bindable
    public String getF504() {
        return f504;
    }

    public void setF504(String f504) {
        this.f504 = f504;
        notifyPropertyChanged(BR.f504);
    }

    @Bindable
    public String getF504ax() {
        return f504ax;
    }

    public void setF504ax(String f504ax) {
        this.f504ax = f504ax;
        notifyPropertyChanged(BR.f504ax);
    }

    @Bindable
    public String getF505() {
        return f505;
    }

    public void setF505(String f505) {
        this.f505 = f505;
        notifyPropertyChanged(BR.f505);
    }

    @Bindable
    public String getF505ax() {
        return f505ax;
    }

    public void setF505ax(String f505ax) {
        this.f505ax = f505ax;
        notifyPropertyChanged(BR.f505ax);
    }

    @Bindable
    public String getF506() {
        return f506;
    }

    public void setF506(String f506) {
        this.f506 = f506;
        notifyPropertyChanged(BR.f506);
    }

    @Bindable
    public String getF506ax() {
        return f506ax;
    }

    public void setF506ax(String f506ax) {
        this.f506ax = f506ax;
        notifyPropertyChanged(BR.f506ax);
    }

    @Bindable
    public String getF507() {
        return f507;
    }

    public void setF507(String f507) {
        this.f507 = f507;
        notifyPropertyChanged(BR.f507);
    }

    @Bindable
    public String getF507ax() {
        return f507ax;
    }

    public void setF507ax(String f507ax) {
        this.f507ax = f507ax;
        notifyPropertyChanged(BR.f507ax);
    }

    @Bindable
    public String getF508() {
        return f508;
    }

    public void setF508(String f508) {
        this.f508 = f508;
        notifyPropertyChanged(BR.f508);
    }

    @Bindable
    public String getF508ax() {
        return f508ax;
    }

    public void setF508ax(String f508ax) {
        this.f508ax = f508ax;
        notifyPropertyChanged(BR.f508ax);
    }

    @Bindable
    public String getF509() {
        return f509;
    }

    public void setF509(String f509) {
        this.f509 = f509;
        notifyPropertyChanged(BR.f509);
    }

    @Bindable
    public String getF509ax() {
        return f509ax;
    }

    public void setF509ax(String f509ax) {
        this.f509ax = f509ax;
        notifyPropertyChanged(BR.f509ax);
    }

    @Bindable
    public String getF510() {
        return f510;
    }

    public void setF510(String f510) {
        this.f510 = f510;
        notifyPropertyChanged(BR.f510);
    }

    @Bindable
    public String getF510ax() {
        return f510ax;
    }

    public void setF510ax(String f510ax) {
        this.f510ax = f510ax;
        notifyPropertyChanged(BR.f510ax);
    }

    @Bindable
    public String getF511() {
        return f511;
    }

    public void setF511(String f511) {
        this.f511 = f511;
        notifyPropertyChanged(BR.f511);
    }

    @Bindable
    public String getF511ax() {
        return f511ax;
    }

    public void setF511ax(String f511ax) {
        this.f511ax = f511ax;
        notifyPropertyChanged(BR.f511ax);
    }

    @Bindable
    public String getF512() {
        return f512;
    }

    public void setF512(String f512) {
        this.f512 = f512;
        notifyPropertyChanged(BR.f512);
    }

    @Bindable
    public String getF512ax() {
        return f512ax;
    }

    public void setF512ax(String f512ax) {
        this.f512ax = f512ax;
        notifyPropertyChanged(BR.f512ax);
    }

    @Bindable
    public String getF513() {
        return f513;
    }

    public void setF513(String f513) {
        this.f513 = f513;
        notifyPropertyChanged(BR.f513);
    }

    @Bindable
    public String getF513ax() {
        return f513ax;
    }

    public void setF513ax(String f513ax) {
        this.f513ax = f513ax;
        notifyPropertyChanged(BR.f513ax);
    }

    @Bindable
    public String getF514() {
        return f514;
    }

    public void setF514(String f514) {
        this.f514 = f514;
        notifyPropertyChanged(BR.f514);
    }

    @Bindable
    public String getF514ax() {
        return f514ax;
    }

    public void setF514ax(String f514ax) {
        this.f514ax = f514ax;
        notifyPropertyChanged(BR.f514ax);
    }

    @Bindable
    public String getF515() {
        return f515;
    }

    public void setF515(String f515) {
        this.f515 = f515;
        notifyPropertyChanged(BR.f515);
    }

    @Bindable
    public String getF515ax() {
        return f515ax;
    }

    public void setF515ax(String f515ax) {
        this.f515ax = f515ax;
        notifyPropertyChanged(BR.f515ax);
    }

    @Bindable
    public String getF516() {
        return f516;
    }

    public void setF516(String f516) {
        this.f516 = f516;
        notifyPropertyChanged(BR.f516);
    }

    @Bindable
    public String getF516ax() {
        return f516ax;
    }

    public void setF516ax(String f516ax) {
        this.f516ax = f516ax;
        notifyPropertyChanged(BR.f516ax);
    }

    @Bindable
    public String getF5image() {
        return f5image;
    }

    public void setF5image(String f5image) {
        this.f5image = f5image;
        notifyPropertyChanged(BR.f5image);
    }

    @Bindable
    public String getF601() {
        return f601;
    }

    public void setF601(String f601) {
        this.f601 = f601;
        notifyPropertyChanged(BR.f601);
    }

    @Bindable
    public String getF601ax() {
        return f601ax;
    }

    public void setF601ax(String f601ax) {
        this.f601ax = f601ax;
        notifyPropertyChanged(BR.f601ax);
    }

    @Bindable
    public String getF602() {
        return f602;
    }

    public void setF602(String f602) {
        this.f602 = f602;
        notifyPropertyChanged(BR.f602);
    }

    @Bindable
    public String getF602ax() {
        return f602ax;
    }

    public void setF602ax(String f602ax) {
        this.f602ax = f602ax;
        notifyPropertyChanged(BR.f602ax);
    }

    @Bindable
    public String getF603() {
        return f603;
    }

    public void setF603(String f603) {
        this.f603 = f603;
        notifyPropertyChanged(BR.f603);
    }

    @Bindable
    public String getF603ax() {
        return f603ax;
    }

    public void setF603ax(String f603ax) {
        this.f603ax = f603ax;
        notifyPropertyChanged(BR.f603ax);
    }

    @Bindable
    public String getF6image() {
        return f6image;
    }

    public void setF6image(String f6image) {
        this.f6image = f6image;
        notifyPropertyChanged(BR.f6image);
    }

    @Bindable
    public String getF701() {
        return f701;
    }

    public void setF701(String f701) {
        this.f701 = f701;
        notifyPropertyChanged(BR.f701);
    }

    @Bindable
    public String getF701ax() {
        return f701ax;
    }

    public void setF701ax(String f701ax) {
        this.f701ax = f701ax;
        notifyPropertyChanged(BR.f701ax);
    }

    @Bindable
    public String getF702a() {
        return f702a;
    }

    public void setF702a(String f702a) {
        this.f702a = f702a;
        notifyPropertyChanged(BR.f702a);
    }

    @Bindable
    public String getF702aax() {
        return f702aax;
    }

    public void setF702aax(String f702aax) {
        this.f702aax = f702aax;
        notifyPropertyChanged(BR.f702aax);
    }

    @Bindable
    public String getF702b() {
        return f702b;
    }

    public void setF702b(String f702b) {
        this.f702b = f702b;
        notifyPropertyChanged(BR.f702b);
    }

    @Bindable
    public String getF702bax() {
        return f702bax;
    }

    public void setF702bax(String f702bax) {
        this.f702bax = f702bax;
        notifyPropertyChanged(BR.f702bax);
    }

    @Bindable
    public String getF703a() {
        return f703a;
    }

    public void setF703a(String f703a) {
        this.f703a = f703a;
        notifyPropertyChanged(BR.f703a);
    }

    @Bindable
    public String getF703aax() {
        return f703aax;
    }

    public void setF703aax(String f703aax) {
        this.f703aax = f703aax;
        notifyPropertyChanged(BR.f703aax);
    }

    @Bindable
    public String getF703b() {
        return f703b;
    }

    public void setF703b(String f703b) {
        this.f703b = f703b;
        notifyPropertyChanged(BR.f703b);
    }

    @Bindable
    public String getF703bax() {
        return f703bax;
    }

    public void setF703bax(String f703bax) {
        this.f703bax = f703bax;
        notifyPropertyChanged(BR.f703bax);
    }

    @Bindable
    public String getF703c() {
        return f703c;
    }

    public void setF703c(String f703c) {
        this.f703c = f703c;
        notifyPropertyChanged(BR.f703c);
    }

    @Bindable
    public String getF703cax() {
        return f703cax;
    }

    public void setF703cax(String f703cax) {
        this.f703cax = f703cax;
        notifyPropertyChanged(BR.f703cax);
    }

    @Bindable
    public String getF704() {
        return f704;
    }

    public void setF704(String f704) {
        this.f704 = f704;
        notifyPropertyChanged(BR.f704);
    }

    @Bindable
    public String getF704ax() {
        return f704ax;
    }

    public void setF704ax(String f704ax) {
        this.f704ax = f704ax;
        notifyPropertyChanged(BR.f704ax);
    }

    @Bindable
    public String getF705() {
        return f705;
    }

    public void setF705(String f705) {
        this.f705 = f705;
        notifyPropertyChanged(BR.f705);
    }

    @Bindable
    public String getF705ax() {
        return f705ax;
    }

    public void setF705ax(String f705ax) {
        this.f705ax = f705ax;
        notifyPropertyChanged(BR.f705ax);
    }

    @Bindable
    public String getF7image() {
        return f7image;
    }

    public void setF7image(String f7image) {
        this.f7image = f7image;
        notifyPropertyChanged(BR.f7image);
    }

    @Bindable
    public String getF8011() {
        return f8011;
    }

    public void setF8011(String f8011) {
        this.f8011 = f8011;
        notifyPropertyChanged(BR.f8011);
    }

    @Bindable
    public String getF8012m() {
        return f8012m;
    }

    public void setF8012m(String f8012m) {
        this.f8012m = f8012m;
        notifyPropertyChanged(BR.f8012m);
    }

    @Bindable
    public String getF8012d() {
        return f8012d;
    }

    public void setF8012d(String f8012d) {
        this.f8012d = f8012d;
        notifyPropertyChanged(BR.f8012d);
    }

    @Bindable
    public String getF8021() {
        return f8021;
    }

    public void setF8021(String f8021) {
        this.f8021 = f8021;
        notifyPropertyChanged(BR.f8021);
    }

    @Bindable
    public String getF8022m() {
        return f8022m;
    }

    public void setF8022m(String f8022m) {
        this.f8022m = f8022m;
        notifyPropertyChanged(BR.f8022m);
    }

    @Bindable
    public String getF8022d() {
        return f8022d;
    }

    public void setF8022d(String f8022d) {
        this.f8022d = f8022d;
        notifyPropertyChanged(BR.f8022d);
    }

    @Bindable
    public String getF8031() {
        return f8031;
    }

    public void setF8031(String f8031) {
        this.f8031 = f8031;
        notifyPropertyChanged(BR.f8031);
    }

    @Bindable
    public String getF8032m() {
        return f8032m;
    }

    public void setF8032m(String f8032m) {
        this.f8032m = f8032m;
        notifyPropertyChanged(BR.f8032m);
    }

    @Bindable
    public String getF8032d() {
        return f8032d;
    }

    public void setF8032d(String f8032d) {
        this.f8032d = f8032d;
        notifyPropertyChanged(BR.f8032d);
    }

    @Bindable
    public String getF8041() {
        return f8041;
    }

    public void setF8041(String f8041) {
        this.f8041 = f8041;
        notifyPropertyChanged(BR.f8041);
    }

    @Bindable
    public String getF8042m() {
        return f8042m;
    }

    public void setF8042m(String f8042m) {
        this.f8042m = f8042m;
        notifyPropertyChanged(BR.f8042m);
    }

    @Bindable
    public String getF8042d() {
        return f8042d;
    }

    public void setF8042d(String f8042d) {
        this.f8042d = f8042d;
        notifyPropertyChanged(BR.f8042d);
    }

    @Bindable
    public String getF8051() {
        return f8051;
    }

    public void setF8051(String f8051) {
        this.f8051 = f8051;
        notifyPropertyChanged(BR.f8051);
    }

    @Bindable
    public String getF8052m() {
        return f8052m;
    }

    public void setF8052m(String f8052m) {
        this.f8052m = f8052m;
        notifyPropertyChanged(BR.f8052m);
    }

    @Bindable
    public String getF8052d() {
        return f8052d;
    }

    public void setF8052d(String f8052d) {
        this.f8052d = f8052d;
        notifyPropertyChanged(BR.f8052d);
    }

    @Bindable
    public String getF8061() {
        return f8061;
    }

    public void setF8061(String f8061) {
        this.f8061 = f8061;
        notifyPropertyChanged(BR.f8061);
    }

    @Bindable
    public String getF8062m() {
        return f8062m;
    }

    public void setF8062m(String f8062m) {
        this.f8062m = f8062m;
        notifyPropertyChanged(BR.f8062m);
    }

    @Bindable
    public String getF8062d() {
        return f8062d;
    }

    public void setF8062d(String f8062d) {
        this.f8062d = f8062d;
        notifyPropertyChanged(BR.f8062d);
    }

    @Bindable
    public String getF8071() {
        return f8071;
    }

    public void setF8071(String f8071) {
        this.f8071 = f8071;
        notifyPropertyChanged(BR.f8071);
    }

    @Bindable
    public String getF8072m() {
        return f8072m;
    }

    public void setF8072m(String f8072m) {
        this.f8072m = f8072m;
        notifyPropertyChanged(BR.f8072m);
    }

    @Bindable
    public String getF8072d() {
        return f8072d;
    }

    public void setF8072d(String f8072d) {
        this.f8072d = f8072d;
        notifyPropertyChanged(BR.f8072d);
    }

    @Bindable
    public String getF8081() {
        return f8081;
    }

    public void setF8081(String f8081) {
        this.f8081 = f8081;
        notifyPropertyChanged(BR.f8081);
    }

    @Bindable
    public String getF8082m() {
        return f8082m;
    }

    public void setF8082m(String f8082m) {
        this.f8082m = f8082m;
        notifyPropertyChanged(BR.f8082m);
    }

    @Bindable
    public String getF8082d() {
        return f8082d;
    }

    public void setF8082d(String f8082d) {
        this.f8082d = f8082d;
        notifyPropertyChanged(BR.f8082d);
    }

    @Bindable
    public String getF8091() {
        return f8091;
    }

    public void setF8091(String f8091) {
        this.f8091 = f8091;
        notifyPropertyChanged(BR.f8091);
    }

    @Bindable
    public String getF8092m() {
        return f8092m;
    }

    public void setF8092m(String f8092m) {
        this.f8092m = f8092m;
        notifyPropertyChanged(BR.f8092m);
    }

    @Bindable
    public String getF8092d() {
        return f8092d;
    }

    public void setF8092d(String f8092d) {
        this.f8092d = f8092d;
        notifyPropertyChanged(BR.f8092d);
    }

    @Bindable
    public String getF8image() {
        return f8image;
    }

    public void setF8image(String f8image) {
        this.f8image = f8image;
        notifyPropertyChanged(BR.f8image);
    }

    @Bindable
    public String getRsdremarks() {
        return rsdremarks;
    }

    public void setRsdremarks(String rsdremarks) {
        this.rsdremarks = rsdremarks;
        notifyPropertyChanged(BR.rsdremarks);
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
            json.put("f101", f101)
                    .put("f101ax", f101ax)
                    .put("f102", f102)
                    .put("f102ax", f102ax)
                    .put("f103", f103)
                    .put("f103ax", f103ax)
                    .put("f104", f104)
                    .put("f104ax", f104ax)
                    .put("f105", f105)
                    .put("f105ax", f105ax)
                    .put("f106", f106)
                    .put("f106ax", f106ax)
                    .put("f1image", f1image);
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

package pvp.com.fitmeband.constant;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


public class PrefManager {
    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    public static int PRIVATE_MODE = 0;

    // Shared preferences file name
    public static final String PREF_NAME = "cbroz";

    // All Shared Preferences Keys

    private static final String USER_ID = "id";

    private static final String NAME = "name";

    private static final String MOBILE = "mobile";

    private static final String EMAIL = "email";

    private static final String ADDRESS = "address";

    private static final String USERNAME = "username";

    private static final String PASS = "pass";

    private static final String DATE = "entry_date";

    private static final String ROLE = "role";

    private static final String SELECTED_PROJ_ID = "selected_proj_id";

    private static final String SELECTED_PROJ_TITLE = "selected_proj_title";

    private static final String SELECTED_PROJ_MESSAGE = "selected_proj_message";

    private static final String SELECTED_ENQUIRY_ID = "selected_enq_id";

    private static final String CREATE_CLIENT_PROJECT_ID = "create_client_project_id";

    private static final String SELECTED_CLIENT_PROJECT_ID = "selected_client_project_id";

    private static final String SELECTED_CLIENT_EDIT = "selected_client_edit";

    private static final String SELECTED_PROJECT_EDIT = "selected_project_edit";

    private static final String SELECTED_EVENT_ID = "selected_event_id";

    private static final String SELECTED_EVENT_TITLE = "selected_event_title";

    private static final String SELECTED_EVENT_MESSAGE = "selected_event_message";

    private static final String EVENT_FROM_DATE = "evet_fromdate";

    private static final String EVENT_TO_DATE = "evet_todate";

    //course

    private static final String SELECTED_COURSE_ID = "selected_course_id";

    private static final String SELECTED_COURSE_TITLE = "selected_course_title";

    private static final String SELECTED_COURSE_MESSAGE = "selected_course_message";

    private static final String COURSE_DATE = "course_fromdate";

    //product

    private static final String SELECTED_PRODUCT_ID = "selected_product_id";

    private static final String SELECTED_PRODUCT_TITLE = "selected_product_title";

    private static final String SELECTED_PRODUCT_MESSAGE = "selected_product_message";

    private static final String PRODUCT_DATE = "product_fromdate";

    private static final String ALL_BIRTHDATE = "all_birthdate";

    private static final String CLIENT_CLOSED = "client_closed";

    private static final String FROM_PROJECT_DETAILS = "from_project_details";

    private static final String SELECTED_COMP_ID = "selected_comp_id";

    private static final String SELECTED_COMP_TITLE = "selected_comp_title";

    private static final String SELECTED_COMP_MESSAGE = "selected_comp_message";

    private static final String COMP_COAST = "comp_coast";

    private static final String QUANTITY = "qua";

    private static final String IID = "iid";

    private static final String TOTAL = "total";

    private static final String ORD_ID = "ord_id";

    private static final String SELECTED_ENQ_TITLE = "selected_enq_title";

    private static final String SELECTED_ENQ_MESSAGE = "selected_enq_message";

    private static final String FACEBOOK_LOGIN = "fblogin";

    private static final String GPLUS_LOGIN = "gpluslogin";

    private static final String OTHER_COLLEGE_NAME = "clgname";

    private static final String OTHER_BRANCH_NAME = "branchname";

    private static final String ADMIN_ID = "admin_id";

    private static final String TYPE = "TYPE";

    private static final String SELECTLANG= "sl";


    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setNAME(String nm) {
        editor.putString(NAME, nm);
        editor.commit();
    }

    public String getNAME() {
        return pref.getString(NAME, null);
    }


    //
    public void setMOBILE(String mob) {
        editor.putString(MOBILE, mob);
        editor.commit();
    }

    public String getMOBILE() {
        return pref.getString(MOBILE, null);
    }

    //
    public void setEMAIL(String e) {
        editor.putString(EMAIL, e);
        editor.commit();
    }

    public String getEMAIL() {
        return pref.getString(EMAIL, null);
    }


    //
    public void setADDRESS(String add) {
        editor.putString(ADDRESS, add);
        editor.commit();
    }

    public String getADDRESS() {
        return pref.getString(ADDRESS, null);
    }


    //
    public void setUSERNAME(String un) {
        editor.putString(USERNAME, un);
        editor.commit();
    }

    public String getUSERNAME() {
        return pref.getString(USERNAME, null);
    }


    //
    public void setPASS(String p) {
        editor.putString(PASS, p);
        editor.commit();
    }

    public String getPASS() {
        return pref.getString(PASS, null);
    }


    //
    public void setDATE(String dt) {
        editor.putString(DATE, dt);
        editor.commit();
    }

    public String getDATE() {
        return pref.getString(DATE, null);
    }



    //
    public void setROLE(String rl) {
        editor.putString(ROLE, rl);
        editor.commit();
    }

    public String getROLE() {
        return pref.getString(ROLE, null);
    }



    //
    public void setUSER_ID(String uid) {
        editor.putString(USER_ID, uid);
        editor.commit();
    }

    public String getUSER_ID() {
        return pref.getString(USER_ID, null);
    }

    //
    public void setSELECTED_PROJ_ID(String spid) {
        editor.putString(SELECTED_PROJ_ID, spid);
        editor.commit();
    }

    public String getSELECTED_PROJ_ID() {
        return pref.getString(SELECTED_PROJ_ID, null);
    }

    //
    public void setSELECTED_PROJ_TITLE(String spt) {
        editor.putString(SELECTED_PROJ_TITLE, spt);
        editor.commit();
    }

    public String getSELECTED_PROJ_TITLE() {
        return pref.getString(SELECTED_PROJ_TITLE, null);
    }

    //
    public void setSELECTED_PROJ_MESSAGE(String spm) {
        editor.putString(SELECTED_PROJ_MESSAGE, spm);
        editor.commit();
    }

    public String getSELECTED_PROJ_MESSAGE() {
        return pref.getString(SELECTED_PROJ_MESSAGE, null);
    }

    //
    public void setSELECTED_ENQUIRY_ID(String seid) {
        editor.putString(SELECTED_ENQUIRY_ID, seid);
        editor.commit();
    }

    public String getSELECTED_ENQUIRY_ID() {
        return pref.getString(SELECTED_ENQUIRY_ID, null);
    }


    //
    public void setCREATE_CLIENT_PROJECT_ID(String ccpid) {
        editor.putString(CREATE_CLIENT_PROJECT_ID, ccpid);
        editor.commit();
    }

    public String getCREATE_CLIENT_PROJECT_ID() {
        return pref.getString(CREATE_CLIENT_PROJECT_ID, null);
    }

    //
    public void setSELECTED_CLIENT_PROJECT_ID(String scpit) {
        editor.putString(SELECTED_CLIENT_PROJECT_ID, scpit);
        editor.commit();
    }

    public String getSELECTED_CLIENT_PROJECT_ID() {
        return pref.getString(SELECTED_CLIENT_PROJECT_ID, null);
    }

    //
    public void setSELECTED_CLIENT_EDIT(String sce) {
        editor.putString(SELECTED_CLIENT_EDIT, sce);
        editor.commit();
    }

    public String getSELECTED_CLIENT_EDIT() {
        return pref.getString(SELECTED_CLIENT_EDIT, null);
    }

        //
    public void setSELECTED_PROJECT_EDIT(String spe) {
        editor.putString(SELECTED_PROJECT_EDIT, spe);
        editor.commit();
    }

    public String getSELECTED_PROJECT_EDIT() {
        return pref.getString(SELECTED_PROJECT_EDIT, null);
    }


    //
    public void setSELECTED_EVENT_ID(String seid) {
        editor.putString(SELECTED_EVENT_ID, seid);
        editor.commit();
    }

    public String getSELECTED_EVENT_ID() {
        return pref.getString(SELECTED_EVENT_ID, null);
    }


    //
    public void setSELECTED_EVENT_TITLE(String et) {
        editor.putString(SELECTED_EVENT_TITLE, et);
        editor.commit();
    }

    public String getSELECTED_EVENT_TITLE() {
        return pref.getString(SELECTED_EVENT_TITLE, null);
    }


    //
    public void setSELECTED_EVENT_MESSAGE(String em) {
        editor.putString(SELECTED_EVENT_MESSAGE, em);
        editor.commit();
    }

    public String getSELECTED_EVENT_MESSAGE() {
        return pref.getString(SELECTED_EVENT_MESSAGE, null);
    }

    //
    public void setEVENT_FROM_DATE(String fd) {
        editor.putString(EVENT_FROM_DATE, fd);
        editor.commit();
    }

    public String getEVENT_FROM_DATE() {
        return pref.getString(EVENT_FROM_DATE, null);
    }

    //
    public void setEVENT_TO_DATE(String td) {
        editor.putString(EVENT_TO_DATE, td);
        editor.commit();
    }

    public String getEVENT_TO_DATE() {
        return pref.getString(EVENT_TO_DATE, null);
    }

    //
    public void setSELECTED_COURSE_ID(String cid) {
        editor.putString(SELECTED_COURSE_ID, cid);
        editor.commit();
    }

    public String getSELECTED_COURSE_ID() {
        return pref.getString(SELECTED_COURSE_ID, null);
    }

    //
    public void setSELECTED_COURSE_TITLE(String ct) {
        editor.putString(SELECTED_COURSE_TITLE, ct);
        editor.commit();
    }

    public String getSELECTED_COURSE_TITLE() {
        return pref.getString(SELECTED_COURSE_TITLE, null);
    }

      //
    public void setSELECTED_COURSE_MESSAGE(String cm) {
        editor.putString(SELECTED_COURSE_MESSAGE, cm);
        editor.commit();
    }

    public String getSELECTED_COURSE_MESSAGE() {
        return pref.getString(SELECTED_COURSE_MESSAGE, null);
    }

    //
    public void setCOURSE_DATE(String cd) {
        editor.putString(COURSE_DATE, cd);
        editor.commit();
    }

    public String getCOURSE_DATE() {
        return pref.getString(COURSE_DATE, null);
    }


    //
    public void setSELECTED_PRODUCT_ID(String pid) {
        editor.putString(SELECTED_PRODUCT_ID, pid);
        editor.commit();
    }

    public String getSELECTED_PRODUCT_ID() {
        return pref.getString(SELECTED_PRODUCT_ID, null);
    }


    //
    public void setSELECTED_PRODUCT_TITLE(String pt) {
        editor.putString(SELECTED_PRODUCT_TITLE, pt);
        editor.commit();
    }

    public String getSELECTED_PRODUCT_TITLE() {
        return pref.getString(SELECTED_PRODUCT_TITLE, null);
    }

    //
    public void setSELECTED_PRODUCT_MESSAGE(String pm) {
        editor.putString(SELECTED_PRODUCT_MESSAGE, pm);
        editor.commit();
    }

    public String getSELECTED_PRODUCT_MESSAGE() {
        return pref.getString(SELECTED_PRODUCT_MESSAGE, null);
    }

    //
    public void setPRODUCT_DATE(String pd) {
        editor.putString(PRODUCT_DATE, pd);
        editor.commit();
    }

    public String getPRODUCT_DATE() {
        return pref.getString(PRODUCT_DATE, null);
    }

    //
    public void setALL_BIRTHDATE(String bd) {
        editor.putString(ALL_BIRTHDATE, bd);
        editor.commit();
    }

    public String getALL_BIRTHDATE() {
        return pref.getString(ALL_BIRTHDATE, null);
    }

    //
    public void setCLIENT_CLOSED(String cc) {
        editor.putString(CLIENT_CLOSED, cc);
        editor.commit();
    }

    public String getCLIENT_CLOSED() {
        return pref.getString(CLIENT_CLOSED, null);
    }

    //
    public void setFROM_PROJECT_DETAILS(String fpd) {
        editor.putString(FROM_PROJECT_DETAILS, fpd);
        editor.commit();
    }

    public String getFROM_PROJECT_DETAILS() {
        return pref.getString(FROM_PROJECT_DETAILS, null);
    }


    //
    public void setSELECTED_COMP_ID(String cid) {
        editor.putString(SELECTED_COMP_ID, cid);
        editor.commit();
    }

    public String getSELECTED_COMP_ID() {
        return pref.getString(SELECTED_COMP_ID, null);
    }

    //
    public void setSELECTED_COMP_TITLE(String ct) {
        editor.putString(SELECTED_COMP_TITLE, ct);
        editor.commit();
    }

    public String getSELECTED_COMP_TITLE() {
        return pref.getString(SELECTED_COMP_TITLE, null);
    }

    //
    public void setSELECTED_COMP_MESSAGE(String cm) {
        editor.putString(SELECTED_COMP_MESSAGE, cm);
        editor.commit();
    }

    public String getSELECTED_COMP_MESSAGE() {
        return pref.getString(SELECTED_COMP_MESSAGE, null);
    }


    //
    public void setCOMP_COAST(String cc) {
        editor.putString(COMP_COAST, cc);
        editor.commit();
    }

    public String getCOMP_COAST() {
        return pref.getString(COMP_COAST, null);
    }



    //
    public void setQUANTITY(String q) {
        editor.putString(QUANTITY, q);
        editor.commit();
    }

    public String getQUANTITY() {
        return pref.getString(QUANTITY, null);
    }


    //
    public void setIID(String q) {
        editor.putString(IID, q);
        editor.commit();
    }

    public String getIID() {
        return pref.getString(IID, null);
    }


    //
    public void setTOTAL(String t) {
        editor.putString(TOTAL, t);
        editor.commit();
    }

    public String getTOTAL() {
        return pref.getString(TOTAL, null);
    }

    //
    public void setORD_ID(String tid) {
        editor.putString(ORD_ID, tid);
        editor.commit();
    }

    public String getORD_ID() {
        return pref.getString(ORD_ID, null);
    }

     //
    public void setSELECTED_ENQ_TITLE(String et) {
        editor.putString(SELECTED_ENQ_TITLE, et);
        editor.commit();
    }

    public String getSELECTED_ENQ_TITLE() {
        return pref.getString(SELECTED_ENQ_TITLE, null);
    }

    //
    public void setSELECTED_ENQ_MESSAGE(String em) {
        editor.putString(SELECTED_ENQ_MESSAGE, em);
        editor.commit();
    }

    public String getSELECTED_ENQ_MESSAGE() {
        return pref.getString(SELECTED_ENQ_MESSAGE, null);
    }


    //
    public void setFACEBOOK_LOGIN(String fb) {
        editor.putString(FACEBOOK_LOGIN, fb);
        editor.commit();
    }

    public String getFACEBOOK_LOGIN() {
        return pref.getString(FACEBOOK_LOGIN, null);
    }


    //
    public void setGPLUS_LOGIN(String gp) {
        editor.putString(GPLUS_LOGIN, gp);
        editor.commit();
    }

    public String getGPLUS_LOGIN() {
        return pref.getString(GPLUS_LOGIN, null);
    }


    //
    public void setOTHER_COLLEGE_NAME(String scn) {
        editor.putString(OTHER_COLLEGE_NAME, scn);
        editor.commit();
    }

    public String getOTHER_COLLEGE_NAME() {
        return pref.getString(OTHER_COLLEGE_NAME, null);
    }


    //
    public void setADMIN_ID(String sbn) {
        editor.putString(ADMIN_ID, sbn);
        editor.commit();
    }

    public String getADMIN_ID() {
        return pref.getString(ADMIN_ID, null);
    }


    //
    public void setTYPE(String C) {
        editor.putString(TYPE, C);
        editor.commit();
    }

    public String getTYPE() {
        return pref.getString(TYPE, null);
    }



    //
    public void setSELECTLANG(String S) {
        editor.putString(SELECTLANG, S);
        editor.commit();
    }

    public String getSELECTLANG() {
        return pref.getString(SELECTLANG, null);
    }




}

package pvp.com.fitmeband.session_handler;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

/**
 * Created by Ganesh on 2/28/2017.
 */

public class SessionHelper {
    // LogCat tag
    private static String TAG = SessionHelper.class.getSimpleName();

    // Shared Preferences
    static SharedPreferences mInstance;

    static SessionHelper mSessionHelper;

    Editor editor;
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;


    // Shared preferences file name
    private static final String PREF_NAME = "HealTreeApp";

    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";

    private static final String KEY_USER_TYPE = "user_type";

    private static final String KEY_USER_ID = "user_id";

    private static final String KEY_USER_NAME = "user_name";

    private static final String KEY_USER_EMAIL = "user_email";

    private static final String KEY_USER_MOBILE = "user_mobile";

    private static final String KEY_USER_IMAGE = "user_image";


    private static final String TAG_TOKEN = "cbroz_app_fcm_token123";


    public SessionHelper(Context context) {
        this._context = context;
        mInstance = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = mInstance.edit();

        if(!mInstance.contains(KEY_IS_LOGGEDIN)) {
            editor.putBoolean(KEY_IS_LOGGEDIN, false);
            editor.putString(TAG_TOKEN, "No Token");
            editor.commit();
        }
    }



    public void setLogin(boolean isLoggedIn) {

        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn);

        // commit changes
        editor.commit();

        Log.d(TAG, "User login session modified!");
    }

    public void setLogout() {

        editor.clear();
        editor.commit();

        Log.d(TAG, "User logout from session!");
    }

    public boolean isLoggedIn(){
        return mInstance.getBoolean(KEY_IS_LOGGEDIN, false);
    }


    /********** Set Functions ************/

    public void setUserType(String stud_info) {
        editor.putString(KEY_USER_TYPE, stud_info);
        editor.commit();
    }
    public void setUserID(String stud_info) {
        editor.putString(KEY_USER_ID, stud_info);
        editor.commit();
    }
    public void setUserName(String stud_info) {
        editor.putString(KEY_USER_NAME, stud_info);
        editor.commit();
    }
    public void setUserEmail(String stud_info) {
        editor.putString(KEY_USER_EMAIL, stud_info);
        editor.commit();
    }
    public void setUserMobile(String stud_info) {
        editor.putString(KEY_USER_MOBILE, stud_info);
        editor.commit();
    }
    public void setUserImage(String stud_info) {
        editor.putString(KEY_USER_IMAGE, stud_info);
        editor.commit();
    }

    /********** Get Functions ************/

    public String getUserType() {
        return mInstance.getString(KEY_USER_TYPE,"");
    }
    public String getUserID() {
        return mInstance.getString(KEY_USER_ID,"");
    }
    public String getUserName() {
        return mInstance.getString(KEY_USER_NAME,"");
    }
    public String getUserEmail() {
        return mInstance.getString(KEY_USER_EMAIL,"");
    }
    public String getUserMobile() {
        return mInstance.getString(KEY_USER_MOBILE,"");
    }
    public String getUserImage() {
        return mInstance.getString(KEY_USER_IMAGE, "");
    }


    /***********FCM Settings**************/


    public static synchronized SessionHelper getInstance(Context context) {
        if (mSessionHelper == null) {
            mSessionHelper = new SessionHelper(context);
        }
        return mSessionHelper;
    }

    //this method will save the device token to shared preferences
    public boolean saveDeviceToken(String token){
        SharedPreferences sharedPreferences = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        Editor editor = sharedPreferences.edit();
        editor.putString(TAG_TOKEN, token);
        editor.apply();
        return true;
    }

    //this method will fetch the device token from shared preferences
    public String getDeviceToken(){
        SharedPreferences sharedPreferences = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return  sharedPreferences.getString(TAG_TOKEN, null);
    }


}

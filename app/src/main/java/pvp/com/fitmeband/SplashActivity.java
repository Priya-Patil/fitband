package pvp.com.fitmeband;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import pvp.com.fitmeband.constant.PrefManager;
import pvp.com.fitmeband.session_handler.SessionHelper;

public class SplashActivity extends AppCompatActivity {

    LinearLayout layout1, activity_splash;

    ScrollView sc;

    EditText euser_name, euser_pass;
    String username, pass;

    PrefManager prefManager;
    SessionHelper session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        prefManager=new PrefManager(SplashActivity.this);

        prefManager.setSELECTLANG("en");


        session = new SessionHelper(getApplicationContext());


        //euser_name.setText(refreshedToken);
        ((ImageView)findViewById(R.id.imageView1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_1000));

        ActionBar actionBar = getSupportActionBar();
        if(null != actionBar){
            actionBar.hide();
            //activity_splash.setBackgroundColor(Color.WHITE);
        }

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){

                session = new SessionHelper(getApplicationContext());

                if(session.isLoggedIn())
                {
                    Intent startActivityIntent = new Intent(SplashActivity.this, RActivity.class);
                    startActivity(startActivityIntent);
                    SplashActivity.this.finish();
                }
                else
                {
                    Intent startActivityIntent = new Intent(SplashActivity.this, RActivity.class);
                    startActivity(startActivityIntent);
                    SplashActivity.this.finish();
                }


            }
        }, 2000);
    }


}



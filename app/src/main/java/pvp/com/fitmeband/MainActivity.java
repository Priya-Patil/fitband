package pvp.com.fitmeband;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import pvp.com.fitmeband.constant.PrefManager;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;

    PrefManager prefManager;

    String fs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefManager=new PrefManager(MainActivity.this);
        b1= (Button) findViewById(R.id.t);
        b2= (Button) findViewById(R.id.h);
        b3= (Button) findViewById(R.id.s);
        b4= (Button) findViewById(R.id.d);
        b5= (Button) findViewById(R.id.c);


        fs=  prefManager.getTYPE();

        String[] namesList = fs.split(",");

        String name0 = namesList [0];
        String name1 = namesList [1];

        String name2 = namesList [2];
        String name3 = namesList [3];

        String name4 = namesList [4];

        b1.setText("Temparature: "+name0);
        b2.setText("Sweat: "+name1);
        b3.setText("Step Count: "+name2);
        b4.setText("Distance: "+name3);
        b5.setText("Calories: "+name4);

        if(Float.parseFloat(name1)>70)
        {
            Toast.makeText(getBaseContext(), "Your sweating calm down...", Toast.LENGTH_SHORT).show();
        }
        else {

        }

    }
}

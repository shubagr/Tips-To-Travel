package com.android.shubhamagrawal.tipstotravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


           }



    public void continuewiththiscountry(View view)
    {
                   Intent intent = new Intent(this, Main2Activity.class);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);

            }

    }
}


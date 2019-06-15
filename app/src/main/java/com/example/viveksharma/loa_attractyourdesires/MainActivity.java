package com.example.viveksharma.loa_attractyourdesires;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler h =new Handler();
        h.postDelayed(r,3000);
    }
    Runnable r= new Runnable() {
        @Override
        public void run() {
            Intent i=new Intent(MainActivity.this,HomeScreen.class);
            startActivity(i);
            finish();
        }
    };
}

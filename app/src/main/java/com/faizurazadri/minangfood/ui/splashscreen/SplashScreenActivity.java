package com.faizurazadri.minangfood.ui.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.faizurazadri.minangfood.R;
import com.faizurazadri.minangfood.ui.register.RegisterActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        if (getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread splash = new Thread(){
            @Override
            public void run() {
                super.run();

                try {

                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreenActivity.this, RegisterActivity.class));
                    finish();
                }
            }
        };

        splash.start();
    }
}
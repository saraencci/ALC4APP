package com.saraencci.alc4app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.DisplayCutout;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            DisplayCutout displayCutout = getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();        }
        setContentView(R.layout.activity_profile);
        assert getSupportActionBar() != null;   //null check
        setTitle("My Profile");









    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    }


package com.example.temas_con_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private Resources.Theme Dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner1);









        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public  void onActivityCreateSetTheme(Activity activity_main) {
                switch (spinner1) {
                    default:
                    case Dia:
                        activity_main.setTheme(R.style.Dia);
                        break;
                    case Noche:
                        break;
                }
            }
        });



    }
}


switch_btn.setOnClickListener(View.OnClickListener {
        if(isNightModeOn){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        switch_btn.text = "Enable Dark Mode"
        } else {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        switch_btn.text = "Disable Dark Mode"
        }
        })
package com.echo.seriouseries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Serie extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie);

        Bundle extras = getIntent().getExtras();
        String mValue = extras.getString("extra");
        TextView textView = (TextView) findViewById(R.id.Header);
        textView.setText(mValue);

        TextView tv = (TextView) findViewById(R.id.explanation);
        tv.setText(" While a civil war brews between several " +
                    "noble families in Westeros, the children of the " +
                    "former rulers of the land attempt to rise up to " +
                    "power. Meanwhile a forgotten race, bent on destruction, " +
                    "plans to return after thousands of years in the North. ");


    }
}


package com.echo.seriouseries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        ImageView image= (ImageView)findViewById(R.id.imageView);
        image.setImageResource(R.drawable.profile);

        TextView textView1 = (TextView) findViewById(R.id.EmailText);

        Intent intent = getIntent();
        String str = intent.getStringExtra("location");
        textView1.setText("Your E_Mail Adress : "+ str);

        Bundle extras = getIntent().getExtras();
        String mValue = extras.getString("profil");
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setText("Your Last Serie : " + mValue);


        findViewById(R.id.series).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, FavoriteSeries.class));
            }
        });


    }
}

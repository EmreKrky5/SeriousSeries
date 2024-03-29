package com.echo.seriouseries;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FavoriteSeries extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] android_versions = {
            "Game of Thrones",
            "Arrow",
            "The Walking Dead",
            "Sherlock",
            "The Flash",
            "The Big Bang Theory",
            "Supernatural",
            "Gotham",
            "Marvel’s Agents of S.H.I.E.L.D",
            "Vikings",
            "Breaking Bad",
            "Once Upon a Time",
            "The Vampire Diaries",
            "American Horror Story",
            "The 100",
            "Suits",
            "Under The Dome",
            "True Detective",
            "Da Vinci’s Demons",
            "How I Met Your Mother",
            "The Blacklist",
            "Hannibal",
            "Person of Interest",
            "The Originals",
            "Homeland",
            "Dexter",
            "Orphan Black",
            "Orange Is The New Black",
            "Teen Wolf",
            "Elementary",
            "New Girl",
            "Doctor Who",
            "Fargo",
            "Modern Family",
            "Shameless",
            "House of Cards",
            "2 Broke Girls",
            "Sleepy Hollow",
            "Constantine",
            "Grimm",
            "The Mentalist",
            "Forever",
            "House",
            "Marvel’s Daradevil",
            "Revolution",
            "Bates Motel",
            "The Following",
            "Pretty Little Liars",
            "Falling Skies",
            "Continuum"

    };

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_series);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, (android.R.layout.simple_list_item_1), android_versions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " is selected", Toast.LENGTH_LONG).show();
                String text= (String) listView.getItemAtPosition(position);

                Intent i=new Intent(FavoriteSeries.this ,Serie.class );
                i.putExtra("extra",text);
                startActivity(i);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String text= (String) listView.getItemAtPosition(position);

                Intent i=new Intent(FavoriteSeries.this ,ProfilePage.class );
                i.putExtra("profil",text);
                startActivity(i);
                return false;
            }
        });
    }
}



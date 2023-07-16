package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        ArrayList<String>myFamily = new ArrayList<String>();

        myFamily.add("baba");
        myFamily.add("mama");
        myFamily.add("Mu");
        myFamily.add("simi");
        myFamily.add("Jeje");
        //What we're going to use is something called an array adapter.
        //
        //And what this essentially allows us to do is to convert our array list, which we already have, into
        //
        //a different format.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,myFamily);

        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Log.i("Person tapped:", myFamily.get(position));

            }
        });
    }
}
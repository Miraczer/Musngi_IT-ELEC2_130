package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Spinner spinner = (Spinner) findViewById(R.id.characters);
    // Create an ArrayAdapter using the string array and a default spinner layout
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                    R.array.characters, android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
            spinner.setAdapter(adapter);


        //listview=(ListView)findViewById(R.id.listView);
        //listItem = getResources().getStringArray(R.array.array_technology);
        //final ArrayAdapter<String> adapter = new ArrayAdapter
    }
}
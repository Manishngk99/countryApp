package com.example.countryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView Countries;

    public static final String countries[] = {
            "Nepal", "Kathmandu",
            "India", "New Delhi",
            "China", "Beijing",

    };

    private Map<String,String> countriesMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Countries = findViewById(R.id.countries);

        countriesMap = new HashMap<>();
        for (int i = 0; i <countries.length; i +=2){
            countriesMap.put(countries[i], countries[i+1]);
        }

        ArrayAdapter countriesAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                new ArrayList(countriesMap.keySet()));

        Countries.setAdapter(countriesAdapter);



    }
}

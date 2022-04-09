package com.kaushal.autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView auto;
    String name[] = {"kaushal"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto = findViewById(R.id.auto);
        adapter = new ArrayAdapter<String>(MainActivity.this);
        auto.setAdapter(adapter);
        auto.setThreshold(1);
    }
}
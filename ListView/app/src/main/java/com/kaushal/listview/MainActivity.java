package com.kaushal.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String name[] = {"kaushal" , "palak" , "vishi"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                switch (pos)
                {

                    case 0:
                        Intent i = new Intent(MainActivity.this,Second.class);
                        Toast.makeText(MainActivity.this,"kaushal",Toast.LENGTH_LONG).show();
                        startActivity(i);

                    case 1:
                        Toast.makeText(MainActivity.this,"palak",Toast.LENGTH_LONG).show();
                    case 2:
                        Toast.makeText(MainActivity.this,"vishi",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
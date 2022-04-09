package com.kaushal.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String name[] = {"kaushal" , "palak" , "vishi"};
    Integer image[] = {R.drawable.mario, R.drawable.mario,R.drawable.mario};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        CustomList cs = new CustomList(MainActivity.this , name , image);
        listView.setAdapter(cs);
    }
}
package com.kaushal.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ContentView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomList extends ArrayAdapter {

    Activity c;
    String name1[];
    Integer image1[];
    public CustomList(@NonNull Context context , String[] resources , Integer[] textViewResourceId)
    {
        super(context,R.layout.activity_main , resources);

        c = (Activity) context;
        name1 = resources;
        image1 = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater lf =c.getLayoutInflater();
        convertView = lf.inflate(R.layout.simple,null);
        TextView tv = convertView.findViewById(R.id.text);
        ImageView iv = convertView.findViewById(R.id.image);

        tv.setText(name1[position]);

        iv.setImageResource(image1[position]);

        return convertView;
    }
}

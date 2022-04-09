package com.kaushal.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText text;
    Button click;
    String s1;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.txt);
        click = findViewById(R.id.convert);

        textToSpeech = new TextToSpeech(MainActivity.this, this);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1 = text.getText().toString();
                textToSpeech.speak(s1,TextToSpeech.QUEUE_ADD, null);

            }
        });


    }

    @Override
    public void onInit(int i) {

        textToSpeech.setLanguage(Locale.ENGLISH);
        textToSpeech.setSpeechRate(0.8f);

    }
}
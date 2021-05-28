package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txtTitle);
        imageView = findViewById(R.id.image_nature);

        String name = "Kara-Balta";
        String name2 = "Geek Tech";

        textView.setText(name);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals(name)){
                    textView.setText(name2);
                }else {
                    textView.setText(name);
                }

            }
        });
    }
}
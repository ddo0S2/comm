package com.example.comm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class purpose extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purpose);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton back1_button = (ImageButton) findViewById(R.id.back1_button);
        back1_button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fourselect.class);
                startActivity(intent);
            }
        });


    }
}
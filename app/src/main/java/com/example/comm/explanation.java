package com.example.comm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class explanation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explanation);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton back2_button = (ImageButton) findViewById(R.id.back2_button);
        back2_button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fourselect.class);
                startActivity(intent);
            }
        });


    }
}

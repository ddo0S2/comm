package com.example.comm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.comm.R;

public class fourselect extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourselect);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton way_button = (ImageButton) findViewById(R.id.way_button);
        way_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),explanation.class);
                startActivity(intent);
            }
        });

        ImageButton purpose_button =  findViewById(R.id.purpose_button);
        purpose_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),purpose.class);
                startActivity(intent);
            }
        });

        ImageButton measure_button =  findViewById(R.id.measure_button);
        measure_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
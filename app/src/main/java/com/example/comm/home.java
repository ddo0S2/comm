package com.example.comm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // activity_main.xml로 변경

        // 버튼 클릭 이벤트 처리
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button startbutton = findViewById(R.id.startbutton);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fourselect.class);
                startActivity(intent);
                finish(); // MainActivity 종료
            }
        });
    }
}
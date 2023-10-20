package com.example.our_dialect;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_gangwon, btn_chungcheong, btn_gyeongsang, btn_jeolla, btn_jeju;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //타이틀 바 없애기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn_gangwon = findViewById(R.id.btn_gangwon);
        btn_chungcheong = findViewById(R.id.btn_chungcheong);
        btn_gyeongsang = findViewById(R.id.btn_gyeongsang);
        btn_jeolla = findViewById(R.id.btn_jeolla);
        btn_jeju = findViewById(R.id.btn_jeju);

        //버튼 이벤트
        btn_gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, search.class);
            }
        });
        btn_gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, search.class);
            }
        });
    }
}
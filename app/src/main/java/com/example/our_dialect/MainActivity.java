package com.example.our_dialect;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_gangwon:
                        intent = new Intent(MainActivity.this, result_gangwon.class);
                        break;
                    case R.id.btn_chungcheong:
                        Log.d("", "DDd");
                        intent = new Intent(MainActivity.this, result_chungcheong.class);
                        break;
                    case R.id.btn_gyeongsang:
                        intent = new Intent(MainActivity.this, result_gyeongsang.class);
                        break;
                    case R.id.btn_jeolla:
                        intent = new Intent(MainActivity.this, result_jeolla.class);
                        break;
                    case R.id.btn_jeju:
                        intent = new Intent(MainActivity.this, result_jeju.class);
                        break;
                }
                startActivity(intent);
            }
        };
        
        //리스너 연결
        btn_gangwon.setOnClickListener(clickListener);
        btn_chungcheong.setOnClickListener(clickListener);
        btn_gyeongsang.setOnClickListener(clickListener);
        btn_jeolla.setOnClickListener(clickListener);
        btn_jeju.setOnClickListener(clickListener);

    }
}
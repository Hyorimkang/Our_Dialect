package com.example.our_dialect;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class result_gyeongsang extends AppCompatActivity {
    Button btn_translate;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_gyeongsang);

        //타이틀 바 없애기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn_translate = findViewById(R.id.btn_gyeongsang);

        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(result_gyeongsang.this, search.class);
                startActivity(intent);
            }
        });
    }
}
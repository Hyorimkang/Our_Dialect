package com.example.our_dialect;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class search extends AppCompatActivity {
    EditText edt_standard;
    Button btn_translate, btn_dic;
    TextView txt_dialect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //타이틀 바 없애기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        edt_standard = findViewById(R.id.edt_standard);
        btn_translate = findViewById(R.id.btn_translate);
        btn_dic = findViewById(R.id.btn_dic);
        txt_dialect = findViewById(R.id.txt_dialect);


    }
}
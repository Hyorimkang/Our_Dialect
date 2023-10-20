package com.example.our_dialect;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

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
        
        //버튼 이벤트
        btn_dic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://ko.dict.naver.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //editText 텍스트화
                String standard = edt_standard.getText().toString();

                HashMap<String, String> dialect = new HashMap<>();

                //데이터 삽입
                dialect.put("이쁘다", "( 제주도 ) 아치다");
                dialect.put("고양이", "( 제주도 ) 고냉이");
                dialect.put("땅", "( 강원도 ) 바당");
                dialect.put("국수", "( 강원도 ) 국시");
                dialect.put("거의", "( 충청도 ) 얼추");
                dialect.put("매일", "( 충청도 ) 니열");
                dialect.put("사랑해", "( 전라도 ) 거시기혀!");
                dialect.put("죽을래?", "( 전라도 ) 거시기할려?");
                dialect.put("힘들다", "( 경상도 ) 디다");
                dialect.put("어쩌나", "( 경상도 ) 우야꼬");

                //데이터 검색
                String search = dialect.get(standard);
                //텍스트뷰에 보여주기
                txt_dialect.setText(search);
            }
        });
       
        
        
    }
}
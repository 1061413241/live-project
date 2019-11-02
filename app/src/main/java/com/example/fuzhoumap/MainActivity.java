package com.example.fuzhoumap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.fuzhoumap.Utils.EchartOptionUtil;
import com.example.fuzhoumap.Utils.EchartView;

public class MainActivity extends AppCompatActivity {



    private Button btn_popular;
    private Button btn_cost;
    private Button btn_gather;
    private Button btn_clothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_popular = findViewById(R.id.btn_popular);
        btn_popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PopularActivity.class);
                startActivity(intent);
            }
        });
        btn_cost = findViewById(R.id.btn_cost);
        btn_cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CostActivity.class);
                startActivity(intent);
            }
        });
        btn_clothes = findViewById(R.id.btn_clothes);
        btn_clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ClothesActivity.class);
                startActivity(intent);
            }
        });
        btn_gather = findViewById(R.id.btn_gather);
        btn_gather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GatherActivity.class);
                startActivity(intent);
            }
        });





    }



}

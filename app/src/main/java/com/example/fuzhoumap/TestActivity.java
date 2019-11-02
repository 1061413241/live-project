package com.example.fuzhoumap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.fuzhoumap.Utils.BaiduResponse;
import com.example.fuzhoumap.Utils.JsonTset;
import com.example.fuzhoumap.Utils.ResultAdapter;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    private ListView listView;

    private List<BaiduResponse.Results> resultsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        listView = findViewById(R.id.list_view);
        for (int i = 0;i<10;i++){
            BaiduResponse.Results results = new BaiduResponse.Results("旺巴蜀小郡肝火锅串串香","4.9","100","串串香","博仕后购物广场国宾大道233号");
            resultsList.add(results);
        }

//        resultsList = JsonTset.deal();
        ResultAdapter resultAdapter = new ResultAdapter(TestActivity.this,R.layout.result_item,resultsList);
        listView.setAdapter(resultAdapter);
    }
}

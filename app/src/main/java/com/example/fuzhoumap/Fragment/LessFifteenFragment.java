package com.example.fuzhoumap.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fuzhoumap.R;
import com.example.fuzhoumap.Utils.BaiduResponse;
import com.example.fuzhoumap.Utils.JsonTset;
import com.example.fuzhoumap.Utils.ResultAdapter;

import java.util.ArrayList;
import java.util.List;

public class LessFifteenFragment extends Fragment implements View.OnClickListener {

    public LessFifteenFragment() {
        // Required empty public constructor
    }

    private View view;
    private Context mContext;
    private ListView listView;

    private List<BaiduResponse.Results> resultsList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_less_fifteen,container,false);
        mContext = view.getContext();
        init();
        return view;
    }

    @Override
    public void onClick(View v) {

    }

    public void  init(){

//        listView = view.findViewById(R.id.less_fifteen_list_view);
//        for (int i = 0;i<10;i++){
//            BaiduResponse.Results results = new BaiduResponse.Results("旺巴蜀小郡肝火锅串串香","4.9","100","串串香","博仕后购物广场国宾大道233号",2);
//            resultsList.add(results);
//        }

//        JsonTset jsonTset = new JsonTset();
//        jsonTset.deal();
//        resultsList = jsonTset.list;
//        ResultAdapter resultAdapter = new ResultAdapter(mContext,R.layout.result_item,resultsList);
//        listView.setAdapter(resultAdapter);
    }

}

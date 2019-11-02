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
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.fuzhoumap.R;
import com.example.fuzhoumap.Utils.EchartOptionUtil;
import com.example.fuzhoumap.Utils.EchartView;


public class LessTwoHundredFragment extends Fragment implements View.OnClickListener  {

    private EchartView lineChart;

    private View view;
    private Context mContext;

    public LessTwoHundredFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_less_two_hundred,container,false);
        mContext = view.getContext();

        lineChart.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                //最好在h5页面加载完毕后再加载数据，防止html的标签还未加载完成，不能正常显示
                refreshLineChart();
            }
        });

        return view;
    }

    @Override
    public void onClick(View v) {

    }

    private void refreshLineChart(){
        Object[] x = new Object[]{
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        };
        Object[] y = new Object[]{
                2, 5, 9, 3, 1, 4, 8
        };
        lineChart.refreshEchartsWithOption(EchartOptionUtil.getLineChartOptions(x, y));
    }
}

package com.example.fuzhoumap;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fuzhoumap.Fragment.LessFifteenFragment;
import com.example.fuzhoumap.Fragment.LessOneHundredFragment;
import com.example.fuzhoumap.Fragment.LessTwoHundredFragment;
import com.example.fuzhoumap.Fragment.MoreTwoHundredFragment;
import com.example.fuzhoumap.Utils.FragmentAdapter;

import java.util.ArrayList;
import java.util.List;

public class CostActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost);
        initWidgets();
        initViewPager();

    }

    private void initWidgets(){
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);
    }

    private void initViewPager(){
        List<String> titles = new ArrayList<>();
        titles.add("<50");
        titles.add("50~100");
        titles.add("100~200");
        titles.add(">200");
        for (int i = 0;i<titles.size();i++){
            mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(i)));
        }

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new LessFifteenFragment());
        fragments.add(new LessOneHundredFragment());
        fragments.add(new LessTwoHundredFragment());
        fragments.add(new MoreTwoHundredFragment());

        FragmentAdapter mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),fragments,titles);
        //给ViewPager设置适配器
        mViewPager.setAdapter(mFragmentAdapter);
        //将TabLayout和ViewPager关联
        mTabLayout.setupWithViewPager(mViewPager);
        //给TabLayout设置适配器
        mTabLayout.setTabsFromPagerAdapter(mFragmentAdapter);
    }
}

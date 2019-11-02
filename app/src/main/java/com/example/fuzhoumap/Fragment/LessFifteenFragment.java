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

import com.example.fuzhoumap.R;

public class LessFifteenFragment extends Fragment implements View.OnClickListener {

    public LessFifteenFragment() {
        // Required empty public constructor
    }

    private View view;
    private Context mContext;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_less_fifteen,container,false);
        mContext = view.getContext();
        return view;
    }

    @Override
    public void onClick(View v) {

    }

}

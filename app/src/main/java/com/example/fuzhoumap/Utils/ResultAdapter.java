package com.example.fuzhoumap.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fuzhoumap.R;

import java.util.List;

public class ResultAdapter extends ArrayAdapter<BaiduResponse.Results> {

    private int resourceId;

    public ResultAdapter(Context context, int textViewResourceId, List<BaiduResponse.Results> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaiduResponse.Results results = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.result_image = view.findViewById(R.id.result_image);
            viewHolder.result_name = view.findViewById(R.id.result_name);
            viewHolder.result_overall_rating = view.findViewById(R.id.result_overall_rating);
            viewHolder.result_tag = view.findViewById(R.id.result_tag);
            viewHolder.result_price = view.findViewById(R.id.result_price);
            viewHolder.result_address = view.findViewById(R.id.result_address);
            view.setTag(viewHolder);
        }
        else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
//        viewHolder.result_image.setImageResource();
        viewHolder.result_name.setText(results.getName());
        viewHolder.result_overall_rating.setText(results.detail_info.getOverall_rating());
        viewHolder.result_price.setText(results.detail_info.getPrice());
        viewHolder.result_tag.setText(results.detail_info.getTag());
        viewHolder.result_address.setText(results.getAddress());
        return view;
    }


    class ViewHolder{

        ImageView result_image;
        TextView result_name;
        TextView result_overall_rating;
        TextView result_price;
        TextView result_tag;
        TextView result_address;
        TextView result_distance;

    }

}

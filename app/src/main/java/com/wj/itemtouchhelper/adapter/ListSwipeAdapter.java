package com.wj.itemtouchhelper.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wj.itemtouchhelper.R;

import java.util.List;

/**
 * Created by wj on 2018/2/24.
 */

public class ListSwipeAdapter extends RecyclerView.Adapter<ListSwipeAdapter.MySwipeViewHolder> {

    private Context mContext;
    private List<String> list;

    public ListSwipeAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MySwipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_swipe, parent, false);
        return new MySwipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MySwipeViewHolder holder, int position) {
        holder.tvTitle.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MySwipeViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;

        public MySwipeViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}

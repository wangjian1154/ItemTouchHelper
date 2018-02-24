package com.wj.itemtouchhelper;

import android.app.Service;
import android.content.Context;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wj on 2018/2/24.
 */

public class ListDragAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<String> list;

    public ListDragAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_drag, parent, false);
        return new MyDragViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyDragViewHolder mHolder = (MyDragViewHolder) holder;
        mHolder.tvTag.setText(list.get(position));
        mHolder.llItem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //获取系统震动服务
                Vibrator vib = (Vibrator) mContext.getSystemService(Service.VIBRATOR_SERVICE);
                vib.vibrate(150);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyDragViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTag;
        private LinearLayout llItem;

        public MyDragViewHolder(View itemView) {
            super(itemView);
            tvTag = itemView.findViewById(R.id.tv_tag);
            llItem = itemView.findViewById(R.id.ll_item);
        }
    }
}

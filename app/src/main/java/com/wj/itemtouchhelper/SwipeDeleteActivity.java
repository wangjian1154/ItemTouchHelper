package com.wj.itemtouchhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SwipeDeleteActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] array = {"今日头条", "知乎", "网易新闻", "腾讯新闻", "稀土掘金", "简书", "美团", "饿了么",
            "新浪微博", "微信", "高德地图", "百度地图", "支付宝", "英雄联盟", "绝地求生", "荒野行动",
            "饥荒", "守望先锋", "王者荣耀", "QQ飞车"};
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_delete);

        recyclerView = findViewById(R.id.recyclerView);
        list=new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }


    }
}

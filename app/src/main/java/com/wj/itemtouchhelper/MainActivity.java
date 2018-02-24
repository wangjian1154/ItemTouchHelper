package com.wj.itemtouchhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSwipeDeleteListener(View view) {
        Intent intent = new Intent(MainActivity.this, SwipeDeleteActivity.class);
        startActivity(intent);
    }

    public void onLongDragListener(View view) {
        Intent intent = new Intent(MainActivity.this, LongDragActivity.class);
        startActivity(intent);
    }
}

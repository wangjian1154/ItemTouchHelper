package com.wj.itemtouchhelper.callback;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.wj.itemtouchhelper.listener.OnItemSwipeListener;

/**
 * Created by wj on 2018/2/24.
 * 滑动删除
 */

public class ItemSwipeHelperCallBack extends ItemTouchHelper.Callback {

    private OnItemSwipeListener onItemSwipeListener;

    public ItemSwipeHelperCallBack(OnItemSwipeListener onItemSwipeListener) {
        this.onItemSwipeListener = onItemSwipeListener;
    }

    /**
     * 返回可以滑动的方向
     *
     * @param recyclerView
     * @param viewHolder
     * @return
     */
    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
        int swipeFlags = 0;
        if (manager instanceof LinearLayoutManager) {
            //线性布局管理器只允许从右向左滑动
            swipeFlags = ItemTouchHelper.LEFT;
        }
        return makeMovementFlags(0, swipeFlags);
    }

    /**
     * 拖拽到新位置时候的回调方法
     *
     * @param recyclerView
     * @param viewHolder
     * @param target
     * @return
     */
    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    /**
     * 当用户左右滑动的时候执行的方法
     *
     * @param viewHolder
     * @param direction
     */
    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        if (onItemSwipeListener != null) {
            onItemSwipeListener.onItemSwiped(viewHolder.getAdapterPosition());
        }
    }

}

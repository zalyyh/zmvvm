package com.zalyyh.mvvm.viewadapter;

import android.databinding.BindingAdapter;
import android.view.View;

public class ViewAdapter {
    /**
     * 设置RecyclerView是否可以滑动
     * */
//    @BindingAdapter(value = {"android:NestedScrollingEnabled"}, requireAll = false)
//    public static void setNestedScrollingEnabled(RecyclerView view, boolean b) {
//        view.setNestedScrollingEnabled(b);
//    }

    /**
     * 设置RecyclerView是否可以滑动
     */
    @BindingAdapter(value = {"android:LeftPadding"}, requireAll = false)
    public static void setPaddingLeft(View view, int left) {
        view.setPadding(left, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }
    @BindingAdapter(value = {"android:visibility"}, requireAll = false)
    public static void setvisibility(View view, int visibility) {
        view.setVisibility(visibility);
    }

    
}

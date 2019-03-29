package com.zalyyh.mvvm.viewadapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ViewAdapter {
    /**
     * 设置RecyclerView是否可以滑动
     */
    @BindingAdapter(value = {"android:NestedScrollingEnabled"}, requireAll = false)
    public static void setNestedScrollingEnabled(RecyclerView view, boolean b) {
        view.setNestedScrollingEnabled(b);
    }

    /**
     * 设置RecyclerView是否可以滑动
     */
    @BindingAdapter(value = {"android:LeftPadding"}, requireAll = false)
    public static void setPaddingLeft(View view, int left) {
        view.setPadding(left, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }
    /**
     * 设置padding 值
     * */

    @BindingAdapter(value = {"android:RightPadding"}, requireAll = false)
    public static void setPaddingRight(View view, int right) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), right, view.getPaddingBottom());
    }

    @BindingAdapter(value = {"android:TopPadding"}, requireAll = false)
    public static void setPaddingTop(View view, int top) {
        view.setPadding(view.getPaddingLeft(), top, view.getPaddingRight(), view.getPaddingBottom());
    }

    @BindingAdapter(value = {"android:BottomPadding"}, requireAll = false)
    public static void setPaddingBottom(View view, int bottom) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), bottom);
    }

    @BindingAdapter(value = {"android:Padding"}, requireAll = false)
    public static void setPadding(View view, int pad) {
        view.setPadding(pad, pad, pad, pad);
    }

    /**
     * 显示隐藏
     * */
    @BindingAdapter(value = {"android:visibility"}, requireAll = false)
    public static void setvisibility(View view, int visibility) {
        view.setVisibility(visibility);
    }


}

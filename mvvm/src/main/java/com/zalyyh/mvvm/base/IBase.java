package com.zalyyh.mvvm.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface IBase<V> {
    /**
     * 初始化界面传递参数
     */
    void initParam();
     /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化界面观察者的监听
     */
    void initViewObservable();
    /**
     * 获取binding
     * */
    V getBinding();
}

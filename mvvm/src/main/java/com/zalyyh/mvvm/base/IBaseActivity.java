package com.zalyyh.mvvm.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface IBaseActivity <V> {
    /*私有的初始化Databinding和ViewModel方法*/
    View initViewDataBinding(@Nullable Bundle savedInstanceState);

}

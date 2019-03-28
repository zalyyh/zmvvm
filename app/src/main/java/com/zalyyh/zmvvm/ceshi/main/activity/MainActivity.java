package com.zalyyh.zmvvm.ceshi.main.activity;

import android.os.Bundle;

import com.zalyyh.mvvm.base.BaseActivity;
import com.zalyyh.zmvvm.R;
import com.zalyyh.zmvvm.BR;
import com.zalyyh.zmvvm.ceshi.main.model.MainViewModel;
import com.zalyyh.zmvvm.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
    }
}

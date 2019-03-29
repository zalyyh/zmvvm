package com.zalyyh.zmvvm;

import android.os.Bundle;

import com.zalyyh.mvvm.base.BaseActivity;
import com.zalyyh.zmvvm.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding,ViewModel>{


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
        model.getData();
    }
}

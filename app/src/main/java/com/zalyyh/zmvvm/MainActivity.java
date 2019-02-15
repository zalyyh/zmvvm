package com.zalyyh.zmvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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


}

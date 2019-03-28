package com.zalyyh.mvvm.base;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zalyyh.mvvm.messenger.Messenger;

public abstract class BaseFragment<V extends ViewDataBinding,VM extends BaseViewModel> extends RxFragment<V> {
    protected V binding;
    protected VM model;
    protected int viewModelId;

    @Override
    public void onDestroy() {
        super.onDestroy();
        //解除Messenger注册
        Messenger.getDefault().unregister(model);
        //解除ViewModel生命周期感应
        getLifecycle().removeObserver(model);
        model.removeRxBus();
        model = null;
        binding.unbind();
    }

    @Override
    public View initViewDataBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, initContentView(inflater, container, savedInstanceState), container, false);

        viewModelId = initVariableId();
        model = initViewModel();
        model = (VM) ViewModelProviders.of(this).get(BaseViewUtil.getModel(getClass().getGenericSuperclass()));
        //关联ViewModel
        binding.setVariable(viewModelId, model);
        //让ViewModel拥有View的生命周期感应
        getLifecycle().addObserver(model);
        //注入RxLifecycle生命周期
        model.injectLifecycleProvider(this);
        model.setActivity(getActivity());
        model.registerRxBus();
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    //刷新布局
    public void refreshLayout() {
        if (model != null) {
            binding.setVariable(viewModelId, model);
        }
    }


    /**
     * 初始化根布局
     *
     * @return 布局layout的id
     */
    public abstract int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    /**
     * 初始化ViewModel的id
     *
     * @return BR的id
     */
    public abstract int initVariableId();

    /**
     * 初始化ViewModel
     *
     * @return 继承BaseViewModel的ViewModel
     */
    public VM initViewModel() {
        return null;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initViewObservable() {

    }

    public boolean isBackPressed() {
        return false;
    }

    @Override
    public V getBinding() {
        return binding;
    }
}

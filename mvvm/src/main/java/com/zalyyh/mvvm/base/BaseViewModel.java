package com.zalyyh.mvvm.base;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.View;

import com.trello.rxlifecycle3.LifecycleProvider;
import com.zalyyh.mvvm.interfaces.IBaseActivity;
import com.zalyyh.mvvm.interfaces.IBaseViewModel;
import com.zalyyh.mvvm.interfaces.UIData;

public class BaseViewModel extends AndroidViewModel implements IBaseViewModel,UIData {
    private LifecycleProvider lifecycle;
    protected IBaseActivity baseActivity;
    protected Activity activity;


    public BaseViewModel(@NonNull Application application) {
        super(application);
    }
    public void setBaseActivity(IBaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * 注入RxLifecycle生命周期
     * @param lifecycle
     */
    public void injectLifecycleProvider(LifecycleProvider lifecycle) {
        this.lifecycle = lifecycle;
    }

    public LifecycleProvider getLifecycleProvider() {
        return lifecycle;
    }
    @Override
    public void onAny(LifecycleOwner owner, Lifecycle.Event event) {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void registerRxBus() {

    }

    @Override
    public void removeRxBus() {

    }

    @Override
    public void getData() {

    }

    @Override
    public BaseViewModel get() {
        return this;
    }


}

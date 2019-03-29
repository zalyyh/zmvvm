package com.zalyyh.zmvvm;

import android.app.Application;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.zalyyh.mvvm.base.BaseViewModel;

public class ViewModel extends BaseViewModel {
    public ObservableField<String> name = new ObservableField<>("123445");
    public ObservableInt isShows = new ObservableInt(View.VISIBLE);
    public ViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void getData() {
        super.getData();

        Log.e("1111",baseActivity.getBinding().getClass()+"");
    }
}

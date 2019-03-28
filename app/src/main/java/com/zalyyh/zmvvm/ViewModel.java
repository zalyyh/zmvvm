package com.zalyyh.zmvvm;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.zalyyh.mvvm.base.BaseViewModel;

public class ViewModel extends BaseViewModel {
    public ObservableField<String> name = new ObservableField<>("123445");
    public ViewModel(@NonNull Application application) {
        super(application);
    }
}

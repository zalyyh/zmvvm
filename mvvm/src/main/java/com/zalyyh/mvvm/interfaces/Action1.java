package com.zalyyh.mvvm.interfaces;

import io.reactivex.functions.Action;

public interface Action1<T> extends Action {
    void call(T t);
}

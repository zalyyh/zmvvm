package com.zalyyh.mvvm.binding.command;

import com.zalyyh.mvvm.R;

/**
 * Represents a function with zero arguments.
 *
 * @param <T> the result type
 */
public interface BindingFunction<T> {
    T call();
}

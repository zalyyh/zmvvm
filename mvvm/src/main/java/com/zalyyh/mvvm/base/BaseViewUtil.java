package com.zalyyh.mvvm.base;



import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseViewUtil {

    public static  Class getModel(Type type){
            Class modelClass;
            if (type instanceof ParameterizedType) {
                modelClass = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
            } else {
                //如果没有指定泛型参数，则默认使用BaseViewModel
                modelClass = BaseViewModel.class;
            }
        return modelClass;
    }
}

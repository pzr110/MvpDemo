package com.pzr.mvpdemo.base;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);//用于绑定View

    void showToast(String msg);//将通用方法封装到这里

}

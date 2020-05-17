package com.pzr.mvpdemo.presenter;

import android.os.Looper;

import com.pzr.mvpdemo.contract.LoginContract;

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View mView;

    public LoginPresenter(LoginContract.View view) {
        this.mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void login() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Looper.prepare();
                    mView.showToast("登录成功");
                    mView.gotoMain();
                    Looper.loop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void start() {
        login();// 初始化
    }
}

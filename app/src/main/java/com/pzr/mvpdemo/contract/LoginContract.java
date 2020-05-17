package com.pzr.mvpdemo.contract;

import com.pzr.mvpdemo.base.BasePresenter;
import com.pzr.mvpdemo.base.BaseView;

public class LoginContract {
    public interface View extends BaseView<Presenter> {
        void gotoMain();
    }

    public interface Presenter extends BasePresenter {
        void login();
    }
}

package com.acukanov.sibedge.ui.main;


import android.support.v4.app.Fragment;

import com.acukanov.sibedge.ui.base.IPresenter;
import com.acukanov.sibedge.utils.LogUtils;

import javax.inject.Inject;

public class MainPresenter implements IPresenter<IMainView> {
    private static final String LOG_TAG = LogUtils.makeLogTag(MainPresenter.class);
    private IMainView mMainView;

    @Inject MainPresenter() {}

    @Override
    public void attachView(IMainView IView) {
        mMainView = IView;
    }

    @Override
    public void detachView() {
        mMainView = null;
    }

    public void navigationItemSelected(Fragment fragment) {
        mMainView.onNavigationItemSelected(fragment);
    }

    public void setLocale() {
        mMainView.onSetLocale();
    }
}

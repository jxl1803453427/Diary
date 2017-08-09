package com.dd.diary.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        initView();
        initData();
        initEvent();
        load();

    }

    protected abstract int getLayout();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void load();
    protected abstract void initEvent();


}

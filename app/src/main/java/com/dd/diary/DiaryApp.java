package com.dd.diary;

import android.app.Application;
import android.util.DisplayMetrics;

import com.dd.diary.util.Config;
import com.dd.diary.util.Logger;

/**
 * Created by Administrator on 2017/8/6.
 */

public class DiaryApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initWindow();
    }

    private void initWindow(){
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        Config.density = metrics.density;
        Config.densityDpi = metrics.densityDpi;

        Logger.e("本机密度："+Config.density+"--------"+Config.densityDpi);

    }

}

package com.dd.diary;

import android.app.Application;
import android.util.DisplayMetrics;
import android.util.Log;

import com.dd.diary.util.Config;
import com.dd.diary.util.Logger;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by Administrator on 2017/8/6.
 */

public class DiaryApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initWindow();
        umengData();
    }

    private void initWindow(){
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        Config.density = metrics.density;
        Config.densityDpi = metrics.densityDpi;

        Logger.e("本机密度："+Config.density+"--------"+Config.densityDpi);


    }

    private void umengData(){

        MobclickAgent.startWithConfigure(new MobclickAgent.UMAnalyticsConfig(this
        ,"598c4cdda325114770000610","auth web channel", MobclickAgent.EScenarioType. E_UM_NORMAL));

        MobclickAgent.onProfileSignIn("123456");
        MobclickAgent.openActivityDurationTrack(false);//禁止默认统计方式（包含了fragment)


        MobclickAgent.setDebugMode(true);

    }


}

package com.dd.diary.util;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/6.
 */

public class Logger {

    public static String tag = "------------";
    public static void e(String str){
        Log.e(tag,str);
    }
}

package com.example.lenovo_g50_70.seniorskills;

import android.app.Application;
import android.content.Context;

/**
 * Created by lenovo-G50-70 on 2017/3/20.
 * 获取全局Context
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}

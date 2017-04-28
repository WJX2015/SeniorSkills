package com.example.lenovo_g50_70.seniorskills;

import android.util.Log;

/**
 * Created by lenovo-G50-70 on 2017/3/20.
 */

public class LogUtil {
    private static final int VERBOSE =1;
    private static final int DEBUG =2;
    private static final int INFO =3;
    private static final int WARN =4;
    private static final int ERROR =5;
    private static final int NOTHING =6;
    //通过改变下面level的值，实现自由控制日志打印的行为
    private static int level =VERBOSE;

    public static void v(String tag,String msg){
        if(level<=VERBOSE){
            Log.v(tag,msg);
        }
    }
    public static void d(String tag,String msg){
        if(level<=DEBUG){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if(level<=INFO){
            Log.i(tag,msg);
        }
    }
    public static void w(String tag,String msg){
        if(level<=WARN){
            Log.w(tag,msg);
        }
    }
    public static void e(String tag,String msg){
        if(level<=ERROR){
            Log.e(tag,msg);
        }
    }
}

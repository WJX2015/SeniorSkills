package com.example.lenovo_g50_70.seniorskills;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**
 * Created by lenovo-G50-70 on 2017/4/9.
 */

public class LongRuntimeService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 处理具体逻辑
                 * 逻辑操作耗时
                 * 在线程中处理
                 */
            }
        }).start();

        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        int anHour =60*60*1000;
        long triggerAtTime = SystemClock.elapsedRealtime()+anHour;
        Intent i =new Intent(this,LongRuntimeService.class);
        PendingIntent pi =PendingIntent.getService(this,0,i,0);
        //多少有延迟
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        //准确无误
        //manager.setExact(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime,pi);
        /**
         * AlarmManager.ELAPSED_REALTIME 系统开机算起,不唤醒CPU
         * AlarmManager.ELAPSED_REALTIME_WAKEUP 系统开机算起，唤醒CPU
         * AlarmManager.RTC 1970年1月1日0点算起，不唤醒CPU
         * AlarmManager.RTC_WAKEUP 1970年1月1日0点算起，唤醒CPU
         */

        return super.onStartCommand(intent, flags, startId);
    }
}

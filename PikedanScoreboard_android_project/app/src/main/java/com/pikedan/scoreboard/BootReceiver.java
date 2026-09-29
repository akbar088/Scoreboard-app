package com.pikedan.scoreboard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 开机自启动：设备重启完成后自动拉起计分器主界面。
 * 注意：国产 ROM（小米/华为/OPPO 等）还需在系统设置里
 * 授予本应用“自启动”权限，否则收不到开机广播。
 */
public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}

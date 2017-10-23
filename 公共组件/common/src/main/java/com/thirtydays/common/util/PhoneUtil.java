package com.thirtydays.common.util;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by chenxiaojin on 2017/10/19.
 * 获取手机信息工具类, IMEI、屏幕信息
 */

public class PhoneUtil {

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeigth(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int[] getScreenSize(Context context) {
        int[] screenSize = new int[2];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        screenSize[0] = displayMetrics.widthPixels;
        screenSize[1] = displayMetrics.heightPixels;
        return screenSize;
    }
}

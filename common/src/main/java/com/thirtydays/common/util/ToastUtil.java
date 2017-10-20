package com.thirtydays.common.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by chenxiaojin on 2017/10/20.
 * 显示吐司
 */

public class ToastUtil {
    /**
     * 显示提示
     * @param context
     * @param message
     */
    public static void showToast(Context context, String message) {
        if (null == context) {
            return;
        }
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示提示, 支持设置长度
     * @param context
     * @param message
     * @param len
     */
    public static void showToast(Context context, String message, int len) {
        if (null == context) {
            return;
        }
        Toast.makeText(context, message, len).show();
    }

    /**
     * 显示提示, 传资源ID
     * @param context
     * @param messageResId
     */
    public static void showToast(Context context, int messageResId) {
        if (null == context) {
            return;
        }
        Toast.makeText(context, messageResId, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示提示, 传资源ID, 支持设置长度
     * @param context
     * @param messageResId
     * @param len
     */
    public static void showToast(Context context, int messageResId, int len) {
        if (null == context) {
            return;
        }
        Toast.makeText(context, messageResId, len).show();
    }
}

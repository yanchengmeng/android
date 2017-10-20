package com.thirtydays.common.util;

import java.util.Date;

/**
 * Created by chenxiaojin on 2017/8/5.
 */

public class TimeUtil {
    /**
     * 传入秒数, 返回时分秒格式输出
     * @param duration
     * @return
     */
    public static String getTimeDesc(int duration) {
        if (duration < 60) {
            return "00:" + (duration < 10 ? "0" + duration : duration) + "";
        } else if (duration >= 60 && duration < 60 * 60) {
            int minute = duration / 60;
            int second = duration % 60;
            return (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second) + "";
        } else {
            int hour = duration / 3600;
            int minute = (duration % 3600) / 60;
            int second = (duration % 3600) % 60;
            return (hour < 10 ? "0" + hour : hour) + ":" + (minute < 10 ? "0" + minute : minute)
                    + ":" + (second < 10 ? "0" + second : second) + "";
        }
    }

    /**
     * 格式化时间, 比较当前时间
     * @param time
     * @return
     */
    public static String format2Unit(long time) {
        Date date = new Date(time);
        Date today = new Date();
        long result = today.getTime() - time;
        if (result <= 60 * 1000) {
            return "刚刚";
        } else if (result <= 60 * 60 * 1000) {
            return (int) Math.floor(result / (60 * 1000)) + "分钟前";
        } else if (result <= 24 * 60 * 60 * 1000) {
            if (today.getDate() != date.getDate()) {
                return (date.getMonth() + 1) + "月" + date.getDate() + "日";
            } else {
                return date.getHours() + "点" + date.getMinutes() + "分";
            }
        } else {
            return (date.getMonth() + 1) + "月" + date.getDate() + "日";
        }
    }
}

package com.thirtydays.common.util;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (null == str || str.trim().equals("") || str.trim().equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }

    /**
     * 格式化手机号码，加上超链接
     * @param text
     * @return
     */
    public static String formatTelphone2Hyperlink(String text) {
        String commentContent = StringUtil.isEmpty(text) ? "" : text;
        ArrayList<String> phoneNumbers = findNumber(commentContent);
        if (CollectionUtil.isEmpty(phoneNumbers)) {
            return commentContent;
        } else {
            StringBuilder stringBuilder = new StringBuilder(text);
            int index;
            String number = null;
            for (int i = 0, size = phoneNumbers.size(); i < size; i++) {
                number = phoneNumbers.get(i);
                index = commentContent.indexOf(number);
                stringBuilder.replace(index, number.length() + index, "<a color=\"#529E84\" href=\"tel:" + number + "\">" + number + "</a>");
            }
            return stringBuilder.toString();
        }
    }


    public static ArrayList<String> findNumber(String str) {
        ArrayList<String> result = new ArrayList<String>();
        Pattern p = Pattern.compile("\\d{7,}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            if (!isEmpty(m.group())) {
                result.add(m.group());
            }
        }
        return result;
    }



}

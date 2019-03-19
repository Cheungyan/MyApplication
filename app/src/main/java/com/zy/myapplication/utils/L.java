package com.zy.myapplication.utils;

import android.util.Log;

/**
 * 项目名：MyApplication
 * 包名：com.zy.myapplication.utils
 * Created by Administrator on 2019/3/19.
 * 描述：log封装
 */

public class L {

    //开关
    public static final boolean DEBUG =true;
    //TAG
    public static final String TAG="Smartbutler";

    //五个等级 DIWEF
    public static void d(String text)
    {
        if(DEBUG) {
            Log.d(TAG, text);
        }
    }
    public static void w(String text){
        if(DEBUG)
        {
            Log.w(TAG,text);
        }
    }
    public static void e(String text){
        if(DEBUG)
        {
            Log.e(TAG,text);
        }
    }

    public static void i(String text){
        if(DEBUG)
        {
            Log.i(TAG,text);
        }
    }
}

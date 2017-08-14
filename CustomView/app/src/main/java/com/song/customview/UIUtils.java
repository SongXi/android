package com.song.customview;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

/**
 * Created by zhaojp on 17-8-14.
 */

public class UIUtils {


  public static int dipToPx(Context context,int dp){
    WindowManager windowManager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
    DisplayMetrics displayMetrics = new DisplayMetrics();
    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
    float scaledDensity = displayMetrics.scaledDensity;
    return (int) (dp * scaledDensity + 0.5f);
  }
}

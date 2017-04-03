package com.shendrikov.alex.colorbuttons.model;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.util.Log;

/**
 * Created by Alex on 06.01.2017.
 */

public class ColorButton {

    private Context mContext;

    public static final String LOG_TAG = "MyLogs";

    public static final int RED = -769226;
    public static final int ORANGE = -26624;
    public static final int Indigo = -12627531;
    public static final int GREEN = -11751600;
    public static final int YELLOW = -5317;
    public static final int BLUE = -14575885;
    public static final int PINK = -1499549;
    public static final int CYAN = -16728876;
    public static final int BROUN = -8825528;
    public static final int AMBER = -16121;
    public static final int PURPLE = -6543440;
    public static final int LIME = -3285959;
    public static final int LIGHT_BLUE = -16537100;
    public static final int TEAL = -16738680;
    public static final int LIGHT_GREEN = -7617718;
    public static final int DEEP_PURPLE = -10011977;
    public static final int DEEP_ORANGE = -43230;
    public static final int BLUE_GREEN = -10453621;

    public ColorButton(Context context) {
        mContext = context;
    }

    private String mTitle;
    private boolean mSelected = false;
    @ColorRes
    private int mColorId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public int getColorId() {
        return mColorId;
    }

    public void setColorId(int mColorId) {
        this.mColorId = mColorId;
    }

    public String getColorName(@ColorRes int colorId) {

        String colorName = null;
        switch(colorId) {
            case ColorButton.RED:
                Log.d(LOG_TAG, "Red = " + ColorButton.RED);
                colorName = "Red";
                break;
            case ColorButton.ORANGE:
                Log.d(LOG_TAG, "Orange = " + ColorButton.ORANGE);
                colorName = "Orange";
                break;
            case ColorButton.Indigo:
                Log.d(LOG_TAG, "Indigo = " + ColorButton.Indigo);
                colorName = "Indigo";
                break;
            case ColorButton.GREEN:
                Log.d(LOG_TAG, "Green = " + ColorButton.GREEN);
                colorName = "Green";
                break;
            case ColorButton.YELLOW:
                Log.d(LOG_TAG, "Yellow = " + ColorButton.YELLOW);
                colorName = "Yellow";
                break;
            case ColorButton.BLUE:
                Log.d(LOG_TAG, "Blue = " + ColorButton.BLUE);
                colorName = "Blue";
                break;
            case ColorButton.PINK:
                Log.d(LOG_TAG, "Pink = " + ColorButton.PINK);
                colorName = "Pink";
                break;
            case ColorButton.CYAN:
                Log.d(LOG_TAG, "Cyan = " + ColorButton.CYAN);
                colorName = "Cyan";
                break;
            case ColorButton.BROUN:
                Log.d(LOG_TAG, "Broun = " + ColorButton.BROUN);
                colorName = "Broun";
                break;
            case ColorButton.AMBER:
                Log.d(LOG_TAG, "Amber = " + ColorButton.AMBER);
                colorName = "Amber";
                break;
            case ColorButton.PURPLE:
                Log.d(LOG_TAG, "Purple = " + ColorButton.PURPLE);
                colorName = "Purple";
                break;
            case ColorButton.LIME:
                Log.d(LOG_TAG, "Lime = " + ColorButton.LIME);
                colorName = "Lime";
                break;
            case ColorButton.LIGHT_BLUE:
                colorName = "Light Blue";
                break;
            case ColorButton.TEAL:
                colorName = "Teal";
                break;
            case ColorButton.LIGHT_GREEN:
                colorName = "Light Green";
                break;
            case ColorButton.DEEP_PURPLE:
                colorName = "Deep Purple";
                break;
            case ColorButton.DEEP_ORANGE:
                colorName = "Deep Orange";
                break;
            case ColorButton.BLUE_GREEN:
                colorName = "Blue Green";
                break;
            case Color.BLACK:
                Log.d(LOG_TAG, "Black = " + Color.BLACK);
                colorName = "Black";
                break;
            default:
                break;
        }
        return colorName;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public void setSelected(boolean selected) {
        mSelected = selected;
    }
}

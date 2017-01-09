package com.shendrikov.alex.colorbuttons.model;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.util.Log;

import com.shendrikov.alex.colorbuttons.R;

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

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
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

    @ColorRes
    public static int getColorId(String nameOfTheColor) {

        @ColorRes
        int resourceColor = 0;

            switch(nameOfTheColor) {
                case "Red":
                    resourceColor = R.color.Red500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Orange":
                    resourceColor = R.color.Orange500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Indigo":
                    resourceColor = R.color.Indigo500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Green":
                    resourceColor = R.color.Green500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Yellow":
                    resourceColor = R.color.Yellow500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Blue":
                    resourceColor = R.color.Blue500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Pink":
                    resourceColor = R.color.Pink500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Cyan":
                    resourceColor = R.color.Cyan500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Broun":
                    resourceColor = R.color.Broun500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Amber":
                    resourceColor = R.color.Amber500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Purple":
                    resourceColor = R.color.Purple500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Lime":
                    resourceColor = R.color.Lime500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Light Blue":
                    resourceColor = R.color.LightBlue500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Teal":
                    resourceColor = R.color.Teal500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Light Green":
                    resourceColor = R.color.LightGreen500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Deep Purple":
                    resourceColor = R.color.DeepPurple500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Deep Orange":
                    resourceColor = R.color.DeepOrange500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Blue Green":
                    resourceColor = R.color.BlueGreen500;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                case "Black":
                    resourceColor = R.color.Black;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);
                    break;
                default:
                    resourceColor = R.color.colorGrey900;
                    Log.d(LOG_TAG, "--getColorId()-- " + nameOfTheColor);

                break;
            }
        return resourceColor;
    }
}

package com.example.xyzreader.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.example.xyzreader.remote.Config;

/**
 * Created by Raghvendra on 04-01-2017.
 */
public class ThreeTwoImageView extends ImageView {

    public ThreeTwoImageView (Context context) {
        super(context);
    }

    public ThreeTwoImageView (Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImageView (Context context, AttributeSet attrs,
                              int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int threeTowHeightSpec = 0;
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            int threeTwoHeight = MeasureSpec.getSize(widthSpec) * 2 / 3;
            threeTowHeightSpec =
                    MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);

        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            threeTowHeightSpec = MeasureSpec.makeMeasureSpec((MeasureSpec.getSize(widthSpec) * 1/3), MeasureSpec.EXACTLY);
        }
        super.onMeasure(widthSpec, threeTowHeightSpec);
    }
}

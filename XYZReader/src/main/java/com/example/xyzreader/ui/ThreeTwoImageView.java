package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

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
        int threeTwoHeight = MeasureSpec.getSize(widthSpec) * 2/3;
        int threeTowHeightSpec =
                MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, threeTowHeightSpec);
    }
}

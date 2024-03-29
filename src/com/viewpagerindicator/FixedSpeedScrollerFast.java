package com.viewpagerindicator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class FixedSpeedScrollerFast extends Scroller {
	 public int mDuration = 500;

	    public FixedSpeedScrollerFast(Context context) {
	        super(context);
	    }

	    public FixedSpeedScrollerFast(Context context, Interpolator interpolator) {
	        super(context, interpolator);
	    }

	    @SuppressLint("NewApi")
		public FixedSpeedScrollerFast(Context context, Interpolator interpolator, boolean flywheel) {
	        super(context, interpolator, flywheel);
	    }


	    @Override
	    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
	        // Ignore received duration, use fixed one instead
	        super.startScroll(startX, startY, dx, dy, mDuration);
	    }

	    @Override
	    public void startScroll(int startX, int startY, int dx, int dy) {
	        // Ignore received duration, use fixed one instead
	        super.startScroll(startX, startY, dx, dy, mDuration);
	    }
}

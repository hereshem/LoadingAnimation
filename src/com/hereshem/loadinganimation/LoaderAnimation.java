package com.hereshem.loadinganimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;


public class LoaderAnimation extends ImageView {

	    public LoaderAnimation(Context context, AttributeSet attrs, int defStyle) {
	        super(context, attrs, defStyle);
	        init();
	    }

	    public LoaderAnimation(Context context, AttributeSet attrs) {
	        super(context, attrs);
	        init();
	    }

	    public LoaderAnimation(Context context) {
	        super(context);
	        init();
	    }

	    private void init() {
	        setBackgroundResource(R.drawable.loading);
	        final AnimationDrawable frameAnimation = (AnimationDrawable) getBackground();
	        post(new Runnable(){
	            public void run(){
	                 frameAnimation.start();
	             }
	        });
	    }
	}

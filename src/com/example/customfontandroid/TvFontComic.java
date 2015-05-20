package com.example.customfontandroid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TvFontComic extends TextView {

	public TvFontComic(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		Typeface font = Typeface.createFromAsset(context.getAssets(), "ANUDI.ttf");
		this.setTypeface(font);
		this.setTextColor(Color.WHITE);
	}

	public TvFontComic(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		Typeface font = Typeface.createFromAsset(context.getAssets(), "ANUDI.ttf");
		this.setTypeface(font);
		this.setTextColor(Color.WHITE);
	}

	public TvFontComic(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		Typeface font = Typeface.createFromAsset(context.getAssets(), "ANUDI.ttf");
		this.setTypeface(font);
		this.setTextColor(Color.WHITE);
	}
	
	
}
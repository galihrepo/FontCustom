package com.example.customfontandroid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EtFontComic extends EditText {

	public EtFontComic(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setStyle(context);
	}

	public EtFontComic(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		setStyle(context);
	}

	public EtFontComic(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setStyle(context);
	}
	
	private void setStyle(Context context) {
		Typeface font = Typeface.createFromAsset(context.getAssets(), "ANUDI.ttf");
		this.setTypeface(font);
		this.setTextColor(Color.WHITE);
	}
	
}

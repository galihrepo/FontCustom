package com.example.customfontandroid;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class FontComic extends TextView {

	public FontComic(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		Typeface font = Typeface.createFromAsset(context.getAssets(), "ANUDI.ttf");
		this.setTypeface(font);
	}

}
package com.example.androidex;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewEx extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView tv = new TextView(this);
		tv.setText("git ±¦È÷Çß´Ù");
		setContentView(tv);
		
	}

}

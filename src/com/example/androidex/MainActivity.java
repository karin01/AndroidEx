package com.example.androidex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
     
    
    public void mOnClick(View v) {
    	Intent intent;
    	switch (v.getId()) {
		case R.id.menubtn01:
			intent = new Intent(this, ViewEx.class);
			startActivity(intent);
			break;
    	}
		
    	
    }
}

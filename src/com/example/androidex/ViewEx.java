package com.example.androidex;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ViewEx extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.visivleex);
		
	}
		
		public void mOnClick(View v){
			switch (v.getId()) {
			case R.id.firstBtn:
				v.setVisibility(View.INVISIBLE);
				break;
			case R.id.secondtBtn:
				v.setVisibility(View.GONE);
				break;
			case R.id.thirdBtn:
				Button fstBtn = (Button) findViewById(R.id.firstBtn);
				Button secBtn = (Button) findViewById(R.id.secondtBtn);
				
				if (fstBtn.getVisibility() == View.INVISIBLE){
					fstBtn.setVisibility(View.VISIBLE);
				}
				if (secBtn.getVisibility() == View.GONE){
					secBtn.setVisibility(View.VISIBLE);
				}
				
				/*String str = "���� ��ư : " + v.getId() + "�� : "+v.getWidth() + "���� : " + v.getHeight() + "��ġ(x, y) : (" + v.getLeft() + "," +v.getTop() + ")" ;
				Toast.makeText(this, str, Toast.LENGTH_LONG).show();*/
			
		}
		
	}

}

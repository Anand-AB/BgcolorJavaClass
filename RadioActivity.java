package com.anand.bgcolor;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends ActionBarActivity    {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiobtn);
		
		
		RadioGroup rad=(RadioGroup) findViewById(R.id.radioGroup1);
		rad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch(checkedId){

				case R.id.radio0:
					Toast.makeText(getApplicationContext(),"0",Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio1:
					Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio2:
					Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio3:
					Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio4:
					Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();
					break;
				case R.id.radio5:
					Toast.makeText(getApplicationContext(),"5",Toast.LENGTH_SHORT).show();
					break;    
				}
			}
		});
	}

}

package com.anand.bgcolor;



import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnItemSelectedListener  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner spin=(Spinner) findViewById(R.id.spinner1 );
		spin.setOnItemSelectedListener(this);

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		View v=findViewById(R.id.mycolorchangingrelativelayout);
		Toast.makeText(getApplicationContext(), "Selected Item : "+position,Toast.LENGTH_LONG ).show();
		switch(position)
		{
		case 0:
			Toast.makeText(getApplicationContext(), "White",Toast.LENGTH_LONG ).show();
			v.setBackgroundColor(Color.WHITE);

			break;
		case 1:
			Toast.makeText(getApplicationContext(), "Black",Toast.LENGTH_LONG ).show();
			v.setBackgroundColor(Color.BLACK);
			break;
		case 2:	Toast.makeText(getApplicationContext(),"Orange",Toast.LENGTH_LONG ).show();
		v.setBackgroundColor(Color.rgb(255, 165, 0));
		break;
		case 3:
			v.setBackgroundColor(Color.RED);
			Toast.makeText(getApplicationContext(), "Red",Toast.LENGTH_LONG ).show();
			break;
		case 4:
			v.setBackgroundColor(Color.GREEN);
			Toast.makeText(getApplicationContext(), "Green",Toast.LENGTH_LONG ).show();
			break;
		case 5:
			v.setBackgroundColor(Color.YELLOW);
			Toast.makeText(getApplicationContext(), "Yellow",Toast.LENGTH_LONG ).show();
			break;
		default:
			v.setBackgroundColor(Color.GRAY);
			Toast.makeText(getApplicationContext(), "Please select a color.",Toast.LENGTH_LONG ).show();
			break;
		}

	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
	}

	public void radio(View v1)
	{
		startActivity(new Intent(this, RadioActivity.class));
	}
}

package com.octops.timetravelfree;

import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	public boolean Mode = true;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final CustomDigitalClock dc = (CustomDigitalClock) findViewById(R.id.fragment_clock_digital);
		dc.setText(dc.getText().toString());
		final TextView tv=(TextView) findViewById(R.id.textView1);


		dc.setClickable(true);
		dc.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v)
				{
					// TODO Auto-generated method stub
					if(Mode)
						tv.setText(dc.getText().toString());
					tv.setTextColor(Color.GREEN);
				}
			});
			
		final Button btnFreeze = (Button)findViewById(R.id.activitymainButton1);
		btnFreeze.setClickable(true);
		btnFreeze.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v)
				{
					Mode = false;
					dc.setTextColor(Color.RED);
					tv.setTextColor(Color.BLUE);
					dc.mTickerStopped = true;
				}
				
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
}

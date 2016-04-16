package com.example.paper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Marks extends Activity implements OnClickListener{
	
	TextView yourmarks,marksgot,yourturn;
	RatingBar rating;
	Button rate;
	//Page1 page1 =new Page1();
	int value4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.marks);
		
		value4 = getIntent().getIntExtra("value3", 0);
		yourmarks = (TextView)findViewById(R.id.tvyourmarks);
		marksgot = (TextView)findViewById(R.id.tvmarksgot);
		marksgot.setText(String.valueOf(value4));

		
		yourturn = (TextView)findViewById(R.id.tvyourturn);
		rating = (RatingBar)findViewById(R.id.rbrating);
		rate = (Button)findViewById(R.id.brate);
		
		rate.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		
		float rated = rating.getRating();
		if(rated >= 2.5 && rated !=5.0){
			
			Toast.makeText(this, "Thank u very much !!! :-) ", Toast.LENGTH_LONG).show();
	     }
		if(rated<2.5 && rated>=0)
			Toast.makeText(this, "Thank u :-(", Toast.LENGTH_LONG).show();
		if(rated ==5.0){
			Toast.makeText(this, "THANK U, THANK U VERY MUCH..." +
					"myself KHAGENDRA NATH MAHATO (EE-1st year)!!! :D ", Toast.LENGTH_LONG).show();	
			}
		
	
	}
	

}

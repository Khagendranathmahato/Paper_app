package com.example.paper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Page3 extends Activity implements OnClickListener{
	
	TextView question3;
	CheckBox option1,option2,option3,option4;
	Button next3;
	//Page1 page1 = new Page1();
	int value2;
	int point =0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page3);
		
		value2 = getIntent().getIntExtra("value1", 0);
		
		question3 = (TextView) findViewById(R.id.tvquestion3);
		option1 = (CheckBox) findViewById(R.id.cboption1);
		option2 = (CheckBox) findViewById(R.id.cboption2);
		option3 = (CheckBox) findViewById(R.id.cboption3);
		option4 = (CheckBox) findViewById(R.id.cboption4);
		next3 = (Button) findViewById(R.id.bnext3);
		
		next3.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		
		Class link = null;
		try {
			 link = Class.forName("com.example.paper.Page4");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(v.getId()==R.id.bnext3){
		
			if((option1.isChecked()==true) && (option3.isChecked()==false) && (option2.isChecked()==false) && (option4.isChecked()==true)){
				
				//page1.marks = page1.marks +1;
				value2 = value2 +1;
				point =1;
				}
			
		    Intent i = new Intent(this,link );
		    i.putExtra("value2", value2);
		    startActivity(i);
			
			
		    Toast.makeText(this, String.valueOf(point), Toast.LENGTH_LONG).show();
			
		}
		
		
	}
	
	
	

}

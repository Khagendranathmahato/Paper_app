package com.example.paper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends Activity implements  OnClickListener {
	
	RadioGroup radiogroup;
	RadioButton radiobutton;
	TextView question2;
	Button next;
	int value1;
	int point=0;
	//Page1 page1 = new Page1();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page2);
		
		 value1 = getIntent().getIntExtra("marks", 0);
		
		radiogroup = (RadioGroup) findViewById(R.id.radioGroup1);
		radiobutton = (RadioButton) findViewById(R.id.rboption1);
		question2 = (TextView) findViewById(R.id.textView1);
		next = (Button) findViewById(R.id.bnext1);
		
		radiobutton.setOnClickListener(this);
		next.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		
		Class link=null;
		try {
			 link = Class.forName("com.example.paper.Page3");
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		int selectedId = radiogroup.getCheckedRadioButtonId();
		
		if(v.getId()==R.id.bnext1){

		
		if(selectedId==R.id.rboption3){
			
			value1 = value1 +1;
			//Page1.marks = Page1.marks+1;
			//Toast.makeText(this, "design another page", Toast.LENGTH_LONG).show();
			point = 1;
		}
		
			Intent i =new Intent(this, link);
			i.putExtra("value1", value1);
			startActivity(i);
			
			Toast.makeText(this, String.valueOf(point), Toast.LENGTH_LONG).show();
		}
	}
	

}

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

public class Page1 extends Activity implements OnClickListener{
	
	RadioGroup radiogroup;
	RadioButton radiobutton;
	TextView question;
	Button next;
	int marks=0;
	
	//Page1 pageone = new Page1();
	//Page2 pagetwo = new Page2();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		
		 radiogroup = (RadioGroup)findViewById(R.id.radioGroup1);
		 radiobutton = (RadioButton) findViewById(R.id.rboption1);
			question = (TextView) findViewById(R.id.textView1);
			next = (Button) findViewById(R.id.bnext1);
		
		//radiogroup.setOnClickListener(this);
		next.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) {
		
		Class pagetwo=null;
		try {
			pagetwo = Class.forName("com.example.paper.Page2");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
        
		
		
		 int selectedId = radiogroup.getCheckedRadioButtonId();
			
		 if(v.getId()==R.id.bnext1)
			{
		
	    if(selectedId ==R.id.rboption1)
		{
			
			marks=marks+1;
		}
		
		
			Intent i = new Intent(this,pagetwo);
			i.putExtra("marks", marks);
			startActivity(i);
			
			Toast.makeText(this, String.valueOf(marks), Toast.LENGTH_LONG).show();
		}
		
		
	}
	

}

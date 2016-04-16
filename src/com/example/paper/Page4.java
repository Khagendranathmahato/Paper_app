package com.example.paper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Page4 extends Activity implements OnClickListener{
	
	TextView instruction,question4;
	EditText answer4;
	Button next4;
	String answer = "false";
	//Page1 page1 = new Page1();
	int value3;
	int point =0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page4);
		
		value3 = getIntent().getIntExtra("value2", 0);
		
		instruction = (TextView) findViewById(R.id.tvinstruction);
		question4 = (TextView) findViewById(R.id.tvquestion4);
		answer4 = (EditText) findViewById(R.id.etanswer);
		next4 = (Button) findViewById(R.id.bnext4);
		
		next4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Class link = null;
		try {
			 link = Class.forName("com.example.paper.Marks");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(v.getId()==R.id.bnext4){
			
			String string = answer4.getText().toString();
			if(string.equals(answer)){
				//page1.marks = page1.marks +1;
				value3 = value3+1;
				point = 1;
			}
			
			Intent i = new Intent(this, link);
			i.putExtra("value3", value3);
			startActivity(i);
			
			Toast.makeText(this, "Adolf Hitler was born in Austria", Toast.LENGTH_LONG).show();
		}
		
	}
	

}

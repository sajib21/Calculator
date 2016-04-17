package com.sajibxample.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText num1, num2;
	TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		num1 = (EditText) findViewById(R.id.num1);
		num2 = (EditText) findViewById(R.id.num2);
		result = (TextView) findViewById(R.id.result);
		

	}

	public void add(View v) {
		String s1 = num1.getText().toString();
		String s2 = num2.getText().toString();

		if (!s1.equals("") && !s2.equals("")) {

			double op1 = Double.parseDouble(s1);
			double op2 = Double.parseDouble(s2);
			double res = op1 + op2;

			result.setText("Result is: " + res);

			Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_SHORT).show();

		} 
		
		else Toast.makeText(getApplicationContext(), "Please enter value(s) first!!", Toast.LENGTH_SHORT).show();
		
	}

	public void sub(View v) {

		String s1 = num1.getText().toString();
		String s2 = num2.getText().toString();
		
		if (!s1.equals("") && !s2.equals("")) {
		
			double op1 = Double.parseDouble(s1);
			double op2 = Double.parseDouble(s2);
			double res = op1 - op2;

			result.setText("Result is: " + res);

			Toast.makeText(getApplicationContext(), "Subtract", Toast.LENGTH_SHORT).show();
		}
		
		else Toast.makeText(getApplicationContext(), "Please enter value(s) first!!", Toast.LENGTH_SHORT).show();

	}

	public void mul(View v) {

		String s1 = num1.getText().toString();
		String s2 = num2.getText().toString();
		
		if (!s1.equals("") && !s2.equals("")) {
		
			double op1 = Double.parseDouble(s1);
			double op2 = Double.parseDouble(s2);
			double res = op1 * op2;

			result.setText("Result is: " + res);

			Toast.makeText(getApplicationContext(), "Multiply", Toast.LENGTH_SHORT).show();
		}
		
		else Toast.makeText(getApplicationContext(), "Please enter value(s) first!!", Toast.LENGTH_SHORT).show();
	}

	public void div(View v) {

		String s1 = num1.getText().toString();
		String s2 = num2.getText().toString();
		
		if (!s1.equals("") && !s2.equals("")) {
		
			double op1 = Double.parseDouble(s1);
			double op2 = Double.parseDouble(s2);
			

			if (op2 == 0)
				result.setText("Cannot divide by zero!!");
			else {
				double res = op1 / op2;
				result.setText("Result is: " + res);
			}

			Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_SHORT).show();
		}
		
		else Toast.makeText(getApplicationContext(), "Please enter value(s) first!!", Toast.LENGTH_SHORT).show();
		
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }
	//
	// @Override
	// public boolean onOptionsItemSelected(MenuItem item) {
	// // Handle action bar item clicks here. The action bar will
	// // automatically handle clicks on the Home/Up button, so long
	// // as you specify a parent activity in AndroidManifest.xml.
	// int id = item.getItemId();
	// if (id == R.id.action_settings) {
	// return true;
	// }
	// return super.onOptionsItemSelected(item);
	// }
}

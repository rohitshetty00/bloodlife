package com.example.bloodlife;

import com.example.bloodlife.R.id;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
public class GiveBlood extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    Button next;
    EditText country,state,city,hosp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_give_blood);
		// Show the Up button in the action bar.
		setupActionBar();
		Context context = getApplicationContext();
   	    CharSequence test ="Fill in the details";
   	    Toast toast = Toast.makeText(context, test, Toast.LENGTH_LONG);
   	 
   	    toast.show();
   	    
		final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.planets_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
		
		
		
		next=(Button) findViewById(R.id.button3);
		country=(EditText)findViewById(R.id.editText2);
		state=(EditText)findViewById(R.id.editText4);
		city=(EditText)findViewById(R.id.editText5);
		hosp=(EditText)findViewById(R.id.editText6);
	    next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	/*Add all the intent  code here so you can g further*/
            	Context context = getApplicationContext();
            	final String Text = spinner.getSelectedItem().toString();
           	    String test1 = country.getText().toString();
           	    String test2 = state.getText().toString();
           	    String test3 = city.getText().toString();
           	    String test4 = hosp.getText().toString();
           	    /*test.concat((String) test2);
           	 test.concat((String) test3);
           	test.concat((String) test4);*/
           	String test ="Blood Group:"+Text+"\nCountry:"+test1+"\n"+"State:"+test2+"\n"+"City/Town:"+test3+"\n"+"Hosptial:"+test4;
        	 
     	    Intent intent = new Intent(context,Next.class);
     	   String message = test;
     	  intent.putExtra(EXTRA_MESSAGE, message);
     	  
     	  
     	    startActivity(intent);
                
            }
        });
		
		
		

	}

	private Spinner findViewById(Class<id> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.give_blood, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}

package com.example.bloodlife;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class Next extends Activity {
	 EditText cont,msg;
	 public final static String EXTRA_MESSAGEr = "com.example.myfirstapp.MESSAGE";
	 Button next;
	//public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);
		// Show the Up button in the action bar.
		setupActionBar();
		
		final Intent intent = getIntent();
		String message = intent.getStringExtra(GiveBlood.EXTRA_MESSAGE);
		cont=(EditText)findViewById(R.id.editText1);
		msg=(EditText)findViewById(R.id.editText2);
		next=next=(Button) findViewById(R.id.button1);
		next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	/*Add all the intent  code here so you can g further*/
            	Context context = getApplicationContext();
            	
            	String message = intent.getStringExtra(GiveBlood.EXTRA_MESSAGE);
           	    String test5 = cont.getText().toString();
           	    String test6 = msg.getText().toString();
           	 CharSequence test =test5+"\n"+test6;
           	message="Blood needed urgently\n"+message+"\nContact:"+test5+"\ndetails:"+test6;
           	Intent intent = new Intent(context,Finale.class);
      	    
      	    intent.putExtra(EXTRA_MESSAGEr, message);
      	  
      	  
      	    startActivity(intent);
           	    /*test.concat((String) test2);
           	 test.concat((String) test3);
           	test.concat((String) test4);*/
           	
        	 
     	                   
            }
        });
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
		getMenuInflater().inflate(R.menu.next, menu);
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

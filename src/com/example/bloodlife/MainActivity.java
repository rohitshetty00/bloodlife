package com.example.bloodlife;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	Button getBlood,endForm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getBlood=(Button) findViewById(R.id.button1);
		getBlood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	/*Add all the intent  code here so you can g further*/
            	Context context = getApplicationContext();
            	 
            	    Intent intent = new Intent(context,GiveBlood.class);
            	    startActivity(intent);
                
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

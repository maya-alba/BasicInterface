package com.example.sendsms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HiActivity extends Activity{
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hi_layout);
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
	
	public void goToSendSMS(View v){
	    	Intent intent = new Intent(this, SendSMSActivity.class);
	    	startActivity(intent);
	 }

	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			finish();		
		}
		return super.onOptionsItemSelected(item);
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

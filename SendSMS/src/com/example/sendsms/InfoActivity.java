package com.example.sendsms;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class InfoActivity extends Activity{
	
	Spinner spinner;
	String[] opciones = {" ","Happy", "Angry", "Sad", "Tired", "Hungry"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);
        
        getActionBar().setDisplayHomeAsUpEnabled(true);

		spinner = (Spinner)findViewById(R.id.spinner1);
		ArrayAdapter<String> adaptadorSpinner = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,opciones);
		spinner.setAdapter(adaptadorSpinner);

		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
				switch (i) {
				case 1:
					Toast.makeText(getApplicationContext(), "I'm feeling "+opciones[i], Toast.LENGTH_LONG).show();				
					break;
				case 2:
					Toast.makeText(getApplicationContext(), "I'm feeling "+opciones[i], Toast.LENGTH_LONG).show();
					break;
				case 3:
					Toast.makeText(getApplicationContext(), "I'm feeling "+opciones[i], Toast.LENGTH_LONG).show();
					break;
				case 4:
					Toast.makeText(getApplicationContext(), "I'm feeling "+opciones[i], Toast.LENGTH_LONG).show();
					break;
				case 5:
					Toast.makeText(getApplicationContext(), "I'm feeling "+opciones[i], Toast.LENGTH_LONG).show();
					break;
				}		
			}
			@Override
			public void onNothingSelected(AdapterView<?> adapterView) {	
			}			
		});
    }
	
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			finish();		
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void goToHi(View v){
    	Intent intent = new Intent(this, HiActivity.class);
    	startActivity(intent);
    	finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

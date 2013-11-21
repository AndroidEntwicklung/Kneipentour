package com.example.kneipentour;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class DetailListe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail_liste);
		
		TextView textview = (TextView) findViewById(R.id.textview4);
		
        String search_type;
        String search_city;
        
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            
            if (extras == null) {
            	search_type = "";
            	search_city = "";
            } else {
            	search_type= extras.getString("search_type");
            	search_city = extras.getString("search_city");
            }
        } else {
        	search_type = (String) savedInstanceState.getSerializable("search_type");
        	search_city = (String) savedInstanceState.getSerializable("search_city");
        }
        
        textview.setText(search_city);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail_liste, menu);
		return true;
	}

}

package com.example.kneipentour;

import android.os.Bundle;
import android.os.Trace;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button1);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        final EditText edittext = (EditText) findViewById(R.id.edittext1);
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        spinner.setAdapter(adapter);
                
        button.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), DetailListe.class);
                myIntent.putExtra("search_type", spinner.getSelectedItem().toString());
                myIntent.putExtra("search_city", edittext.getText().toString());
                startActivity(myIntent);
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

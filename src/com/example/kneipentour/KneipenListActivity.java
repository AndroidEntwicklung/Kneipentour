package com.example.kneipentour;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class KneipenListActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_kneipen);

        String search_type;
        String search_city;

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();

            if (extras == null) {
                search_type = "";
                search_city = "";
            } else {
                search_type = extras.getString("search_type");
                search_city = extras.getString("search_city");
            }
        } else {
            search_type = (String) savedInstanceState.getSerializable("search_type");
            search_city = (String) savedInstanceState.getSerializable("search_city");
        }
        
        // text
        TextView tview = (TextView) findViewById(R.id.sr_tv);
        
        String filterType = (search_type.isEmpty()) ? "alle" : search_type;
        
        if (search_city.isEmpty())
        	tview.setText("Suchergebnisse (" + filterType + "):");
        else
        	tview.setText(filterType + " in " + search_city + ":");
        
        // list
        Datenbank localDB = new Datenbank();
		ArrayList<KneipenListItem> image_details = localDB.getListData("",search_type,search_city);
		
		final ListView lv1 = (ListView) findViewById(R.id.kneipen_list);
		lv1.setAdapter(new KneipenListAdapter(this, image_details));
            lv1.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> a, View v, int position, long id)
                {
                Object o = lv1.getItemAtPosition(position);
                KneipenListItem kneipenData = (KneipenListItem) o;

                Intent myIntent = new Intent(v.getContext(), DetailActivity.class);
                myIntent.putExtra("selected_name", kneipenData.getName());
                startActivity(myIntent);
                }
            }
        );
	}
}

package com.example.kneipentour;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
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

		ArrayList<KneipenListItem> image_details = getListData();
		
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

	private ArrayList<KneipenListItem> getListData() {
		ArrayList<KneipenListItem> results = new ArrayList<KneipenListItem>();
		KneipenListItem kneipenData = new KneipenListItem();
		kneipenData.setName("Faerbe");
		kneipenData.setStreet("Irgendwo 15");
		kneipenData.setDistance("netSoWeit");
		kneipenData.setIconpath("bla");
		results.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Speicher");
		kneipenData.setStreet("GHB halt");
		kneipenData.setDistance("dBuckelNuff");
		kneipenData.setIconpath("blab");
		results.add(kneipenData);
		
		return results;
	}
}

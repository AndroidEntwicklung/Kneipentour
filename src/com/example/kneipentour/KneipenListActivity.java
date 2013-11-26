package com.example.kneipentour;

import java.util.ArrayList;

import android.app.Activity;
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
		
		ArrayList<KneipenListItem> image_details = getListData();
		
		final ListView lv1 = (ListView) findViewById(R.id.kneipen_list);
		lv1.setAdapter(new KneipenListAdapter(this, image_details));
		lv1.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> a, View v, int position, long id)
			{
				Object o = lv1.getItemAtPosition(position);
				KneipenListItem kneipenData = (KneipenListItem) o;
				Toast.makeText(KneipenListActivity.this, "Selected: " + kneipenData, Toast.LENGTH_LONG).show();
			}
		});
	}

	private ArrayList<KneipenListItem> getListData() {
		ArrayList<KneipenListItem> results = new ArrayList<KneipenListItem>();
		KneipenListItem kneipenData = new KneipenListItem();
		kneipenData.setName("Färbe");
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

package com.example.kneipentour;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String selected_name;

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();

            if (extras == null) {
                selected_name = "";
            } else {
                selected_name = extras.getString("selected_name");
            }
        } else {
            selected_name = (String) savedInstanceState.getSerializable("selected_name");
        }

        TextView tview = (TextView) findViewById(R.id.textView);
        tview.setText(selected_name);
    }
}
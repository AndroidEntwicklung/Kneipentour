package com.example.kneipentour;

import java.util.ArrayList;

import org.json.JSONObject;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
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
        
        
        // get data       
        Datenbank localDB = new Datenbank();
		ArrayList<KneipenListItem> kneipe_details = localDB.getListData(selected_name, "", "");
		KneipenListItem found_kneipe = kneipe_details.get(0);

		// find views
        TextView name_tv = (TextView) findViewById(R.id.name_tv);
        TextView address_tv = (TextView) findViewById(R.id.address_tv);
        TextView rating_tv = (TextView) findViewById(R.id.rating_tv);
        TextView review_tv = (TextView) findViewById(R.id.review_tv);
        
        NetworkImageView image_view = (NetworkImageView) findViewById(R.id.image_view);

		// write content
		name_tv.setText(selected_name);
		address_tv.setText(found_kneipe.getStreet() + ", " + found_kneipe.getCity());
		rating_tv.setText("Rating: " + found_kneipe.getRating());
		review_tv.setText("Review: " + found_kneipe.getReview());
		
		// load image
		RequestQueue mRequestQueue = Volley.newRequestQueue(getBaseContext());
		ImageLoader mImageLoader = new ImageLoader(mRequestQueue, new ImageLoader.ImageCache() {
		    private final LruCache<String, Bitmap> mCache = new LruCache<String, Bitmap>(10);
			@Override
		    public void putBitmap(String url, Bitmap bitmap) {
		        mCache.put(url, bitmap);
		    }
		    public Bitmap getBitmap(String url) {
		        return mCache.get(url);
		    }
		});

		image_view.setImageUrl("http://rootwiki.net/wp-content/uploads/2013/10/Android-Happy2-e1357315066858.jpg", mImageLoader);
    }
}
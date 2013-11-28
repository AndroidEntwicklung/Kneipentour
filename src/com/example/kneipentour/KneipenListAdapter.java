package com.example.kneipentour;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class KneipenListAdapter extends BaseAdapter {

	private ArrayList<KneipenListItem> listData;
	private LayoutInflater layoutInflater;
	
	public KneipenListAdapter(Context context, ArrayList<KneipenListItem> listData)
	{
		this.listData = listData;
		layoutInflater = LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null)
		{
			convertView = layoutInflater.inflate(R.layout.list_kneipen_row_layout, null);
			holder = new ViewHolder();
			holder.titleView = (TextView) convertView.findViewById(R.id.title);
			holder.streetView = (TextView) convertView.findViewById(R.id.street);
			holder.distanceView = (TextView) convertView.findViewById(R.id.distance);
			holder.iconView = (ImageView) convertView.findViewById(R.id.icon);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.titleView.setText(listData.get(position).getName());
		holder.streetView.setText(listData.get(position).getStreet() + ", " + listData.get(position).getCity());
		holder.distanceView.setText(listData.get(position).getDistance());
		holder.iconView.setImageResource(listData.get(position).getIconpath());
		
		return convertView;
	}
	
	static class ViewHolder {
		TextView titleView;
		TextView streetView;
		TextView distanceView;
		ImageView iconView;
		
	}

}

package com.example.kneipentour;

import java.util.ArrayList;

public class Datenbank {
	public ArrayList<KneipenListItem> getListData(String name, String type, String city) {
		ArrayList<KneipenListItem> zwresults = new ArrayList<KneipenListItem>();
		ArrayList<KneipenListItem> results = new ArrayList<KneipenListItem>();
		KneipenListItem kneipenData = new KneipenListItem();
		kneipenData.setName("Faerbe");
		kneipenData.setStreet("Irgendwo 15");
		kneipenData.setCity("Furtwangen");
		kneipenData.setType("Kneipe");
		kneipenData.setDistance("10km");
		kneipenData.setRating(3);
		kneipenData.setReview("Jo passt scho");
		kneipenData.setIconpath("bla");
		zwresults.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Speicher");
		kneipenData.setStreet("GHB halt");
		kneipenData.setCity("Furtwangen");
		kneipenData.setType("Kneipe");
		kneipenData.setDistance("20km");
		kneipenData.setRating(2);
		kneipenData.setReview("Naja scho net schlecht");
		kneipenData.setIconpath("blab");
		zwresults.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Waldrast");
		kneipenData.setStreet("Ausserhalb");
		kneipenData.setCity("Vöhrenbach");
		kneipenData.setType("Restaurant");
		kneipenData.setDistance("30km");
		kneipenData.setRating(2);
		kneipenData.setReview("Omnomnom");
		kneipenData.setIconpath("blab");
		zwresults.add(kneipenData);
		
		for (KneipenListItem data: zwresults)
		{
			if (data.getCity().equalsIgnoreCase(city) && data.getType().equalsIgnoreCase(type))
			{
				results.add(data);
			}
			else if (city.isEmpty() && data.getType().equalsIgnoreCase(type))
			{
				results.add(data);
			}
		}
		kneipenData = new KneipenListItem();
		kneipenData.setName(city);
		kneipenData.setStreet(type);
		kneipenData.setCity("");
		kneipenData.setType("");
		kneipenData.setDistance("");
		kneipenData.setRating(0);
		kneipenData.setReview("");
		kneipenData.setIconpath("");
		results.add(kneipenData);
		
		return results;
	}
}

package com.example.kneipentour;

import java.util.ArrayList;

public class Datenbank {
	public ArrayList<KneipenListItem> getListData(String name, String type, String city) {
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
		results.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Speicher");
		kneipenData.setStreet("GHB halt");
		kneipenData.setCity("Furtwangen");
		kneipenData.setType("Kneipe");
		kneipenData.setDistance("20km");
		kneipenData.setRating(2);
		kneipenData.setReview("Naja scho net schlecht");
		kneipenData.setIconpath("blab");
		results.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Waldrast");
		kneipenData.setStreet("Ausserhalb");
		kneipenData.setCity("Vöhrenbach");
		kneipenData.setType("Restaurant");
		kneipenData.setDistance("30km");
		kneipenData.setRating(2);
		kneipenData.setReview("Omnomnom");
		kneipenData.setIconpath("blab");
		results.add(kneipenData);
		
		return results;
	}
}

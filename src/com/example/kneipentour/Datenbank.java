package com.example.kneipentour;

import java.util.ArrayList;

public class Datenbank {
	public ArrayList<KneipenListItem> getListData(String name, String type, String city) {
		ArrayList<KneipenListItem> zwresults = new ArrayList<KneipenListItem>();
		ArrayList<KneipenListItem> results = new ArrayList<KneipenListItem>();
		KneipenListItem kneipenData = new KneipenListItem();
		kneipenData.setName("Faerbe");
		kneipenData.setStreet("Allmendstraﬂe 15");
		kneipenData.setCity("Furtwangen");
		kneipenData.setType("Kneipe");
		kneipenData.setDistance("10km");
		kneipenData.setRating(3);
		kneipenData.setReview("Jo, passt scho. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. ");
		kneipenData.setIconpath(R.drawable.p_restaurant);
		kneipenData.setImagepath("http://webuser.hs-furtwangen.de/~gaertner/android/faerbe.jpg");
		zwresults.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Speicher");
		kneipenData.setStreet("Groﬂhausberg 9");
		kneipenData.setCity("Furtwangen");
		kneipenData.setType("Kneipe");
		kneipenData.setDistance("20km");
		kneipenData.setRating(2);
		kneipenData.setReview("Naja, scho net schlecht. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. ");
		kneipenData.setIconpath(R.drawable.p_restaurant);
		kneipenData.setImagepath("http://webuser.hs-furtwangen.de/~gaertner/android/waldrast.jpg");
		zwresults.add(kneipenData);
		
		kneipenData = new KneipenListItem();
		kneipenData.setName("Waldrast");
		kneipenData.setStreet("Donaueschinger Straﬂe 15");
		kneipenData.setCity("Vˆhrenbach");
		kneipenData.setType("Restaurant");
		kneipenData.setDistance("30km");
		kneipenData.setRating(2);
		kneipenData.setReview("Omnomnom. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. ");
		kneipenData.setIconpath(R.drawable.p_restaurant);
		kneipenData.setImagepath("http://webuser.hs-furtwangen.de/~gaertner/android/ghb.jpg");
		zwresults.add(kneipenData);

		// filter!
		for (KneipenListItem data: zwresults)
		{
			if (data.getName().equalsIgnoreCase(name) && !name.isEmpty())
			{
				results.add(data);
				break;
			}
			if (name.isEmpty())
			{
				// city + type (+ nasty substring hack)
				if (!type.isEmpty() && data.getCity().equalsIgnoreCase(city) && data.getType().equalsIgnoreCase(type.substring(0, type.length()-1)))
				{
					results.add(data);
				}
				// only type
				else if (!type.isEmpty() && city.isEmpty() && data.getType().equalsIgnoreCase(type.substring(0, type.length()-1)))
				{
					results.add(data);
				}
				// only city
				else if (type.isEmpty() && data.getType().equalsIgnoreCase(city))
				{
					results.add(data);
				}				
				// no filter
				else if (city.isEmpty() && type.isEmpty())
				{
					results.add(data);
				}
			}
		}
		
		/*
			kneipenData = new KneipenListItem();
			 
			kneipenData.setName(city);
			kneipenData.setStreet(type);
			kneipenData.setCity("");
			kneipenData.setType("");
			kneipenData.setDistance("");
			kneipenData.setRating(0);
			kneipenData.setReview("");
			kneipenData.setIconpath(R.drawable.p_restaurant);
			results.add(kneipenData);
		*/
		
		return results;
	}
}

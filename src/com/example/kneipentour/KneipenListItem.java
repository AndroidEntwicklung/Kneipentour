package com.example.kneipentour;

public class KneipenListItem {
private String name;
private String street;
private String city;
private String type;
private int rating;
private String review;
private int distance;
private String iconpath;

public String getName()
{
	return name;
}
public void setName(String _name)
{
	this.name = _name;
}

public String getStreet()
{
	return street;
}
public void setStreet(String _street)
{
	this.street = _street;
}

public String getCity()
{
	return city;
}
public void setCity(String _city)
{
	this.city = _city;
}

public String getType()
{
	return type;
}
public void setType(String _type)
{
	this.type = _type;
}

public int getRating()
{
	return rating;
}
public void setRating(int _rating)
{
	this.rating = _rating;
}

public String getReview()
{
	return review;
}
public void setReview(String _review)
{
	this.review = _review;
}

public int getDistance()
{
	return distance;
}
public void setDistance(int _distance)
{
	this.distance = _distance;
}

public String getIconpath()
{
	return iconpath;
}
public void setIconpath(String _iconpath)
{
	this.iconpath = _iconpath;
}

@Override
public String toString()
{
	return "[ name=" + name + ", street=" + street + ", distance=" + distance + ", iconpath=" + iconpath + "]";
} 
}

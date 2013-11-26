package com.example.kneipentour;

public class KneipenListItem {
private String name;
private String street;
private String distance;
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
public String getDistance()
{
	return distance;
}
public void setDistance(String _distance)
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

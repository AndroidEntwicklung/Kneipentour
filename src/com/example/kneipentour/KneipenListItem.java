package com.example.kneipentour;

public class KneipenListItem {
	private String name;
	private String street;
	private String city;
	private String type;
	private int rating;
	private String review;
	private String distance;
	private int iconpath;
	private String imagepath;

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String _street) {
		this.street = _street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String _city) {
		this.city = _city;
	}

	public String getType() {
		return type;
	}

	public void setType(String _type) {
		this.type = _type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int _rating) {
		this.rating = _rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String _review) {
		this.review = _review;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String _distance) {
		this.distance = _distance;
	}

	public int getIconpath() {
		return iconpath;
	}

	public void setIconpath(int _iconpath) {
		this.iconpath = _iconpath;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String _imagepath) {
		this.imagepath = _imagepath;
	}

	@Override
	public String toString() {
		return "[ name=" + name + ", street=" + street + ", distance="
				+ distance + ", iconpath=" + iconpath + "]";
	}

}

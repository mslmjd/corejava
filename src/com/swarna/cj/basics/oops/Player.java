package com.swarna.cj.basics.oops;

public class Player {

	private String name;
	private String teamname;
	private String country;
	private String role;
	private double price;

	// Parameterized Constructor
	public Player(String name, String teamname, String country, String role, double price) {

		this.name = name;
		this.teamname = teamname;
		this.country = country;
		this.role = role;
		this.price = price;
	}

	public void showDetails() {
		System.out.println("\nName :" + name + "\nTeam Name :" + teamname + "\nCountry :" + country + "\nRole :" + role
				+ "\nPrice :" + price);

	}

	// getters() & Setters()

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

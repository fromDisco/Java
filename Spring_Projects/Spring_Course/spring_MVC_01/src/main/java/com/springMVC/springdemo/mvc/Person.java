package com.springMVC.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Person {
	private String firstName;
	@Size(min=1, message="required")
	private String lastName;
	private String planet;
	private LinkedHashMap<String, String> planets;
	private String language;
	private LinkedHashMap<String, String> languages;
	private String[] operatingSystems;
	private String[] operatingSystemsChoice;
	@Pattern(regexp="^[0-9]{1,5}", message="Number must be between 1 and 5 digits long.")
	@Size(min=1, message="required")
	private String postalCode;
	@NotNull(message="required")
	@Min(value=0, message="Value must be >= 0.")
	@Max(value=99999, message="Value must be <= 99999")
	private Integer luckyNumber;

	
	// Constructors
	public Person() {
		this.planets = new LinkedHashMap<>();
		planets.put("MN", "Moon");
		planets.put("MR", "Mars");
		planets.put("VN", "Venus");
		planets.put("SI", "Sirius");

		this.languages = new LinkedHashMap<>();
		languages.put("Java", "Java");
		languages.put("Python", "Python");
		languages.put("JavaScript", "JavaScript");
		
		operatingSystemsChoice = new String[4];
		operatingSystemsChoice[0] = "Pop!_OS";
		operatingSystemsChoice[1] = "EndevourOS";
		operatingSystemsChoice[2] = "Arco Linux";
		operatingSystemsChoice[3] = "Windows";
	}
	
	// Setters / Getters
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public String getPlanet() {
		return this.planet;
	}
	
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
	public LinkedHashMap<String, String> getPlanets() {
		return this.planets;
	}

	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public LinkedHashMap<String, String> getLanguages() {
		return this.languages;
	}
	
	public String[] getOperatingSystemsChoice() {
		return this.operatingSystemsChoice;
	}
	
	public String[] getOperatingSystems() {
		return this.operatingSystems;
	}
	
	public void setOperatingSystems(String[] oSs) {
		this.operatingSystems = oSs;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}
	
	public void setPostalCode(String code) {
		this.postalCode = code;
	}
	
	public Integer getLuckyNumber() {
		return this.luckyNumber;
	}
	
	public void setLuckyNumber(Integer number) {
		System.out.println("luckyNumber: " + number);
		this.luckyNumber = number;
	}
}


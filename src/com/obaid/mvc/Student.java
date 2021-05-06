package com.obaid.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	
	private String firstName;
	
	@NotNull(message = "is reuqired")
	@Size(min=1, message="is required")
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String operatingSystem;
	
	//private LinkedHashMap<String, String> countryOptions;
	
	
	
	public Student() {
		super();
		/*
		 * countryOptions= new LinkedHashMap<String, String>();
		 * 
		 * countryOptions.put("BR", "Brazil"); countryOptions.put("DE", "Germany");
		 * countryOptions.put("IN", "India"); countryOptions.put("BR", "BRazil");
		 */
		
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
		
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + "]";
	}
	/*
	 * public LinkedHashMap<String, String> getCountryOptions() { return
	 * countryOptions; }
	 */
	
	
	
	
	
	
	
}

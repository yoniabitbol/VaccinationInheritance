// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Civid Address Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Civic Address class is to determine all the attributes and methods used in order to build and manipulate a Civic Address object.

/**
 * Adir Ben-David 40190551 & Jonathan Abitbol 40190550
 * COMP 249
 * Assignment #2
 * 10/31/2021
 */

package Addresses;

/**
 * The Patient and Vaccine classes provide information about a patient, and his vaccination dates and locations and addresses pulled from the address classes.
 * @author Jonathan Abitbol & Adir Ben-David
 * @version 1.0
 * @since 2021-10-10
 */


/**
 * Civic address class contains all of the attributes and methods concerning the civic address of the clinics for the vaccination facilities.
 */
public class CivicAddress extends Address{

	/**
	 * String which holds the clinic name.
	 */
	private String clinicName;

	/**
	 * String which holds the city of the clinic
	 */
	private String city;

	/**
	 * String which holds the street address
	 */
	private String streetAddress;
	
	/**
	 * enum which holds the abbreviations of the provinces.
	 */
	public enum province {
		AB,BC, MB, NB, NL, NT, NS, NU, ON,
		PE, QC, SK, YT
	};
	
	/**
	 * Private attribute province of type province.
	 */
	private province province;
	
	/**
	 * Private String postal code.
	 */
	private String postalCode;
	
	
	//Contructors
	/**
	 * Default constructor.
	 */
	public CivicAddress() {
		
	}
	
	/**
	 * Copy Constructor
	 * @param c object of type Civic address, used as the copy object when a new civic address is created
	 */
	public CivicAddress(CivicAddress c) {
		this.clinicName = c.clinicName;
		this.streetAddress = c.streetAddress;
		this.city = c.city;
		this.province = c.province;
		this.postalCode = c.postalCode;
	}


	/**
	 * Parametrized Constructor
	 * @param clinicName String which holds the clinic's name.
	 * @param streetAdd String which holds the clinic's street address.
	 * @param city String which holds the city name.
	 * @param postalCode String which holds the postal code
	 * @param province enum which holds the province
	 */
	public CivicAddress(String clinicName,String streetAdd, String city, String postalCode, province province) {
		this.clinicName = clinicName.toUpperCase();
		this.city = city.toUpperCase();
		this.streetAddress = streetAdd.toUpperCase();
		this.province = province;
		this.postalCode = postalCode.toUpperCase();
		
	}

	/**
	 * Getter (Accessor) method used to get/access the province
	 * @return enum containing the abbreviation of the province
	 */
	public province getProvince() {
		return province;
	}

	/**
	 * Setter (Mutator) method used to set/mutate the province
	 * @param province enum containing the abbreviation for the province
	 */
	public void setProvince(province province) {
		this.province = province;
	}


	/**
	 * Getter (Accessor) method used to get/access the postal code
	 * @return String containing the postal code
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Setter (Mutator) method used to set/mutate the postal code
	 * @param postalCode String containig the postal code passed in the method
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * Getter (Accessor) method used to get/access the street address of the clinic
	 * @return String containing the street address of the clinic
	 */
	public String getstreetAdd() {
		return streetAddress;
	}

	/**
	 * Setter (Mutator) method used to set/mutate the street address for a given clinic
	 * @param streetAdd String containing the street address of the clinic
	 */
	public void setstreetAdd(String streetAdd) {
		this.streetAddress = streetAdd;
	}
	
	/**
	 * toString method will return information about the clinic in its entirety with all attributes in the class displayed.
	 */
	public String toString() {
		return "Clinic: " + clinicName + "\n" + streetAddress + "," + city + ", " + province + ", " + postalCode;
	}
	
	/**
	 * equals method will be used to compare two objects of the type civic address and see if they are identical by comparing the attributes, if they are the same the return will be true.
	 */
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}
		CivicAddress cA = (CivicAddress) o;
		return this.toString().equals(cA.toString()) ;
		
	}

	
	
	
    
}
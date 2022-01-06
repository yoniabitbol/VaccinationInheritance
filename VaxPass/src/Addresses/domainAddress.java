// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Domain Address Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Domain Address class is to determine all the attributes and methods used in order to build and manipulate a Domain Address object.

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
 *  This class is used to store and handle the attributes and methods concerning the domain address/website of the clinics.
 */
public class domainAddress extends Address {
	
	/**
	 * Private String containing the domain name of the website.
	 */
	private String domainName;

	/**
	 * private String containing the TLD of the website.
	 */
	private String TLD;
	
	
	

	/**
	 * Default constructor
	 */
	public domainAddress() {
		
	}

	/**
	 * Copy Constructor
	 * @param d object of type domain address used as the copy object when a new obj of type civic address is created
	 */
	public domainAddress(domainAddress d) {
		this.domainName = d.domainName;
		this.TLD = d.TLD;
	}

	/**
	 * Parametrized constructor
	 * @param domain String containing the domain of the website
	 * @param tld String containing the TLD of the website.
	 */
	public domainAddress(String domain,String tld) {
		this.domainName = domain.replaceAll(" ", "");
		this.TLD = tld;
		
	}
	
	/**
	 * Getter (Accessor) method used to get/access the domain name.
	 * @return String containing the domain name
	 */
	public String getDomain() {
		return domainName;
	}

	/**
	 * Setter (Mutator) method used to set/mutate a value for the domain
	 * @param domain String containing the domain of the website
	 */
	public void setDomain(String domain) {
		this.domainName = domain;
	}
	
	/**
	 * Getter (Accessor) method used to get/access the TLD of the website.
	 * @return String containing the TLD of the website
	 */
	public String getTld() {
		return TLD;
	}

	/**
	 * Setter (Mutator) method used to set/mutate the value of the TLD
	 * @param tld String containing the TLD of the website
	 */
	public void setTld(String tld) {
		this.TLD = tld;
	}
	
	/**
	 * toString method will return the website entirely, all attributes displayed to show final use of the class, shows the website URL
	 */
	public String toString() {
		return domainName + "." + TLD;
	}
	
	/**
	 * equals method will compare two objects of type domain address by comparing the attributes and if they are all identical the method will return a value of true.
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
		domainAddress dA = (domainAddress) o;
		return this.toString().equals(dA.toString()) ;
	}
	
	
	
	

}

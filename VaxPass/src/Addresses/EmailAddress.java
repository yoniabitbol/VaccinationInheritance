// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Email Address Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Email Address class is to determine all the attributes and methods used in order to build and manipulate a Email Address object.

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
 * This class handles the methods and attributes concerning the email address of the clinic and those of the patients getting vaccinated.
 */
public class EmailAddress extends domainAddress {
	
	/**
	 * Private string attribute containing the username
	 */
	private String userName;
	
	/**
	 * Default Constructor
	 */
	public EmailAddress() {
		super();
	}
	
	/**
	 * Copy Constructor
	 * @param e object of type email Address used as the copy object
	 */
	public EmailAddress(EmailAddress e) {
		super(e);
		this.userName = e.userName;
	}

	/**
	 * Paremetrized Constructor
	 * @param userName String containing the username 
	 * @param d object containing the domain address from the super class which contains the url and domain
	 */
	public EmailAddress(String userName,domainAddress d) {
		super(d);
		this.userName = userName;
	}
	
	/**
	 * Getter (Accessor) method used to get/access the username
	 * @return String containig the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Setter (Mutator) method which sets/mutates the value of the username when it is passed into this method
	 * @param userName String containing the username
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * toString method returns the email address using the inherited domain name and TLD. 
	 */
	public String toString() {
		return "Email:"+this.userName + "@" + super.toString();
	}

	/**
	 * equals method which compares two objects of this type by comparing the attributes. If they are all equals to each other of the other object, this method will return true.
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
		EmailAddress eA = (EmailAddress) o;
		return this.toString().equals(eA.toString()) ;
	}
    
}

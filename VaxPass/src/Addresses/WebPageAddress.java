// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my WebPage Address Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Web Page Address class is to determine all the attributes and methods used in order to build and manipulate a Web Page Address object.

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
 * This class stores and handles methods concerning the webpage addresses of the clinics.
 */


public class WebPageAddress extends domainAddress  {
	
	/**
	 * Private attribute string holding the resource
	 */
	private String resource;

	/**
	 * Default constructor
	 */
	public WebPageAddress() {
		super();
	}

	/**
	 * Copy constructor
	 * @param w - WebPageAddress object
	 */
	public WebPageAddress(WebPageAddress w) {
		super(w);
		this.resource = w.resource;
	}

	/**
	 * Parametrized constructor
	 * @param e object of domain address
	 * @param resource String holding the resource
	 */
	public WebPageAddress(domainAddress e,String resource) {
		super(e);
		this.resource = resource;
	}
	
	/**
	 * Getter (Accessor) method which will get/access the resource
	 * @return String holding the value of the resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * Setter (Mutator) method which will set/mutate the resource value
	 * @param resource String holding the value of resource
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}
	
	/**
	 * toString method will return the entirety of the webpage address in a string to display all of its attributes in order
	 */
	public String toString() {
		if (resource != null)
			return "Website:" + "www." + super.toString() + "/" + resource;
		else 
			return "Website:" + "www." + super.toString();
			
	}
	
	/**
	 * equals method will compare two objects of type web page address, if all attributes are identical it will return true, otherwise false.
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
		WebPageAddress w = (WebPageAddress) o;
		return this.toString().equals(w.toString()) ;
	}
	
	
	
}
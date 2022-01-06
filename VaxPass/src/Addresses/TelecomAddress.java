// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Telecom Address Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Telecom Address class is to determine all the attributes and methods used in order to build and manipulate a Telecom Address object.

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
 * This class stores and handles attributes and methods concerning the phone number of the patient and clinics.
 */

public class TelecomAddress extends Address {

	/**
	 * String containing the number
	 */
	String number;
	/**
	 * String containing the area code
	 */
	String areaCode;

	


	

	/**
	 * Default constructor
	 */
	public TelecomAddress() {
		
	}

	/**
	 * Copy constructor
	 * @param t object of type telecom address used as the copy object when a new object is created of this type
	 */
	public TelecomAddress(TelecomAddress t) {
		this.number = t.number;
		this.areaCode = t.areaCode;
	}

	/**
	 * Parametrized constructor
	 * @param number String containing the number
	 */
	public TelecomAddress(String number) {
		this.number = number;
		this.areaCode = number.substring(0, 3);
	}

	
	
	/**
	 * Getter (Accessor) method used to get/access the number
	 * @return String containing the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Setter (Mutator) method used to set/mutate the value of the number
	 * @param number String containig the number
	 */
	public void setNumber(String number) {
		this.areaCode = number.substring(0, 3);
		this.number = number;
	}
	/**
	 * Getter (Accessor) method for the area code will get/access it.
	 * @return String containing the area code
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the area code
	 * @param areaCode String containing the area code.
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * toString method will return the attributes of this method by displaying the phone number, essentially showing the area code followed by the phone number
	 */
	public String toString() {
		
		return "1" + "-" + areaCode + "-" + number.substring(3, 6) + "-" + number.substring(6,10);
	
}

	/**
	 * equals method will compare two objects of type telecome and will compare its attributes if they are the same it will return true.
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
		TelecomAddress tA = (TelecomAddress) o;
		return this.number == tA.number;
	}
	

    
}
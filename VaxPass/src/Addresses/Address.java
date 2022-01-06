// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Address Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Address is to contain methods that child classes will have and to insure they will override the methods contained in this class.

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
 * This is the superclass to all of the classes concerning the address, containing the toString and equals methods which are later overridden in the child classes.
 */

abstract public class Address {
	
	/**
	 * toString abstract method later overridden in child classes.
	 */
	public abstract String toString();
	
	/**
	 * equals abstract method later overridden in child classes.
	 */
	public abstract  boolean equals(Object o);
	
	
}

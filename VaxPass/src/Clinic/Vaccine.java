// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Vaccine Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Vaccine class is to determine all the attributes and methods used in order to build and manipulate a Vaccine object.

/**
 * Adir Ben-David 40190551 & Jonathan Abitbol 40190550
 * COMP 249
 * Assignment #2
 * 10/31/2021
 */

package Clinic;

import Addresses.*;

/**
 * The Patient and Vaccine classes provide information about a patient, and his vaccination dates and locations and addresses pulled from the address classes.
 * @author Jonathan Abitbol & Adir Ben-David
 * @version 1.0
 * @since 2021-10-10
 */


/**
 * Vaccine class contains the attributes and methods concerning the vaccine and when/where it is taken.
 */
public class Vaccine  {
	//Attributes
	/**
	 * enum holding type vaccine the patient receives.
	 */
	public enum vaxType {
		PFIZER,
		MODERNA,
		ASTRAZENICA,
		OTHER;
	}
	
	/**
	 * Private value of type vaccine type which holds the type of vaccine
	 */
	private vaxType type;
	/**
	 * int that holds day of patient's 1st dose 
	 */
	private int day;
	/**
	 * int that holds month of patient's 1st dose 
	 */
	private int month;
	/**
	 * int that holds year of patient's 1st dose 
	 */
	private int year;
	/**
	 * String that holds date of patient's 1st dose 
	 */
	public String date;
	/**
	 * Array of type address containing all of the addreses of the clinics
	 */
	Address[] address;
	
	
		
		/**
		 * Default constructor setting all vaccine informtation to "null" in this case.
		 */
	public Vaccine() {
		this.date = "YYYY-MM-DD";
		this.type = null;
		this.address = null;
	}
	
	
	/**
	 * Copy Constructor
	 * @param v object of type vaccine which is used as the copy object when a new vaccine object is created
	 */
	public Vaccine(Vaccine v) {
		this.date = v.date;
		this.type = v.type;
		this.address = v.address;
		
	}

	/**
	 * Parametrized Constructor.
	 * @param day holds the day the patient took the vaccine
	 * @param month holds the month the patient took the vaccine
	 * @param year holds the year the patient took the vaccine
	 * @param type holds the type of vaccine the patient took 
	 * @param address holds the address where the patient took the vaccine
	 */
	public Vaccine(int day,int month,int year, vaxType type, Address[] address) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.date = year + "-" + getMonth() + "-" + getDay();
		this.type = type;
		this.address = address;
		}

	
	/**
	 * Getter (Accessor) method used to get the type of vaccine
	 * @return returns the type of vaccine
	 */
	public vaxType getType() {
		return type;
	}

	/**
	 * Setter (Mutator) method used to set a type of vaccine to a given patient
	 * @param type vaccine type that is set to a patient (enum)
	 */
	public void setType(vaxType type) {
		this.type = type;
		
	}

	/**
	 * Setter (Mutator) method used to set a type of vaccine to a given patient
	 * @param type String vaccine type that is set to a patient
	 */
	public void setType(String type) {
		this.type = vaxType.valueOf(type.toUpperCase());
	}

	/**
	 * Getter (Accessor) method that accesses the day of the vaccination
	 * @return String, returns the day when the vaccine was given, if under 10 a 0 is added in front to keep 2 digits otherwise nothing is added.
	 */
	public String getDay() {
		if(day <10) {
			return "0" + day;
		}
		else
			return day + "";
	}

	/**
	 * Setter (Mutator) method used to set a day of vaccination to a patient
	 * @param day integer day storing the day at which the patient got vaccinated
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Getter (Accessor) method that is used to get/acess the month at which the patient got vaccinated
	 * @return String, returns the month when the vaccine was given, if under 10 a 0 is added in front to keep 2 digits otherwise nothing is added
	 */
	public String getMonth() {
		if (month < 10) {
			return "0" + month;
		}
		else
			return month + "";
	}

	/**
	 * Setter (Mutator) method used to set a month of vaccination to a patient
	 * @param month integer of month containing the month at which the patient got vaccinated
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Getter (Accessor) method that is used to get/acess the year at which the patient got vaccinated
	 * @return String, returns the year when the vaccine was given.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Setter (Mutator) method used to set a year of vaccination to a patient
	 * @param year integer of year containing the year at which the patient got vaccinated
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
	/**
	 * String method toString that will return the vaccination type, the date and the information of the clinic when called.
	 */
	public String toString() {
		return type + ", " + date + "\n" + printClinicInfo();
		
		
	}
	
	/**
	 * Equals method that will compare two objects of the vaccine type and verify if they have identical attributes, if they do then they are equal.
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
		
		Vaccine v = (Vaccine) o;
		return this.type == v.type && this.date == v.date;
	}

	
	/**
	 * Getter (Accessor) method used to get/access the date of vaccination
	 * @return String holding the date of vaccination
	 */
	public String getDate() {
		return date = year + "-" + getMonth() + "-" + getDay();
	}

	
	
	/**
	 * Method used to print the entirity of the information regarding the clinic including the address
	 * @return String that will contain the address information of the clinic
	 */
	public String printClinicInfo() {
		String info = "";
		for (int i = 0; i<address.length;i++) {
		info += address[i] + "\n";
		}
		return info;
		
	}
	
	
	

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

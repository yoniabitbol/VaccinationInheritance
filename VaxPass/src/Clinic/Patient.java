// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Patient Class.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this Patient class is to determine all the attributes and methods used in order to build and manipulate a Patient object.

/**
 * Adir Ben-David 40190551 & Jonathan Abitbol 40190550
 * COMP 249
 * Assignment #2
 * 10/31/2021
 */


package Clinic;


/**
 * The Patient and Vaccine classes provide information about a patient, and his vaccination dates and locations and addresses pulled from the address classes.
 * @author Jonathan Abitbol & Adir Ben-David
 * @version 1.0
 * @since 2021-10-10
 */



/**
 * The Patient class handles and stores methods concerning the patient's information and their vaccination statuses.
 */


public class Patient {
	/**
	 * Patient name
	 */
	private String name;
	/**
	 * Patient health card number
	 */
	private String cardNumber;
	/**
	 * Patient email address
	 */
	private String email;
	/**
	 * Patient phone number
	 */
	private String phone;
	/**
	 * Patient First Dose
	 */
	private Vaccine dose1;
	/**
	 * Patient Second Dose
	 */
	private Vaccine dose2;
	
	
	
	
	/**
	 * Default Constructor.
	 */
	public Patient() {
		

	}

	/**
	 * Copy Constructor
	 * @param p is the copy object for when a new object of type patient is created
	 */
	public Patient(Patient p) {
		this.name = p.name;
		this.cardNumber = p.cardNumber;
		this.email = p.email;
		this.phone = p.phone;
		this.dose1 = p.dose1;
		this.dose2 = p.dose1;

	}

	//Contructors
	/**
	 * Parametrized Constructor.
	 * @param name String that holds the patients name
	 * @param cardNum String containing the card number
	 * @param email String containing the email
	 * @param phone String containing phone number
	 * @param d1 Vaccine object for dose 1
	 * @param d2 Vaccine object for dose 2
	 */
	public Patient(String name, String cardNum, String email, String phone, Vaccine d1,Vaccine d2) {
		this.name = name;
		this.cardNumber = cardNum;
		this.email = email;
		this.phone = phone;
		this.dose1 = d1;
		this.dose2 = d2;
	}

/**
 * Getter (Accessor) method to get/access the name of the patient
 * @return String containing the name of the patient
 */
	public String getName() {
		return name;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the name of the patient
	 * @param name String containint name which will be set as the new name of the patient
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter (Accessor) method to get/access the card number of the patient
	 * @return String containing the card number of the patient
	 */
	public String getCardNum() {
		return cardNumber;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the card number of the patient
	 * @param cardNum String which will become the patients card number
	 */
	public void setCardNum(String cardNum) {
		this.cardNumber = cardNum;
	}

	
	/**
	 * Getter (Accessor) method to get/access the email of the patient
	 * @return String containing the email of the patient
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the email of the patient
	 * @param email String which will become the patients emial
	 */
	public void setEmail(String email) {
		this.email = email;
	}

/**
	 * Getter (Accessor) method to get/access the phone number of the patient
	 * @return String containing the phone number of the patient
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the phone number of the patient
	 * @param phone String which will become the patients phone number
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Getter (Accessor) method to get/access the first dose type of the patient
	 * @return enum containing the first dose type of the patient
	 */
	public Vaccine getDose1() {
		return dose1;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the first dose of the patient
	 * @param dose1 enum containing the patients first dose is set to the patient
	 */
	public void setDose1(Vaccine dose1) {
		this.dose1 = dose1;
	}

	/**
	 * Getter (Accessor) method to get/access the second dose type of the patient
	 * @return enum that contains the type of second dose 
	 */
	public Vaccine getDose2() {
		return dose2;
	}

	/**
	 * Setter (Mutator) method that sets/mutates the Second dose of the patient
	 * @param dose2 vaccine object set to the type of dose 2 when this method is called
	 */
	public void setDose2(Vaccine dose2) {
		this.dose2 = dose2;
	}
	
	/**
	 * toString method will return the information about the patient in its entirety containing all of the attributes in the class to fully display them to the user.
	 */
	public String toString() {
		if (dose1 == null && dose2 == null) {
		return"Name:" + name + "\nCard number:" + cardNumber + "\nE-mail:" + email + "\nPhone:" + phone + "\nDose 1: Has not been taken yet" + "\nDose 2 valid date: 4 weeks/28 days after the first dose has been taken ";
		}else if (dose2 == null) {
			secondDoseValid();
			return "Name: " + name + "\nCard number:" + cardNumber + "\nE-mail:" + email + "\nPhone:" + phone + "\nDose 1: " + dose1 + "\nDose 2:" + secondDoseValid();
		}else
			return "Name: " + name + "\nCard number:" + cardNumber + "\nE-mail:" + email + "\nPhone:" + phone + "\nDose 1: " + dose1 + "\nDose 2:" + dose2;
				
			
		
	}


	/**
	 * equals method that is used to compare all of the attributes of another given object of type Patient to see if they are identical, if so this method will return a value of true.
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
		Patient p = (Patient) o;
		return this.name == p.name && this.phone == p.phone && this.cardNumber == p.cardNumber && this.email == p.email && this.dose1 == p.dose1 && this.dose2 == p.dose2;
		
	}
	
	/**
	 * This method validates when a patient is ready to get the second dose. 
	 * @return a string that contains the date for which the second dose is valid to be taken for a given patient.
	 */
	private String secondDoseValid() {
		int monthDays = 0;
		int[] month = {0,1,2,3,4,5,6,7,8,9,10,11};
		int yeardose2;
		int monthdose2;
		int daydose2;
		String dayString;
		String monthString;
		switch(month[Integer.valueOf(dose1.getMonth())-1]) {
		case 0 ,2,4,6,7,11:
			monthDays = 31;
			break;
		case 3,5,8,10:
			monthDays = 30;
			break;
			
		case 1:
			monthDays = 28;
			break;
			
		}
		
		if (Integer.valueOf(dose1.getDay()) +28 > monthDays) {
			if (!dose1.getMonth().equals("12")) {
			yeardose2 = (dose1.getYear());
			monthdose2 = (Integer.valueOf(dose1.getMonth())+1);
			}else {
			yeardose2 = (dose1.getYear()+1);
			monthdose2 = 1;
			}
			
			daydose2 = (Integer.valueOf(28-(monthDays-Integer.valueOf(dose1.getDay()))));
			
		}else
			daydose2 = (Integer.valueOf(dose1.getDay())+28);
			monthdose2 = (Integer.valueOf(dose1.getMonth()));
			yeardose2 = (Integer.valueOf(dose1.getYear()));
		
		if (daydose2 < 10) 
			dayString = "0" + daydose2;
		else
			dayString = daydose2 + "";
		
		if (monthdose2 < 10)
			monthString = "0"+ monthdose2;
		else
			monthString = monthdose2 +"";
		
		return yeardose2 + "-" + monthString + "-" + dayString;
		
	}
	
	/**
	 * This method will allow the user to edit the date of the dose of vaccine using accessors and mutators.
	 * @param month int containing the month of vaccination
	 * @param day int containing the day of vaccination
	 * @param year int containing the year of vaccination
	 */
	public void changeDoseDate(int month,int day,int year) {
		dose1.setMonth(month);
		dose1.setDay(day);
		dose1.setYear(year);
		dose1.date = dose1.getDate();


	} 
	
	/**
	 * This method will send an alert to a patient of when the first and second vaccination dates are.
	 */
	public void reminderAlert() {
			if (dose1 != null){
			System.out.println("Send to" + phone + " and " + email + ":Your appointment for your first vaccination dose is " + dose1.getDate());

			System.out.println("Send to: " + phone + " and " + email + ":Your appointment for your second vaccination dose is " + secondDoseValid());
			}
		
	}
	
	
	
	
}

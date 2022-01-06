// -------------------------------------------------------
// Assignment 2
// Written by: Jonathan Abitbol 40190550 & Adir Ben-David 40190551
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 31, 2021
// -------------------------------------------------------

//Welcome to my Driver.
//This program is written on 10/10/2021 by Jonathan Abitbol & Adir Ben-David.
///The purpose of this driver is to display all functions of the classes and methods created that inherit from each other.

/**
 * Adir Ben-David 40190551 & Jonathan Abitbol 40190550
 * COMP 249
 * Assignment #2
 * 10/31/2021
 */

package Clinic;

import Addresses.*;
import Addresses.CivicAddress.province;
import Clinic.Vaccine.vaxType;

/**
 * The Patient and Vaccine classes provide information about a patient, and his vaccination dates and locations and addresses pulled from the address classes.
 * @author Jonathan Abitbol & Adir Ben-David
 * @version 1.0
 * @since 2021-10-10
 */

/**
 * Main method is contained in the Driver class, which is used to apply the inheritance and polymorphism concepts to the created classes.
 */

/**
 * The driver class is where all of the classes and methods created in the
 * classes are used
 */
public class Driver {

	/**
	 * Trace patient method will evaluate which patients are not yet fully
	 * vaccinated.
	 * 
	 * @param patientsArray array holding all of the patients to pass through to
	 *                      verify if the conditions in the method are met.
	 */
	public static void tracePatients(Patient patientsArray[]) {

		System.out.println("The following patient(s) are not fully vaccinated:");
		for (int i = 0; i < patientsArray.length; i++) {
			if (patientsArray[i].getDose2() == null || patientsArray[i].getDose1() == null) {

				System.out.println(patientsArray[i].toString());

				System.out.println("\n\n");

			} else if (patientsArray[i].getDose2().getYear() > patientsArray[i].getDose1().getYear())

				if (Integer.valueOf(patientsArray[i].getDose2().getMonth()) >= Integer
						.valueOf(patientsArray[i].getDose1().getMonth())) {

					if (Integer.valueOf(patientsArray[i].getDose2().getDay()) >= Integer
							.valueOf(patientsArray[i].getDose1().getDay())) {

						System.out.println(patientsArray[i].toString());

						System.out.println("\n\n");

					}
				}

		}
	}

	/**
	 * The method will take as input an array of these objects and returns a copy of
	 * that array
	 * 
	 * @param a array containing the address objects
	 * @return the copy of the array of objects passed
	 */
	public static Address[] copyAddresses(Address[] a) {

		Address[] b = new Address[a.length];

		for (int i = 0; i < a.length; i++) {

			if (a[i] instanceof CivicAddress)

				b[i] = new CivicAddress((CivicAddress) a[i]);

			else if (a[i] instanceof EmailAddress)

				b[i] = new EmailAddress((EmailAddress) a[i]);

			else if (a[i] instanceof TelecomAddress)

				b[i] = new TelecomAddress((TelecomAddress) a[i]);

			else if (a[i] instanceof WebPageAddress)

				b[i] = new WebPageAddress((WebPageAddress) a[i]);
		}
		return b;

	}

	/**
	 * Main method allows to use the methods
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		domainAddress sunshineClinicDomain = new domainAddress("sunshineclinic", "com");
		Address Sunshine[] = { new CivicAddress("Sunshine", "8888", "Sunshine Road", "H7W4M2", province.NB),
				new WebPageAddress(sunshineClinicDomain, "sunshineclinic"),
				new EmailAddress("sunshine", sunshineClinicDomain), new TelecomAddress("5144588885"),
				sunshineClinicDomain };

		domainAddress emergencyClinicDomain = new domainAddress("emergencyclinic", "net");
		Address Emergency[] = { new CivicAddress("Emergency Clinic", "333", "Campbell Road", "H6W7R5", province.QC),
				new WebPageAddress(emergencyClinicDomain, "emergencyclinic"),
				new EmailAddress("emergencyclinic999", emergencyClinicDomain), new TelecomAddress("5148839948") };

		domainAddress adventHealthClinic = new domainAddress("adventhealth", "ca");
		Address Advent[] = { new CivicAddress("Advent Health", "1111", "Advent Street", "H9P8R7", province.BC),
				new WebPageAddress(adventHealthClinic, "advent"),
				new EmailAddress("adventhealth399", adventHealthClinic), new TelecomAddress("4509988856")

		};

		domainAddress cvsPharmacyDomain = new domainAddress("cvspharmacy", "com");
		Address CVSPharm[] = { new CivicAddress("CVS Pharmacy", "885", "Main Road", "H3W5P5", province.AB),
				new WebPageAddress(cvsPharmacyDomain, "cvspharm"),
				new EmailAddress("cvspharmacy999", cvsPharmacyDomain), new TelecomAddress("4509948839")

		};
		Address[][] addresses = { Sunshine, Emergency, Advent, CVSPharm };
		System.out.println("All address objects displayed: ");
		for (int i = 0; i < addresses.length; i++) {

			for (int j = 0; j < addresses[i].length; j++) {

				System.out.println(addresses[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("Checking if the objects are equal:\n\n");

		System.out.println(" Testing equality for the Addresses of Sunshine and Emergency Clinic equality, value is : "
				+ Sunshine[0].equals(Emergency[0]));

		Patient James = new Patient("James", "235235", "James@gmail.com", "3344455566",
				new Vaccine(2, 12, 2021, vaxType.PFIZER, Sunshine), null);
		Patient Robert = new Patient("Robert", "636346", "Robert@mail.concordia.ca", "4242424242",
				new Vaccine(1, 11, 2021, vaxType.PFIZER, Sunshine),
				new Vaccine(29, 11, 2021, vaxType.ASTRAZENICA, Emergency));
		Patient John = new Patient("John", "74565", "John@yahoo.ca", "5352424242",
				new Vaccine(18, 12, 2021, vaxType.ASTRAZENICA, Advent),
				new Vaccine(19, 12, 2022, vaxType.ASTRAZENICA, Emergency));
		Patient Michael = new Patient("Michael", "546858", "Michael@yahoo.ca", "5354646476",
				new Vaccine(18, 10, 2021, vaxType.OTHER, CVSPharm),
				new Vaccine(19, 11, 2021, vaxType.ASTRAZENICA, Emergency));
		Patient William = new Patient("William", "67694", "William@outlook.com", "6667778866",
				new Vaccine(18, 10, 2021, vaxType.ASTRAZENICA, Sunshine),
				new Vaccine(31, 11, 2021, vaxType.MODERNA, Sunshine));
		Patient David = new Patient("David", "37457", "David@outlook.com", "9958847736",
				new Vaccine(18, 10, 2021, vaxType.PFIZER, Sunshine), new Vaccine(19, 11, 2021, vaxType.PFIZER, Advent));
		Patient Richard = new Patient("Richard", "324636", "Richard@outlook.com", "3323131212",
				new Vaccine(18, 10, 2021, vaxType.ASTRAZENICA, Sunshine),
				new Vaccine(31, 11, 2021, vaxType.PFIZER, Advent));
		Patient Joseph = new Patient("Joseph", "342335", "Joseph@gmail.com", "4241242455",
				new Vaccine(18, 10, 2021, vaxType.PFIZER, Sunshine),
				new Vaccine(19, 11, 2021, vaxType.PFIZER, Sunshine));
		Patient Thomas = new Patient("Thomas", "723473", "Thomas@yahoo.ca", "0098877654",
				new Vaccine(18, 10, 2021, vaxType.ASTRAZENICA, Sunshine),
				new Vaccine(19, 11, 2021, vaxType.MODERNA, Advent));
		Patient Christopher = new Patient("Christopher", "52352", "Christopher@yahoo.ca", "4433323344",
				new Vaccine(29, 10, 2021, vaxType.PFIZER, Sunshine),
				new Vaccine(19, 11, 2021, vaxType.MODERNA, Advent));
		Patient Charles = new Patient("Charles", "646346", "Charles@yahoo.ca", "5542414131",
				new Vaccine(18, 10, 2021, vaxType.PFIZER, Sunshine), new Vaccine(19, 11, 1, vaxType.PFIZER, Advent));
		Patient Daniel = new Patient("Daniel", "757534", "Daniel@yahoo.ca", "1244214212",
				new Vaccine(18, 10, 2021, vaxType.ASTRAZENICA, Sunshine),
				new Vaccine(19, 11, 2021, vaxType.PFIZER, Advent));
		Patient Matthew = new Patient("Matthew", "345346", "Matthew@yahoo.ca", "4124454565",
				new Vaccine(18, 10, 2021, vaxType.PFIZER, Sunshine), new Vaccine(19, 11, 2021, vaxType.PFIZER, Advent));
		Patient Anthony = new Patient("Anthony", "573463", "Anthony@yahoo.ca", "2423131313",
				new Vaccine(18, 10, 2021, vaxType.ASTRAZENICA, Sunshine),
				new Vaccine(19, 11, 2021, vaxType.MODERNA, Advent));
		Patient Mark = new Patient("Mark", "252335", "Mark@yahoo.ca", "12412424212",
				new Vaccine(18, 10, 2021, vaxType.PFIZER, Sunshine),
				new Vaccine(19, 11, 2021, vaxType.MODERNA, Advent));

		Patient[] ArrayOfPatients = { James, Robert, John, Michael, William, David, Richard, Joseph, Thomas,
				Christopher, Charles, Daniel, Matthew, Anthony, Mark };

		for (int i = 0; i < ArrayOfPatients.length; i++) {

			System.out.println(ArrayOfPatients[i]);
		}

		Address[] CVSPharmacyCopy = Driver.copyAddresses(CVSPharm);

		tracePatients(ArrayOfPatients);

		System.out.println("Displaying ");
		System.out.println("This is the original address:");
		for (int i = 0; i < CVSPharm.length; i++) {
			System.out.println(CVSPharm[i]);
		}

		System.out.println("This is the copied address of CVS Pharmacy!: ");
		for (int i = 0; i < CVSPharmacyCopy.length; i++) {
			System.out.println(CVSPharmacyCopy[i]);
		}

		System.out.println(CVSPharm[0] == CVSPharmacyCopy[0]);

		System.out.println("Program is Terminated.");

	}

}

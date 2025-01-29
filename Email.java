package com.flm.email;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String paassword;
	private String email;
	private int defultPaasswordLength = 8;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "sscompany.com";

	public Email(Scanner scan) {
		// TODO Auto-generated constructor stub
	}

	// Constructor to receive firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department - RETURN the department
		this.department = chooseDepartment();
		//System.out.println("department code: " + this.department);

		// Call the password method
		this.paassword = randomPassword(defultPaasswordLength);
		System.out.println("Your Paassword is: " + this.paassword);

		// Combine details to generate email
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "."
				+ this.companySuffix;
	//	System.out.println("Your email is: " + email);
	}

	// Ask for the department
	public String chooseDepartment() {
		System.out.print(
				"New worker "+ this.firstName +" "+ "department Codes :\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner scanner = new Scanner(System.in);
		int depChoice = scanner.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "development";
		} else if (depChoice == 3) {
			return "accounting";
		} else {
			return "None";
		}
	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Email Info
	public String showInfo() {
		return "DEPLAY NAME : "+ this.firstName+" "+this.lastName+
				"\nCOMPANY EMAIL : "+ this.email+
				"\nMAILBOXCAPACITY : "+ this.mailboxCapacity+"mb";
		
	} 

	// Set the mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	// Set the alterEmail
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	// Change the password
	public void setPaassword(String paassword) {
		this.paassword = paassword;
	}

	public String getPaassword() {
		return paassword;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

}

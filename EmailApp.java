package com.flm.email;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the firstName : ");
		String firstName = scanner.next();
		System.out.print("Enter the lastName : ");
		String lastName = scanner.next();
		Email email = new Email(firstName, lastName);

		//email.setAlternateEmail("bussatler@gmail");
		// System.out.println(email.getAlternateEmail());
		System.out.println(email.showInfo());
		// email.setMailboxCapacity(500);
		// email.setPaassword(null);
	}

}

package com.greatlearning.service;

import com.greatlearning.model.*;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dept;
		String email = "";
		String password = "";
		System.out.println("Please enter the department from the following:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		dept = sc.nextInt();
		
		Employee employee = new Employee("sai", "krishna");
		CredentialService c = new CredentialService();
		if(dept <= 4) {
		email = c.generateEmailAddress(employee.getFirstName(), employee.getLastName(), dept);
		password = c.generatePassword(8);
		c.showCredentials(employee.getFirstName(), email, password);
		}
		else {
			System.out.println("Invalid input");
			
		}
		sc.close();
		
	}

}

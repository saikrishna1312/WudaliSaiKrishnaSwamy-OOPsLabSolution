package com.greatlearning.service;
import com.greatlearning.model.*;

import java.security.SecureRandom;

public class CredentialService {
	
	public String generateEmailAddress(String firstName, String lastName, int x) {
		
		String company = "xyz";
		String dept = "";
		//String Email = "";
		switch(x) {
			case 1 :
				dept = "tech";
				break;
			case 2 :
				dept = "admin";
				break;
			case 3 :
				dept = "hr";
				break;
			case 4 :
				dept = "legal";
				break;
			
		}
		return firstName + lastName + "@" + dept + "." + company + ".com";
		
	}	
		
			
	
	public String generatePassword(int len) {
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*(){}><?/";
		// String password;
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
         
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
       
	}
	
	public void showCredentials(String firstName, String email, String password) {
		
		System.out.println("Dear "+ firstName + " , your generated credentials are following:");
		System.out.println("Email ID: " + email);
		System.out.println("Password: " + password);
	}
		
}


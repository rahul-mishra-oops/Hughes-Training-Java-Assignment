/**
 * 
 */
package com.hughes.questions;

/**
 * @author USER
 *
 */


public class ValidMail {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "vasu34kgmail.com";
		
		String check = "@gmail.com";
		
		if(str.contains(check)) {
			System.out.print("Valid email");
		}else {
			System.out.print("Invalid email");
		}
		
		

	}

}

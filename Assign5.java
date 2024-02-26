/**
 * 
 */
package com.hughes.questions;

/**
 * @author USER
 *
 */
public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Computer";
		String output = GenerateNew(input);
		System.out.println(output);

	}
	
	public static String GenerateNew(String input) {
		StringBuilder NewString = new StringBuilder();
		for(int i=input.length()-1;i>=0;i--) {
			NewString.append(input.charAt(i)).append(" ");
		}
		
		return NewString.toString().trim();
	}

}

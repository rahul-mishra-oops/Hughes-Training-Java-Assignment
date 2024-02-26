package com.hughes.questions;

public class CaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Fullstack";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}else {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}
		}

	}

}

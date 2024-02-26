/**
 * 
 */
package com.hughes.questions;

/**
 * @author USER
 *
 */
public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 25;
		String str = String.valueOf(input);
		StringBuilder s = new StringBuilder();
		s.append(str);
		s.reverse();
		int length = s.length();
		String answer="";
		for(int i=length-1;i>=0;i--) {
//			System.out.println(i);
			
			//for 6th and 3rd digit
			if(i==5 ||i==2) {
				switch(s.charAt(i)) {
				case '1': 
					System.out.print(answer+" One Hundred");
					break;
				case '2': 
					System.out.print(answer+" Two Hundred");
					break;
				case '3': 
					System.out.print(answer+" Three Hundred");
					break;
				case '4': 
					System.out.print(answer+" Four Hundred");
					break;
				case '5': 
					System.out.print(answer+" Five Hundred");
					break;
				case '6': 
					System.out.print(answer+" Six Hundred");
					break;
				case '7':  
					System.out.print(answer+" Seven Hundred");
					break;
				case '8': 
					System.out.print(answer+" Eight Hundred");
					break;
				case '9': 
					System.out.print(answer+" Nine Hundred");
					break;
				default :
					System.out.print("");
				}
				
			}
			
			//for the 5th and 2nd digits
			
			if(i==4 ||i==1) {
				switch(s.charAt(i)) {
				case '1':
					System.out.print("");
					break;
				case '2': 
					System.out.print(answer+" Twenty");
					break;
				case '3': 
					System.out.print(answer+" Thirty");
					break;
				case '4': 
					System.out.print(answer+" Forty");
					break;
				case '5': 
					System.out.print(answer+" Fifty");
					break;
				case '6': 
					System.out.print(answer+" Sixty");
					break;
				case '7':  
					System.out.print(answer+" Seventy");
					break;
				case '8': 
					System.out.print(answer+" Eighty");
					break;
				case '9': 
					System.out.print(answer+" Ninty");
					break;
				default:
					System.out.print("");
					break;
				}
				
			}
			
			
		
//				for 4th digit
			
			if(i==3) {
				switch(s.charAt(i)) {
				case '1': 
					System.out.print(answer+" One Thousand");
					break;
				case '2': 
					System.out.print(answer+" Two Thousand");
					break;
				case '3': 
					System.out.print(answer+" Three Thousand");
					break;
				case '4': 
					System.out.print(answer+" Four Thousand");
					break;
				case '5': 
					System.out.print(answer+" Five Thousand");
					break;
				case '6': 
					System.out.print(answer+" Six Thousand");
					break;
				case '7':  
					System.out.print(answer+" Seven Thousand");
					break;
				case '8': 
					System.out.print(answer+" Eight Thousand");
					break;
				case '9': 
					System.out.print(answer+" Nine Thousand");
					break;
				default :
					System.out.print(answer+" Thousand");
				}
			}
			
			//for last digit
			
			if(i==0) {
				switch(s.charAt(i)) {
				case '1': 
					System.out.print(answer+" One");
					break;
				case '2': 
					System.out.print(answer+" Two");
					break;
				case '3': 
					System.out.print(answer+" Three");
					break;
				case '4': 
					System.out.print(answer+" Four");
					break;
				case '5': 
					System.out.print(answer+" Five");
					break;
				case '6': 
					System.out.print(answer+" Six");
					break;
				case '7':  
					System.out.print(answer+" Seven");
					break;
				case '8': 
					System.out.print(answer+" Eight");
					break;
				case '9': 
					System.out.print(answer+" Nine");
					break;
				default :
					System.out.print("");
				}
			}
			
			//for 5th digit if it is one
			if(i==4 &&s.charAt(i)=='1') {
				String temp = "1"+s.charAt(i-1);
				i--;
				switch(temp) {
				case "11": 
					System.out.print(answer+" Eleven Thousand");
					break;
				case "12": 
					System.out.print(answer+" Tweleve Thousand");
					break;
				case "13": 
					System.out.print(answer+" Thirteen Thousand");
					break;
				case "14": 
					System.out.print(answer+" Fourteen Thousand");
					break;
				case "15": 
					System.out.print(answer+" Fifteen Thousand");
					break;
				case "16": 
					System.out.print(answer+" Sixteen Thousand");
					break;
				case "17":  
					System.out.print(answer+" Seventeen Thousand");
					break;
				case "18": 
					System.out.print(answer+" Eighteen Thousand");
					break;
				case "19": 
					System.out.print(answer+" Ninteen Thousand");
					break;
				default :
					System.out.print(answer+" Ten Thousand");
				}
				
			}
			//for 2nd if it is one
			if(i==1&&s.charAt(i)=='1') {
				String temp = "1"+s.charAt(i-1);
				i--;
				switch(temp) {
				case "11": 
					System.out.print(answer+" Eleven");
					break;
				case "12": 
					System.out.print(answer+" Tweleve");
					break;
				case "13": 
					System.out.print(answer+" Thirteen");
					break;
				case "14": 
					System.out.print(answer+" Fourteen");
					break;
				case "15": 
					System.out.print(answer+" Fifteen");
					break;
				case "16": 
					System.out.print(answer+" Sixteen");
					break;
				case "17":  
					System.out.print(answer+" Seventeen");
					break;
				case "18": 
					System.out.print(answer+" Eighteen");
					break;
				case "19": 
					System.out.print(answer+" Ninteen");
					break;
				default :
					System.out.print(answer+" Ten");
				}
				
			}
		}

	}

}

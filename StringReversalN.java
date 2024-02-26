/**
 * 
 */
package com.hughes.questions;

/**
 * @author USER
 *
 */

//i/p:a b c d e f
//o/p:f1 e2 d3 c4 b5 a6
public class StringReversalN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "a b c d e f g";
		String output = GenerateResult(input);
		System.out.println(output);

	}
	
	public static String GenerateResult(String input) {
		int counter =1;
        StringBuilder output = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                currentWord.insert(0, ch);
            } else {
                output.append(currentWord).append(counter);
                if (i != 0) {
                    output.append(" ");
                }
                counter++;
                currentWord.setLength(0);
            }
        }
        
        output.append(currentWord).append(counter);

        return output.toString();
	}
	
	

}



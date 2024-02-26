/**
 * 
 */
package com.hughes.arrays;
import java.util.Arrays;

/**
 * @author USER
 *
 */

//To remove duplicates from array and return new length
public class Assign3arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20 ,20,30,40,50,50,50};
		int length = updateLength(arr);
		System.out.println(length);

	}
	
	public static int updateLength(int[] arr) {
		if(arr.length==1) {
			return 1;
		}
		
		Arrays.sort(arr);
		
		int j=0;
		for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
		
		arr[j++]=arr[arr.length-1];
		
		return j;
		
		
	}

}

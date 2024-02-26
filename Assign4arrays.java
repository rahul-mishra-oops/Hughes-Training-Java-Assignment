/**
 * 
 */
package com.hughes.arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author USER
 *
 */

//To find the duplicates element in the array
public class Assign4arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,4,5,1,6,6,7,7,8,4,8,9,3,9};
		
		FindDuplicates(arr);

	}
	
	public static void FindDuplicates(int[] arr) {
		Set<Integer> Elements = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!Elements.add(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}

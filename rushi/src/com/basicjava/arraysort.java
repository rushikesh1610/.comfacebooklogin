package com.basicjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		  
	        // Applying sort() method over to above array
	        // by passing the array as an argument
	        Arrays.sort(arr);
	  
	        // Printing the array after sorting
	      //  System.out.printl(Arrays.toString(arr));
	        System.out.println(Arrays.toString(arr));
	}

}

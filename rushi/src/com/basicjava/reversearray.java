package com.basicjava;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] array1  =new int [] {1,2,3,4,5};
	
		
		for (int i=0;i<array1.length;i++) {
		
		System.out.println(array1 [i] +" ");
		
		}
		System.out.println("");
		System.out.println("the reverse array is ::");
		
		for (int i=array1.length-1;i>0;i--)
		
{
		System.out.println(array1[i] +"");
	}

}
}
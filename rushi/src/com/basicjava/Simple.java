package com.basicjava;

public class Simple {
	
	int x;
	

	public static void even (int x) {
	x=x; 
	if(x%2==0) {
		 
		System.out.println(x+" number is even");
	 
	}
      
	else 
	{
		System.out.println("number is odd");
	}
		
	}
		
	public static void main(String[] args) {
		
		
	even(10);
	}
	
	}

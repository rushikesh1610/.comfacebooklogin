package com.basicjava;

public class Reverse {
	
	
	
	
	
	public static void main(String[] args) {
		
		int x=123; 
	;
		int rem,  rev=0;
		
		while (x!=0)
		{
			
			x=x/10;
			rem =x%10;
			
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
		
	}	
		
		
		
}

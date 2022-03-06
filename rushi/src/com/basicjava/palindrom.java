package com.basicjava;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=121; // palindrome no reverse is same
		;
			int rem,  rev=0;
			int temp=x;
			while (temp!=0)
			{
				
				
				rem =temp%10;
				
				rev=rev*10+rem;
				temp=temp/10;
			}
			if (x==rev) {
				System.out.println(x + "number is paledrom");
			
		}	
			else {
				System.out.println(x+ "number is not palindrome");
			}	
			
			
	}	
		
	}



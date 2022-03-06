package com.basicjava;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=22, temp=0;
		for(int i=2; i<x-1;i++) {		
			
		
if(x%i==0)
{
	temp=temp+1;// ignore reapete action 
		
	}

		}
		if(temp>0) {
			System.out.println("number is not prime ");
			
		}
else {
	
	System.out.println("number is prime");
}
			
		}}

	


		
		
		
package com.basicjava;

import java.util.Scanner;

public class lcmhcf {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number::");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int no1=a;
		
			int no2=b;
			while(no1%no2!=0)
			{
			   int  rem=no1%no2;
			     
				no1=no2;
				no2=rem;
				
			}
			
			int gcd= no2;
			System.out.println(gcd);
			int lcm=(no1 * no2)/gcd ;
			
			System.out.println("lcm of number"+ lcm);
			}
		
		
	}



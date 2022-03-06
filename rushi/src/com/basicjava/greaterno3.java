package com.basicjava;

import java.util.Scanner;

public class greaterno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc =new Scanner (System.in);
	System.out.println("enter no");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if (a>b && a>c)
	{
	System.out.println("a is grater ");	
	}
	else if (b>a&&b>c)
	{
		System.out.println("b is grater ");
	}
	else {System.out.println("c is grater");}
}
}
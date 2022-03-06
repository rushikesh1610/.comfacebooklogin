package com.basicjava;

import java.util.Scanner;

public class Reversechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String::");
			String name=sc.next();//1221
			//String name = "ABCDE";  //rev = EDCBA
			int leng = name.length();//5
			//System.out.println(leng);
			String rev="";//ED
			for(int i=leng-1;i>=0;i--) {//i=4,3,2,1,0
				rev=rev+name.charAt(i);//EDCBA
			}
			System.out.println("Reverse of string is::"+rev);
		}
}	

     
 //char a []= name.toCharArray();
// int leng = name.length();
// String rev="";
//for(int i=leng-1;i>=0;i++)
//	rev =rev+a[i]

	//}	
//System.out.println("Reverse of string is::"+rev);/*


//stringbuffer sb= new stringbuffer (name)



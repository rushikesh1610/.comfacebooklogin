package com.basicjava;

public class duplicatestrigarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] s= {3,5,4,3,2,2,1};
System.out.println("reapete umber is :");
for(int i=0;i<s.length;i++) {
	
	
	for(int j=i+1 ;j<s.length;j++) {
		if((s [i]==s [j]) && (i!=j)) {
			
			System.out.println(s[j] +" ");
		}
		
	}
	}
}
	}
	
	



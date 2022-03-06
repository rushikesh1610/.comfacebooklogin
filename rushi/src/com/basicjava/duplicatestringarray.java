package com.basicjava;

public class duplicatestringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String R= "rushikesh ";
		int length=R.length();
		char [] ch=R.toCharArray();
		for (int i=0;i<length ;i++)
		{
for (int j=i+1;j<length;j++)
{	
			if ((ch[i]==ch[j]) &&( i!=j))
					{
					System.out.println(  "reapete charter are "+ ch[j]);
					}		
	}
		}
}
}
package com.star;

public class Star5 {

	public static void main(String[] args) {
	
		 int star=1;
		 int space=4;
		 for (int i=1;i<=5;i++) {
			 for (int j=1;j<=space;j++) {
				 System.out.print(" ");
				
			 }
			 
			 for (int k=1;k<=star;k++)
		System.out.print("*");
			 System.out.println(" ");
			 space=space-1;
			 star=star+2;
		 }

	}

}

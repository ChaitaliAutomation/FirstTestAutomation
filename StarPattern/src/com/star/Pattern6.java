  package com.star;

public class Pattern6 {

	public static void main(String[] args) {
		
		int star=9;
		int space = 0;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=star;j++) {
				System.out.print("*");
				
			}
			for (int k=1;k<=space;k++)
			
		
		System.out.print("\n");
		System.out.println("");

		star=star-2;
		space++;

	}

}}

package com.star;

public class Star01 {

	public static void main(String[] args) {
		
		int star=1;
		int space=4;
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			for(int k=1;k<=space;k++)
				System.out.print("");
			System.out.println("");
			star++;
			space--;
		}
	}}

				
	

package com.star;

public class Pattern5 {

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
			space--;
			star=star+2;
		}

	}

}

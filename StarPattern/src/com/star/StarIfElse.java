package com.star;

public class StarIfElse {

	public static void main(String[] args) {
		int space=4;
		int star=1;
		
		for(int i=1;i<=11;i++) {
			
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) 
				System.out.print("* ");
		
			
			System.out.print("\n");
			
		
		
		if(i<=5) {
			
			space--;
			star++;
		}
		else {
	
		space++;
		star--;
		
		}
		
	}
	
	
}}

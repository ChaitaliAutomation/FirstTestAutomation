package com.star;

public class DiamondStar {

	public static void main(String[] args) {
		
		int space=5;
		int star=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
			System.out.print(" ");	
			}
			for(int k=1;k<=star;k++) {
			System.out.print("* ");
			}
			System.out.print("\n");
			
			space--;
			star++;
		
		}
		int star1=5;
		int space1=1;
		for (int i=1;i<=6;i++) {
			
			for (int j=1;j<=space1;j++) {
				
				System.out.print(" ");
			}
			for (int k=1;k<=star1;k++) {
				
				System.out.print("* ");
			}
			System.out.print("\n");
			
			space1++;
			
			star1--;
			
		}
	}
	}



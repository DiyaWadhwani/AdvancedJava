//using if-else statements

import java.util.Scanner;
class Human
	{
		public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter an age :");
		int age = sc.nextInt();
		if(age > 18)
			System.out.println("You can vote !!");
		else
			System.out.println("You cannot vote. Please try again in a few years.");			
		}	
	}
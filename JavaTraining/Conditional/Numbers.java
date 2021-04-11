//using if statements

import java.util.Scanner;
class Numbers
	{
		public static void main(String[] args)
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter a number :");
				int number = sc.nextInt();
				if(number > 100)
					System.out.println("Number is greater than 100");
				System.out.println("End of program");
			}
	}
//using if-else-if statements

import java.util.Scanner;
class Days
	{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number between 1-7 :");
				int day = sc.nextInt();
				if(day == 1)
					System.out.println("Monday is the first day of the week");
				else if(day == 2)
					System.out.println("Tuesday is the second day of the week");
				else if(day == 3)
					System.out.println("Wednesday is the third day of the week");
				else if(day == 4)
					System.out.println("Thursday is the fourth day of the week");
				else if(day == 5)
					System.out.println("Friday is the fifth day of the week");
				else if(day == 6)
					System.out.println("Saturday is the sixth day of the week");
				else if(day == 4)
					System.out.println("Sunday is the last and seventh day of the week");
				else
					System.out.println("A week has only 7 days, Day "+day+" does not exist");
			}
	}
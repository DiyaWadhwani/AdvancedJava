//using switch cases

import java.util.Scanner;
class DaysWSwitch
	{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number between 1-7 :");
				int day = sc.nextInt();
				switch(day)
					{
						case 1:	System.out.println("Monday is the first day of the week");
								break;
						case 2: System.out.println("Tuesday is the second day of the week");
								break;
						case 3: System.out.println("Wednesday is the third day of the week");
								break;
						case 4:	System.out.println("Thursday is the fourth day of the week");
								break;
						case 5: System.out.println("Friday is the fifth day of the week");
								break;
						case 6:	System.out.println("Saturday is the sixth day of the week");
								break;
						case 7:	System.out.println("Sunday is the last and seventh day of the week");
								break;
						default: System.out.println("A week has only 7 days, Day "+day+" does not exist");
								 break;								 
					}	
			}
	}
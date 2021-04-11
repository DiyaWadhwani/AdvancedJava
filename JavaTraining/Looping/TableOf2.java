//using while loop 

import java.util.Scanner;
class TableOf2
	{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("\nEnter a number");
				int n = sc.nextInt();
				int i=1;
				System.out.println("\nTable of 2 until "+n+" :");
				while(i<=n)
					{
						System.out.println(i*2);
						i++;
					}
			}
	}
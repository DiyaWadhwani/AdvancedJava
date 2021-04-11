//using do-while loop

import java.util.Scanner;
class Print
	{
		public static void main(String[] args)
			{	
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number");
				int n = sc.nextInt();
				int i=1;
				do
					{
						System.out.println(i);
						i++;
					}while(i<=n);
			}
	}
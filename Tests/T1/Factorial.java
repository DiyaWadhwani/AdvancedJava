//factorial

import java.util.Scanner;
class Factorial
{
	int fact=1;
	
	void Fact(int n)
	{
		if(n==1)
			System.out.println("Factorial of "+n+" = "+fact);
		else
		{
			for(int i=1; i<=n; i++)
				fact = fact*i;
			System.out.println("Factorial of "+n+" = "+fact);
		}
	}
	
	public static void main(String[] args)
	{
		Factorial f = new Factorial();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find its factorial :");
		int num = sc.nextInt();
		f.Fact(num);		
	}
}
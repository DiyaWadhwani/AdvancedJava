//method overloading 

class Calculate
{
	int a,b;
	
	void Calculate()
	{
		System.out.println("Sum is "+(a+b));
	}
	
	int Calculate(int a)
	{	
		b=2;
		return (a+b);
	}
	
	int Calculate(int a, int b)
	{	
		return (a+b);
	}
	
	public static void main(String[] args)
		{
			Calculate c1 = new Calculate();
			c1.Calculate();
			int sum1 = c1.Calculate(5);
			System.out.println("Sum is "+sum1);
			int sum2 = c1.Calculate(6,3);
			System.out.println("Sum is "+sum2);

		}
}
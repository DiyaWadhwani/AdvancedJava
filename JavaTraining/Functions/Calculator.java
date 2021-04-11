
import java.util.Scanner;
class Calculator
	{
		int num1 = 5;
		int num2 = 10;
		
		void add()
			{
				System.out.println("Sum = "+(num1+num2));
			}
			
		void add(int a, int b)
			{
				System.out.println("Sum = "+(a+b));
			}
		
		int add(int a)
			{
				return(a+num2);
			}
				
		int add(int a, int b, int c)
			{
				return a+b+c;
			}		
		
		public static void main(String[] args)
			{	
				Calculator cal = new Calculator();
				Scanner sc = new Scanner(System.in);
				int res=0;
				System.out.println("\n1-No return type, no arguments\n2-No return type, with arguments\n3-With return type, no arguments\n4-With return type, with arguments\nEnter your choice :");
				int c = sc.nextInt();
				switch(c)
					{
						case 1:	cal.add();
								break;
						
						case 2: System.out.println("Enter 2 numbers :\n");
								int a1 = sc.nextInt();
								int b1 = sc.nextInt();
								cal.add(a1,b1);
								break;
						
						case 3: System.out.println("Enter a number:\n");
								int c1 = sc.nextInt();
								res = cal.add(c1);
								System.out.println("Sum = "+res);
								break;
								
						case 4: System.out.println("Enter 3 numbers :\n");
								int a2 = sc.nextInt();
								int b2 = sc.nextInt();
								int c2 = sc.nextInt();
								res = cal.add(a2,b2,c2);
								System.out.println("Sum = "+res);
								break;
						
						default : System.out.println("This option does not exist!!");
					}
			}
	}
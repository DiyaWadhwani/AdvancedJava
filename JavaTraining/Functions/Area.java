//method types

import java.util.Scanner;
class Area 
	{
		float area = 0.0f;
		Scanner sc = new Scanner(System.in);

		void Circle()
			{
				System.out.println("Enter radius : ");
				float r = sc.nextFloat();
				area = 3.14f*r*r; 
				System.out.println("Area of circle is : "+area);
			}
			
		float Square()
			{
				System.out.println("Enter side length : ");
				float a = sc.nextFloat();
				area = a*a;
				return area;
			}
		
		float Rectangle(float l, float b)
			{
				area=l*b;
				return area;
			}
		
		void Triangle(float b, float h)
			{	
				area = (b*h)/2;
				System.out.println("Area of triangle is : "+area);
			}
	
		public static void main(String[] args)
			{
				Scanner scan = new Scanner(System.in);
				Area ar = new Area();
				float res;
				System.out.println("\nProgram to find area of shapes.\n1-Circle\n2-Square\n3-Rectangle\n4-Triangle\nEnter your choice :");
				int c = scan.nextInt();
				switch(c)
					{
						case 1:	ar.Circle();
								break;
						
						case 2: res=ar.Square();
								System.out.println("Area of square is : "+res);
								break;
						
						case 3:	System.out.println("Enter length and height : ");
								float len = scan.nextFloat();
								float hght = scan.nextFloat();
								res=ar.Rectangle(len,hght);
								System.out.println("Area of rectangle is : "+res);
								break;
						
						case 4: System.out.println("Enter base and height : ");
								float b = scan.nextFloat();
								float h = scan.nextFloat();
								ar.Triangle(b,h);
								break;
						
						default: System.out.println("Entered choice does not exist !!");
					}
			}
	}
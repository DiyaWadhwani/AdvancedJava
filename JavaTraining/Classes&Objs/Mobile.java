//import java.util.Scanner;
public class Mobile
	{
		String brand = "Samsung";
		long modelNo = 7362829l;
		int display = 25;
		float price = 5499.9f;
		
		void enter(String b, float p)
			{
				brand=b;
				price=p;				
				/*Scanner sc = new Scanner(System.in);
				System.out.println("Enter brand : ");
				brand=sc.nextLine();
				System.out.println("Enter price : ");
				price = sc.nextFloat();*/
			}
		
		void display()
			{
				System.out.println("\nBrand : "+brand+"\nModel Number : "+modelNo+"\nDisplay : "+display+"\nPrice : "+price);
			}
	}
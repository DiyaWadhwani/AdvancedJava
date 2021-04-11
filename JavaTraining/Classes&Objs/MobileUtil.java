import java.util.Scanner;
class MobileUtil
	{
		public static void main(String[] args)
			{
				Mobile mob = new Mobile();
				mob.display();
				Scanner sc = new Scanner(System.in);
				System.out.println("\nEnter brand : ");
				String brand=sc.nextLine();
				System.out.println("Enter price : ");
				float price = sc.nextFloat();
				mob.enter(brand,price);
				mob.display();
			}
	}
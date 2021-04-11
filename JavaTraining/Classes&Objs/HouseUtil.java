import java.util.Scanner;
class HouseUtil
	{
		public static void main(String[] args)
			{
				House house = new House();
				Scanner sc = new Scanner(System.in);
				System.out.println("\nProperties of : \n1-Sofa\n2-Door\n3-Window\nEnter your choice :");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:	System.out.println("\nEnter colour and ID in String");
							String a1 = sc.nextLine();
							String b1 = sc.nextLine();
							house.sofa(a1,b1);
							house.display();
							break;
					
					case 2: System.out.println("\nEnter colour and ID in int and long");
							int a2 = sc.nextInt();
							long b2 = sc.nextLong();
							house.door(a2,b2);
							house.display();
							break;
					
					case 3: System.out.println("\nEnter colour and ID in short and String");
							short a3 = sc.nextShort();
							String b3 = sc.nextLine();
							house.window(a3,b3);
							house.display();
							break;
					
					default: System.out.println("This does not exist !!");
				}
			}
	}
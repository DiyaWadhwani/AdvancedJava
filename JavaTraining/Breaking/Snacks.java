// using continue statement

class Snacks
	{
		public static void main(String[] args)
			{	
				String[] snacks = {"Peanuts", "Biscuits", "Chips", "Cake", "Samosa", "Panipuri", "Popcorn"};
				//System.out.println("\nLength of array : "+snacks.length);
				for(int i=0; i<snacks.length; i++)
					{
						if(i<=5)
						{
							System.out.println(snacks[i]);
							i++;
							continue;
						}
						System.out.println(i);
						i++;
					}
			}
	}
//using break statement

class Sports
	{
		public static void main(String[] args)
			{
				String[] sports = {"Cricket", "Football", "Hockey", "Basketball", "Volleyball", "Badminton", "Tennis"};
				for(int i=0; i<sports.length; i++)
					{
						if(i > sports.length/2)
							{
								System.out.println(i);
								break;
							}
						System.out.println(sports[i]);
					}
			}
	}
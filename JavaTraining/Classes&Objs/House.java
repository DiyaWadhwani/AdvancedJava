class House
	{
		//String type;
		char colour;
		int id;
		
		void sofa(String c, String ID)
			{
				//type = t;
				colour = c.charAt(0);
				id = String.ParseInt(ID);
			}
			
		void door(int c, Long ID)
			{
				String col = String.valueOf(c);
				colour = col.charAt(2);
				id = Long.ParseInt(ID);
			}
		
		void window(short ID, String c)
			{
				colour = c.charAt(3);
				id = Short.ParseInt(ID);
			}
		
		void display()
			{
				System.out.println("\nColour : "+colour+"\nID :"+id);
			}
	}
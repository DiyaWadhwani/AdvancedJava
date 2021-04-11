class Table
	{
	 static byte size = 40;
	 int tableID = 23;
	 String color = "Blue";

	void properties()
		{
		 double price = 1573.28;
		 System.out.println("\nProperties of table :");
		 System.out.println("\nStatic Variable - \nSize : " +size);
		 System.out.println("\nInstance Variable - \nTable ID : "+tableID);
		 System.out.println("\nLocal Variable - \nPrice : "+price);
		}
	
	 public static void main(String[] args)
		{
		 Table t = new Table();
		 t.properties();		 
		}
	}
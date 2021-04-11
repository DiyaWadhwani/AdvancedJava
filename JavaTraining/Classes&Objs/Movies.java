public class Movies
	{
		String name;
		String lang;
		float rating;
		float price;
		int screen;
		
		/*Movies()
			{
				name = "ABCD";
				lang = "Hindi";
				rating = 4.2f;
				price = 300.50f;
				screen = 4;
			}*/
			
		public void display()
			{
				System.out.println("\nName : "+name+"\nLanguage : "+lang+"\nRating : "+rating+"\nScreen : "+screen);
			}
	}
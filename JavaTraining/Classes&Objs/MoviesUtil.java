class MoviesUtil
	{
		public static void main(String[] args)
			{
				Movies movie = new Movies();
				movie.name = "ABCD";
				movie.lang = "Hindi";
				movie.rating = 4.2f;
				movie.price = 300.50f;
				movie.screen = 4;
				movie.display();
				
				Movies mov = movie;
				mov.name = "Hello Partner";
				mov.rating = 4.0f;
				mov.screen = 2;
				mov.display();
			}
	}
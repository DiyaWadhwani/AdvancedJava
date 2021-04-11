class JewelleryUtil
	{
		public static void main(String[] args)
			{	
				Jewellery jewels = new Jewellery();
				jewels.display();
				jewels.type = "Ring";
				jewels.price = 2348.95f;
				jewels.gem = "Sapphire";
				jewels.grams = 7;
				jewels.display();
			}
	}
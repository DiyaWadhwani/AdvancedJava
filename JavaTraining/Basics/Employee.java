class Employee
	{
	 
	 //instance vars
	 short id[] = {001,002,003};
	 String name[] = {"A", "B", "C"};
	 long contactNo[] = new long[3];
	 char gender[] = {'M','F','M'};

	 //static vars
	 static int zipCode[] = new int[3];
	 static String collegeName[] = {"MSRIT", "BMSCE", "Jain"};

	 void display()
		{
		 //local vars
		 String emailID[] = new String[3];
		 String address[] = new String[2];
		 boolean maritalStat[] = {false,true,true};
		 String dateOfBirth[] = new String[3];

		 System.out.println("\nName of Employee "+id[2]+" : "+name[2]);
		 System.out.println("\nCollege of Employee "+id[1]+" : "+collegeName[1]);
		 System.out.println("\nMarital Status of Employee "+id[0]+" : "+maritalStat[0]);
		 System.out.println("\nGender of Employee "+id[0]+" : "+gender[0]);	
		 
		}
	 public static void main(String[] args)
		{
		 Employee e = new Employee();
		 e.display();
		}
	}
	
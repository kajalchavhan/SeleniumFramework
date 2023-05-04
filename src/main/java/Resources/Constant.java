package Resources;

import java.util.ArrayList;

public class Constant {

	public static String username="kajal";
	public static String password="kajal@1234";
	
	public static String loginExpectedMessage="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	public static String FirstName="kajal";
	public static String LastName="Chavhan";
	
	
	
		  public static String path = "F:\\data chale.xlsx";
		  public static String coluser = "5";
		  public static String colpass = "6";
		  public static String sheet = "0";
		  public static String datasheet = "Data should be invalid";

		public ArrayList<ArrayList<String>> userpass() {
		    ArrayList<String> name1 = new ArrayList<String>(); // here name1 is only declared under userpass().no connection
		                              // between them.
		    ArrayList<String> pass = new ArrayList<String>();
		    
		    name1.add("vinay");
		    name1.add("virat");
		    name1.add("sairat");
		    name1.add("balma");
		    name1.add("sajninakhrewali");

		    pass.add("vinay@123");
		    pass.add("virat@123");
		    pass.add("sairat@123");
		    pass.add("balma@420");
		    pass.add("sajninakhrewali@123");

		    ArrayList<ArrayList<String>> userpass = new ArrayList<ArrayList<String>>(); // name1 and pass got connected with
		                                          // this object
		    userpass.add(name1);
		    userpass.add(pass);
		    return userpass;
		  }

		

		public Constant(ArrayList<String> name1,ArrayList<String> pass) {
		      
		    name1.add("vinay");
		    name1.add("virat");
		    name1.add("sairat");
		    name1.add("balma");
		    name1.add("sajninakhrewali");

		    pass.add("vinay@123");
		    pass.add("virat@123");
		    pass.add("sairat@123");
		    pass.add("balma@420");
		    pass.add("sajninakhrewali@123");
		    
		   }



		public Constant() {
			// TODO Auto-generated constructor stub
		}

		  }
	


package inheritancehomeassignment;



public class Password extends Username {
	
	
	public void password ()
	{
		System.out.println("Enter the password");
	}
	
	
		public static void main(String[] args) {
			
		Password PW = new Password();
		PW.password();
		PW.username();
		PW.enterCredentials();
		PW.navigateToHomePage();
		
		}
	
	

}


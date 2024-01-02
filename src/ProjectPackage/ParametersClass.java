package ProjectPackage;

public class ParametersClass {
	
static String MainURL = "https://automationteststore.com/";

	
	static String[] firstNames = {"hmood", "ali", "waleed", "ziad","khaled","karam"};
	
	static String[] lastNames = {"hasan", "abazeed", "alsaqa", "alnajar"};
	static int firstIndex = (int)(Math.random() * firstNames.length); 
	static int lasttIndex = (int)(Math.random() * lastNames.length); 
	static int randomNumber = (int) (Math.random() * 999) + 1;
	
	static String firstName=firstNames[firstIndex];
	
	static String lastName=lastNames[lasttIndex];
	

	static String Email = firstName+lastName+randomNumber+"@gmail.com";
	static String Address="aLmadinah Street";
	static String City="Amman";
	static String Postcode="123456";
	static String LoginName = firstName+lastName+randomNumber;
	

	static String Password = firstName+lastName+randomNumber+"@";
	static String newPassword = firstName+lastName+randomNumber+"@"+"*";
	
	static String registerMsg = "YOUR ACCOUNT HAS BEEN CREATED!"; 
	static String WlcomeMsg="Welcome back "+firstName;


	static String ChangePassMsg="×\r\n"+ "Success: Your password has been successfully updated.";
	
	static String tranMSG="You have no transactions recorded on your account!";

}

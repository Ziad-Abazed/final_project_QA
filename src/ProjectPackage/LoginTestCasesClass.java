package ProjectPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTestCasesClass extends ParametersClass {
	
	WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion=new SoftAssert();

	
	@BeforeTest
	public void Setup() throws InterruptedException {
		driver.get(MainURL);
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a"));
		
		createAccount.click();
		
		Thread.sleep(3000);
		
       
		
		
	}

	
	@Test()
	public void Login()  throws InterruptedException{
		
		
		WebElement LoginNameField= driver.findElement(By.id("loginFrm_loginname"));
		
		WebElement passwordField = driver.findElement(By.id("loginFrm_password"));
		WebElement LoginButton=driver.findElement(By.cssSelector("button[title='Login']"));
		System.out.println(LoginName);
		
		System.out.println(Password);
		LoginNameField.sendKeys(LoginName);
		passwordField.sendKeys(Password);
		LoginButton.click();
		
		Thread.sleep(4000);
		String ActualMsg = driver.findElement(By.className("menu_text")).getText();
		
		myAssertion.assertEquals(ActualMsg,WlcomeMsg);
		myAssertion.assertAll();
		
		Thread.sleep(1000);

		
	}
	
	
	@Test()
	public void changePass() throws InterruptedException {
		
		WebElement ChangePaswoed=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
		ChangePaswoed.click();
		
		Thread.sleep(1000);
		WebElement currentPasswordField = driver.findElement(By.id("PasswordFrm_current_password"));
		WebElement NewPasswordField = driver.findElement(By.id("PasswordFrm_password"));
		WebElement ConPasswordField = driver.findElement(By.id("PasswordFrm_confirm"));
		WebElement ChangeButton=driver.findElement(By.className("pull-right"));
	
		currentPasswordField.sendKeys(Password);
		NewPasswordField.sendKeys(newPassword);
		ConPasswordField.sendKeys(newPassword);
		ChangeButton.click();
		
		
		Thread.sleep(1000);
		boolean ActualMsg = driver.findElement(By.className("alert-success")).isDisplayed();
		
		myAssertion.assertEquals(ActualMsg,true);
		myAssertion.assertAll();
		
		
		

		
	}

	@AfterTest

	public void PostTest() {
      //driver.close();
	}

}

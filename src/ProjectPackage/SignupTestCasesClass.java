package ProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;

public class SignupTestCasesClass extends ParametersClass {
	
	
	WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion=new SoftAssert();

	
	@BeforeTest
	public void Setup() throws InterruptedException {
		driver.get(MainURL);
		driver.manage().window().maximize();
		
		WebElement logintoAccount = driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a"));
		
		logintoAccount.click();
		
		Thread.sleep(3000);
		 WebElement ContinueBTN = driver.findElement(By.cssSelector("button[title='Continue']"));
			
	        ContinueBTN.click();

	        Thread.sleep(3000);
		
       
		
		
	}

	
	@Test()
	public void SignUp()  throws InterruptedException{
		
		
		WebElement firstnameField = driver.findElement(By.id("AccountFrm_firstname"));
		WebElement lastnameField = driver.findElement(By.id("AccountFrm_lastname"));
		WebElement emailField= driver.findElement(By.id("AccountFrm_email"));
		WebElement AddressField=driver.findElement(By.id("AccountFrm_address_1"));
		WebElement CityField=driver.findElement(By.id("AccountFrm_city"));
		WebElement PostcodeField=driver.findElement(By.id("AccountFrm_postcode"));
		WebElement LoginNameField=driver.findElement(By.id("AccountFrm_loginname"));
		
		
		WebElement passwordField = driver.findElement(By.id("AccountFrm_password"));
		WebElement passwordconfField = driver.findElement(By.id("AccountFrm_confirm"));
		WebElement newslettercheck = driver.findElement(By.id("AccountFrm_newsletter1"));
		WebElement AgreeCheck = driver.findElement(By.id("AccountFrm_agree"));


		
		WebElement SignupButton=driver.findElement(By.cssSelector("button[title='Continue']"));
		
		Select drpCountry = new Select(driver.findElement(By.id("AccountFrm_country_id")));
		Select drpState = new Select(driver.findElement(By.id("AccountFrm_zone_id")));
		
		firstnameField.sendKeys(firstName);
		lastnameField.sendKeys(lastName);
		emailField.sendKeys(Email);
		AddressField.sendKeys(Address);
		CityField.sendKeys(City);
		PostcodeField.sendKeys(Postcode);
		LoginNameField.sendKeys(LoginName);
		drpCountry.selectByVisibleText("Jordan");
		Thread.sleep(1000);
		drpState.selectByValue("1704");
		passwordField.sendKeys(Password);
		passwordconfField.sendKeys(Password);
		newslettercheck.click();
		AgreeCheck.click();
		
		SignupButton.click();
		
		Thread.sleep(4000);
		String ActualMsg = driver.findElement(By.className("maintext")).getText();
		myAssertion.assertEquals(ActualMsg,registerMsg);
		myAssertion.assertAll();

		
	}

	@AfterTest

	public void PostTest() {
      //driver.close();
	}


}

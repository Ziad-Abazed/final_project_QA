package ProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TransClass   extends ParametersClass{
	
	
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
	public void TransactionTest()throws InterruptedException {
		
	WebElement LoginNameField= driver.findElement(By.id("loginFrm_loginname"));
		
		WebElement passwordField = driver.findElement(By.id("loginFrm_password"));
		WebElement LoginButton=driver.findElement(By.cssSelector("button[title='Login']"));
		System.out.println(LoginName);
		
		System.out.println(Password);
		LoginNameField.sendKeys(LoginName);
		passwordField.sendKeys(newPassword);
		LoginButton.click();
		
		Thread.sleep(4000);
		
		WebElement ProductsTab=driver.findElement(By.cssSelector("a[href='https://automationteststore.com/index.php?rt=product/category&path=68']"));
		
		ProductsTab.click();
		
		WebElement TshirtCategory=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(2) > a:nth-child(1)"));
		
		TshirtCategory.click();
		
		WebElement TshirtProduct=driver.findElement(By.cssSelector("div[class='thumbnails grid row list-inline'] div:nth-child(3) div:nth-child(2) a:nth-child(1) img:nth-child(1)"));
		
		TshirtProduct.click();
		
		WebElement AddToCartBtn=driver.findElement(By.cssSelector(".cart"));
		
		AddToCartBtn.click();
		
		WebElement CheckoutBtn=driver.findElement(By.id("cart_checkout2"));
		
		CheckoutBtn.click();
		
        WebElement ConfirmBtn=driver.findElement(By.id("checkout_btn"));
		
        ConfirmBtn.click();
         
        Thread.sleep(1000);
        
        WebElement ProfileBtn=driver.findElement(By.cssSelector("ul[id='main_menu_top'] a[class='top menu_account'] span[class='menu_text']"));
		
        ProfileBtn.click();
        
        WebElement TransactionhistoryBtn=driver.findElement(By.cssSelector("ul[class='nav-dash'] a[title='Transaction history']"));
		
        TransactionhistoryBtn.click();
        
        WebElement TransactionhistoryMsg=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));
        myAssertion.assertEquals(tranMSG, TransactionhistoryMsg);
		
		
		
		
		
		
		
		
	}
	
	
	
	@AfterTest

	public void PostTest() {
      //driver.close();
	}


}

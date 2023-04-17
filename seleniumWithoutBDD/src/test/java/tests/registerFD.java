package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import PageObjects.RegisterPageFD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static PageObjects.RegisterPageFD.START_PAGE_URL_FD;



public class registerFD extends BaseTest {

	Faker faker = new Faker();
	
	
    @Test(groups = "Chrome")
    public void Register_Chrome() throws InterruptedException {
    	String number = faker.number().digits(12);
    	String email = faker.name().firstName();
    	String username = faker.name().lastName();
        RegisterPageFD registerPageFD = new RegisterPageFD(driver);
        
        driver.get(START_PAGE_URL_FD);
        registerPageFD.btnMpc().click();
        registerPageFD.btnSignUp().click();
        registerPageFD.frmSignUpNo().sendKeys("9"+number,Keys.ENTER);
        
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"jsx-3676245989\"]")));
        String Numb = driver.findElement(By.xpath("//p[@class=\"jsx-3676245989\"]")).getText();
        AssertJUnit.assertEquals(Numb, "+9"+number);
        
        registerPageFD.frmCodeSignup().sendKeys("111111",Keys.ENTER);
        registerPageFD.frmEmail().sendKeys(email+"test2502@yopmail.com");
        registerPageFD.frmUsername().sendKeys(username+"test2502");
        registerPageFD.frmPassword().sendKeys("test123");
        registerPageFD.btnSubmit().click();
        
        String Fusername = driver.findElement(By.cssSelector(".name-wrapper")).getText();
        AssertJUnit.assertEquals(Fusername, username+"test2502");
        driver.findElement(By.cssSelector(".name-wrapper")).click();
        String Femail = driver.findElement(By.cssSelector("p.email")).getText();
        AssertJUnit.assertEquals(Femail,email+"test2502@yopmail.com");
        String URL = driver.getCurrentUrl();
        AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }
    
    @Test(groups = "Chrome")
    public void Register_IncorrectNumber() throws InterruptedException {
    	
        RegisterPageFD registerPageFD = new RegisterPageFD(driver);
        
        driver.get(START_PAGE_URL_FD);
        registerPageFD.btnMpc().click();
        registerPageFD.btnSignUp().click();
        registerPageFD.frmSignUpNo().sendKeys("asadad",Keys.ENTER);
        
        String error = driver.findElement(By.cssSelector("p.jsx-3320856539.desktop-taste-input-text-warning")).getText();
        AssertJUnit.assertEquals(error, "Please enter your correct phone number");
    }
    
    @Test(groups = "Chrome")
    public void Register_IncorrectCode() throws InterruptedException {
    	String number = faker.number().digits(12);
        RegisterPageFD registerPageFD = new RegisterPageFD(driver);
        
        driver.get(START_PAGE_URL_FD);
        registerPageFD.btnMpc().click();
        registerPageFD.btnSignUp().click();
        registerPageFD.frmSignUpNo().sendKeys("9"+number,Keys.ENTER);
        
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"jsx-3676245989\"]")));
        String Numb = driver.findElement(By.xpath("//p[@class=\"jsx-3676245989\"]")).getText();
        AssertJUnit.assertEquals(Numb, "+9"+number);
        
        registerPageFD.frmCodeSignup().sendKeys("968969",Keys.ENTER);
        String error = driver.findElement(By.cssSelector("p.jsx-1408631272.message-resend")).getText();
        AssertJUnit.assertEquals(error, "You entered invalid code");
    }
    
	@Test(groups = "Firefox")
    public void Login_Firefox()  throws Exception  {
		String number = faker.number().digits(12);
		String email = faker.name().firstName();
		String username = faker.name().lastName();
		RegisterPageFD registerPageFD = new RegisterPageFD(driverFirefox);
        
		driverFirefox.get(START_PAGE_URL_FD);
        registerPageFD.btnMpc().click();
        registerPageFD.btnSignUp().click();
        registerPageFD.frmSignUpNo().sendKeys("9"+number,Keys.ENTER);
        
        getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"jsx-3676245989\"]")));
        String Numb = driverFirefox.findElement(By.xpath("//p[@class=\"jsx-3676245989\"]")).getText();
        AssertJUnit.assertEquals(Numb, "+9"+number);
        
        registerPageFD.frmCodeSignup().sendKeys("111111",Keys.ENTER);
        getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.id("id_field_email")));
        registerPageFD.frmEmail().sendKeys(email+"test2502@yopmail.com");
        registerPageFD.frmUsername().sendKeys(username+"test2502");
        registerPageFD.frmPassword().sendKeys("test123");
        registerPageFD.btnSubmit().click();
        
        getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
        String Fusername = driverFirefox.findElement(By.cssSelector(".name-wrapper")).getText();
        AssertJUnit.assertEquals(Fusername, username+"test2502");
        driverFirefox.findElement(By.cssSelector(".name-wrapper")).click();
        String Femail = driverFirefox.findElement(By.cssSelector("p.email")).getText();
        AssertJUnit.assertEquals(Femail,email+"test2502@yopmail.com");
        String URL = driverFirefox.getCurrentUrl();
        AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
	}
	 @Test(groups = "Firefox")
	    public void Register_IncorrectNumberF() throws InterruptedException {
	    
	        RegisterPageFD registerPageFD = new RegisterPageFD(driver);
	        
	        driverFirefox.get(START_PAGE_URL_FD);
	        registerPageFD.btnMpc().click();
	        registerPageFD.btnSignUp().click();
	        registerPageFD.frmSignUpNo().sendKeys("asadad",Keys.ENTER);
	        
	        String error = driverFirefox.findElement(By.cssSelector("p.jsx-3320856539.desktop-taste-input-text-warning")).getText();
	        AssertJUnit.assertEquals(error, "Please enter your correct phone number");
	    }
	   @Test(groups = "Firefox")
	    public void Register_IncorrectCodeF() throws InterruptedException {
	    	String number = faker.number().digits(12);
	        RegisterPageFD registerPageFD = new RegisterPageFD(driver);
	        
	        driver.get(START_PAGE_URL_FD);
	        registerPageFD.btnMpc().click();
	        registerPageFD.btnSignUp().click();
	        registerPageFD.frmSignUpNo().sendKeys("9"+number,Keys.ENTER);
	        
	        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"jsx-3676245989\"]")));
	        String Numb = driver.findElement(By.xpath("//p[@class=\"jsx-3676245989\"]")).getText();
	        AssertJUnit.assertEquals(Numb, "+9"+number);
	        
	        registerPageFD.frmCodeSignup().sendKeys("968969",Keys.ENTER);
	        String error = driverFirefox.findElement(By.cssSelector("p.jsx-1408631272.message-resend")).getText();
	        AssertJUnit.assertEquals(error, "You entered invalid code");
	    }
}

package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import PageObjects.LoginPageFD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import static PageObjects.LoginPageFD.START_PAGE_URL_FD;

public class loginFD extends BaseTest { 
    
	@Test(groups = "Chrome")
    public void Login_Email() throws InterruptedException {
		LoginPageFD loginPageFD = new LoginPageFD(driver);
		    
        driver.get(START_PAGE_URL_FD);
        loginPageFD.btnMpc().click();
        loginPageFD.inputLogin().sendKeys("noverio_rio@yahoo.com",Keys.ENTER);
        loginPageFD.inputPass().sendKeys("Kargo123.");
        loginPageFD.btnLogin().click();
       
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
        String username = driver.findElement(By.cssSelector(".name-wrapper")).getText();
        AssertJUnit.assertEquals(username, "aldimanx");
        String URL = driver.getCurrentUrl();
        AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }
    
    @Test(groups = "Chrome")
    public void Login_phoneNumber() throws InterruptedException {
		LoginPageFD loginPageFD = new LoginPageFD(driver);
		 
        driver.get(START_PAGE_URL_FD);
        loginPageFD.btnMpc().click();
        loginPageFD.inputLogin().sendKeys("089513138022",Keys.ENTER);
        loginPageFD.frmCodeLogin().sendKeys("111111",Keys.ENTER);
       
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
        String username = driver.findElement(By.cssSelector(".name-wrapper")).getText();
        AssertJUnit.assertEquals(username, "aldimanx");
        String URL = driver.getCurrentUrl();
        AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }

    @Test(groups = "Chrome")
    public void Login_Username() throws InterruptedException {
		LoginPageFD loginPageFD = new LoginPageFD(driver);
		 
        driver.get(START_PAGE_URL_FD);
        loginPageFD.btnMpc().click();
        loginPageFD.inputLogin().sendKeys("aldimanx",Keys.ENTER);
        loginPageFD.inputPass().sendKeys("Kargo123.");
        loginPageFD.btnLogin().click();
       
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
        String username = driver.findElement(By.cssSelector(".name-wrapper")).getText();
        AssertJUnit.assertEquals(username, "aldimanx");
        String URL = driver.getCurrentUrl();
        AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }
    
    @Test(groups = "Chrome")
    public void Login_Incorrect() throws InterruptedException {
		LoginPageFD loginPageFD = new LoginPageFD(driver);
		 
        driver.get(START_PAGE_URL_FD);
        loginPageFD.btnMpc().click();
        loginPageFD.inputLogin().sendKeys("11",Keys.ENTER);
       
        getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.jsx-3320856539.desktop-taste-input-text-warning")));
        String error = driver.findElement(By.cssSelector("p.jsx-3320856539.desktop-taste-input-text-warning")).getText();
        AssertJUnit.assertEquals(error, "Please enter your correct email address or username or phone number");
    }
    
    @Test(groups = "Firefox")
    public void Login_emailF() throws InterruptedException {
    	 LoginPageFD loginPageFDF = new LoginPageFD(driverFirefox);
    	
    	 driverFirefox.get(START_PAGE_URL_FD);
         loginPageFDF.btnMpc().click();
         loginPageFDF.inputLogin().sendKeys("noverio_rio@yahoo.com",Keys.ENTER);
         loginPageFDF.inputPass().sendKeys("Kargo123.");
         loginPageFDF.btnLogin().click();
         
         getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
         String username = driverFirefox.findElement(By.cssSelector(".name-wrapper")).getText();
         AssertJUnit.assertEquals(username, "aldimanx");
         String URL = driverFirefox.getCurrentUrl();
         AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }
    
    @Test(groups = "Firefox")
    public void Login_phoneNumberF() throws InterruptedException {
    	 LoginPageFD loginPageFDF = new LoginPageFD(driverFirefox);

    	 driverFirefox.get(START_PAGE_URL_FD);
         loginPageFDF.btnMpc().click();
         loginPageFDF.inputLogin().sendKeys("089513138022",Keys.ENTER);
         loginPageFDF.frmCodeLogin().sendKeys("111111",Keys.ENTER);
         
         getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
         String username = driverFirefox.findElement(By.cssSelector(".name-wrapper")).getText();
         AssertJUnit.assertEquals(username, "aldimanx");
         String URL = driverFirefox.getCurrentUrl();
         AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }
    @Test(groups = "Firefox")
    public void Login_UsernameF() throws InterruptedException {
    	 LoginPageFD loginPageFDF = new LoginPageFD(driverFirefox);
    	
    	 driverFirefox.get(START_PAGE_URL_FD);
         loginPageFDF.btnMpc().click();
         loginPageFDF.inputLogin().sendKeys("aldimanx",Keys.ENTER);
         loginPageFDF.inputPass().sendKeys("Kargo123.");
         loginPageFDF.btnLogin().click();
         
         getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name-wrapper")));
         String username = driverFirefox.findElement(By.cssSelector(".name-wrapper")).getText();
         AssertJUnit.assertEquals(username, "aldimanx");
         String URL = driverFirefox.getCurrentUrl();
         AssertJUnit.assertEquals(URL, "https://femaledaily.net/" );
    }
    
    @Test(groups = "Firefox")
    public void Login_incorrectF() throws InterruptedException {
    	 LoginPageFD loginPageFDF = new LoginPageFD(driverFirefox);
    	
    	 driverFirefox.get(START_PAGE_URL_FD);
         loginPageFDF.btnMpc().click();
         loginPageFDF.inputLogin().sendKeys("11",Keys.ENTER);
        
         getWait(driverFirefox).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.jsx-3320856539.desktop-taste-input-text-warning")));
         String error = driverFirefox.findElement(By.cssSelector("p.jsx-3320856539.desktop-taste-input-text-warning")).getText();
         AssertJUnit.assertEquals(error, "Please enter your correct email address or username or phone number");
    }
}

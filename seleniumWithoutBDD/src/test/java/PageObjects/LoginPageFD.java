package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageFD {

 public LoginPageFD(ChromeDriver driver){

     PageFactory.initElements(driver , this);
 }
   
 public LoginPageFD(FirefoxDriver driverFirefox) {
	 PageFactory.initElements(driverFirefox, this);
 }
    public static final String START_PAGE_URL_FD = "https://account-dev.femaledaily.net/";

   
    @FindBy(id ="id_field_login")
    WebElement getFieldLogin;
    
    @FindBy(id= "id_btn_login")
    WebElement getBtnLogin;

    @FindBy(id= "btnSSOLoginOrRegisterCloseMPC")
    WebElement getBtnMpc;

    @FindBy (id= "id_field_pass")
    WebElement getFieldPass;
    
    @FindBy (id= "id_code_login")
    WebElement getFrmCode;
    
    public WebElement frmCodeLogin() {
    	return getFrmCode;
    }
    public WebElement inputLogin() {
    	return getFieldLogin;
    }
    
    public WebElement btnMpc() {
    	return getBtnMpc;
    }
    
    public WebElement btnLogin() {
    	return getBtnLogin;
    }
    public WebElement inputPass() {
    	return getFieldPass;
    }
}

   
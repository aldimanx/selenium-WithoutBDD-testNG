package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageFD {

	 public RegisterPageFD(ChromeDriver driver){

	     PageFactory.initElements(driver , this);
	 }
	   
	 public RegisterPageFD(FirefoxDriver driverFirefox) {
		 PageFactory.initElements(driverFirefox, this);
	 }
	 
	  public static final String START_PAGE_URL_FD = "https://account-dev.femaledaily.net/";

	   
	    @FindBy(id ="id_btn1_signup")
	    WebElement getBtnSignup;
	    
	    @FindBy(id= "id_field_signup")
	    WebElement getFrmSignUpNo;

	    @FindBy(id= "id_btn2_signup")
	    WebElement getBtnSignUp2;

	    @FindBy (id= "id_code_signup")
	    WebElement getFrmCodeSignup;
	    
	    @FindBy (id= "id_confirm_signup")
	    WebElement getbBtnConfirmSignup;
	    
	    @FindBy(id= "id_field_email")
	    WebElement getFrmEmail;

	    @FindBy(id= "id_field_username")
	    WebElement getFrmUsername;

	    @FindBy (id= "id_field_password")
	    WebElement getFrmPassword;
	    
	    @FindBy (id= "id_btn_submit")
	    WebElement getBtnSubmit;
	    
	    @FindBy(id= "btnSSOLoginOrRegisterCloseMPC")
	    WebElement getBtnMpc;
	    
	    public WebElement btnMpc() {
	    	return getBtnMpc;
	    }
	    public WebElement btnSignUp() {
	    	return getBtnSignup;
	    }
	    
	    public WebElement frmSignUpNo() {
	    	return getFrmSignUpNo;
	    }
	    
	    public WebElement btnSignup2() {
	    	return getBtnSignUp2;
	    }
	    
	    public WebElement frmCodeSignup() {
	    	return getFrmCodeSignup;
	    }
	    
	    public WebElement btnConfirmSignup() {
	    	return getbBtnConfirmSignup;
	    }   
	    
	    public WebElement frmEmail() {
	    	return getFrmEmail;
	    }
	    
	    public WebElement frmUsername() {
	    	return getFrmUsername;
	    }
	    
	    public WebElement frmPassword() {
	    	return getFrmPassword;
	    }
	    
	    public WebElement btnSubmit() {
	    	return getBtnSubmit;
	    }
	    
	    
	}



package tests;

import driver.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected ChromeDriver driver = null;
    protected FirefoxDriver driverFirefox = null;

    @BeforeMethod(onlyForGroups = {"Chrome"})
    public void beforeMethodWithLogin() {
        driver = DriverConfig.getChromeDriverForChrome();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @BeforeMethod(onlyForGroups = {"Firefox"})
    public void beforeMethodWithoutLogin1() {
        driverFirefox = DriverConfig.getFirefoxDriverForFirefox();

    }

    @BeforeMethod(onlyForGroups = {"Mobile"})
    public void beforeMethodWithoutLogin() {
        driver = DriverConfig.getChromedriverForMobile();

    }


    @AfterMethod(onlyForGroups = {"Chrome"})
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

    }
    
    protected boolean isElementPresent(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
    
    @AfterMethod(onlyForGroups = {"Firefox"})
    public void aftermethod() {
        if (driverFirefox != null) {
            driverFirefox.quit();
        }
    }
    
    protected FluentWait<FirefoxDriver> getWait(FirefoxDriver driverFirefox){
        return new FluentWait<>(driverFirefox).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }

    protected boolean isElementPresentFirefox(By locator){
        try{
            driverFirefox.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }


}

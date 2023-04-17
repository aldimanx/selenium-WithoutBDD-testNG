package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverConfig {
    public static ChromeDriver getChromeDriverForChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(chromeOptions);
    }

    public static FirefoxDriver getFirefoxDriverForFirefox(){
    	WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new FirefoxDriver(firefoxOptions);
    }  
    
    public static ChromeDriver getChromedriverForMobile(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, String> map = new HashMap<>();
        map.put("deviceName", "iPhone 12 Pro");
        chromeOptions.setExperimentalOption("mobileEmulation", map);
        return new ChromeDriver(chromeOptions);
    }

}

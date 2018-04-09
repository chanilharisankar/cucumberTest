package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

    public WebDriver driver ;
    public DesiredCapabilities capabilities;
    public FirefoxOptions firefoxOptions;


    public Driver(String browser){


        if(browser.equalsIgnoreCase("firefox")){
            SystemSetProperty.firefox();
            this.setCapabilitiesFirefox();
            driver = new FirefoxDriver(firefoxOptions);
        }else if(browser.equalsIgnoreCase("chrome")){
            SystemSetProperty.chrome();
            this.setCapabilitiesChrome();
            driver = new ChromeDriver();
        }else{
            System.out.println("invalid browser selection");
        }


    }


    public void setCapabilitiesFirefox(){
        firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
    }
    public void setCapabilitiesChrome() {
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
    }

    public WebDriver getDriver() {
        return driver;
    }





}

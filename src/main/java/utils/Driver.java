package utils;

import gherkin.formatter.Reporter;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Driver {

    public  static WebDriver driver;
    public static CommonUtils objctils;
    private Logger logger = Logger.getLogger(this.getClass());

    //initialise a instance of required browser
    public void initializeBrowser() throws Exception {
        if(driver==null)
        {
            driver= DriverFactory.getDriver();
            driver.manage().window().maximize();

        }
        else {
            System.out.println("Browser Already Launched");

        }
    }

    //close the driver instance
    public WebDriver closeDriver() throws Exception {
        DriverFactory.closeDriver(driver);
        return driver=null;
    }
}

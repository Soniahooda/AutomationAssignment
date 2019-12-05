package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver getDriver() throws Exception {
        ReadProperties.readProperties();
        String Browser = ReadProperties.Browser;
        switch (Browser) {
            case "IE":
                System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
                return new InternetExplorerDriver();
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
                return new ChromeDriver();
            default:
                System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
                return new FirefoxDriver();
        }
    }

    public static void closeDriver(WebDriver driver) throws Exception {
        ReadProperties.readProperties();
        String Browser = ReadProperties.Browser;
        try {
            switch (Browser) {
                case "IE":
                    driver.close();
                case "Chrome":
                    driver.close();
                default:
                    driver.close();
            }
            System.out.println("------------Driver closed successfully------------");
        }
        catch (Exception e) {
            e.getStackTrace();
        }}
        }

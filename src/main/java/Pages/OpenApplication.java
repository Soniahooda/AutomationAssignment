package Pages;

import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;
import utils.ReadProperties;

import java.util.concurrent.TimeUnit;

public class OpenApplication extends Driver {

    public  OpenApplication()
    {
        objctils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    public OpenApplication openURL() throws Exception {
        ReadProperties.readProperties();
        String Browser = ReadProperties.Browser;
        String URL = ReadProperties.URL;
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return (new OpenApplication());

    }
}


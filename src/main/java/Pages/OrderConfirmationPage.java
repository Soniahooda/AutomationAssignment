package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class OrderConfirmationPage extends Driver {

    @FindBy(xpath = "/a[@title='Back to orders']")
    WebElement linkbacktoorder;


    public OrderConfirmationPage()
    {
        objctils = new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //click on back to order
    public void ClickBackToOrder()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", linkbacktoorder);
    }
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class PayementPage extends Driver {

    @FindBy(xpath = "//a[@title = 'Pay by check.']")
    WebElement paybycheckbtn;

    public PayementPage()
    {
        objctils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //click on pay by check
    public void clickPayByCheck()
    {
        objctils.clickElement(paybycheckbtn);
    }
}

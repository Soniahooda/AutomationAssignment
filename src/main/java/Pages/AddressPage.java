package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class AddressPage extends Driver {

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']/span[1]")
    WebElement btnproceedtocheckout;

    public AddressPage()
    {
        objctils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //click on proceed to checkout
    public void clickProceedBtn()
    {
        objctils.clickElement(btnproceedtocheckout);
    }
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class CartSummaryPage extends Driver {

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']/a[1]")
    WebElement btnproceedtocheckout;

    public  CartSummaryPage()
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

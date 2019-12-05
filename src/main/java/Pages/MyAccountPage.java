package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class MyAccountPage  extends Driver {

    @FindBy(xpath = "//span[contains(text(),'My account')]")
    WebElement myaccountbreadcrumb;

    public MyAccountPage()
    {
        objctils = new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //verify presence of My account breadcrumb
    public void verifyMyAccountBreadCrumb()
    {
        myaccountbreadcrumb.isDisplayed();

    }

}

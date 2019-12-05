package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class AuthenticationPage extends Driver {
    @FindBy(xpath = "//input[@id='email']")
    WebElement txtemailadd;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement btnsignin;


    public AuthenticationPage()
    {
        objctils = new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //enter email address
    public void enterEmailAdd(String email)
    {
        objctils.enterText(txtemailadd,email);
    }

    //enter Password
    public void enterPassword(String password)
    {
        objctils.enterText(txtpassword,password);

    }

    //click on Sign In Button
    public void clickSignInBtn()
    {
        objctils.clickElement(btnsignin);

    }
}

package Pages;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

import java.util.WeakHashMap;

public class PersonalInfoPage extends Driver {

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement txtfirstname;

    @FindBy(xpath = "//input[@id='old_passwd']")
    WebElement txtoldpassword;

@FindBy(xpath = "//button[@name='submitIdentity']")
WebElement btnsave;

    public PersonalInfoPage()
    {
        objctils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }
public static String fname;
    //enter details
    public void enterDetails(String fname, String password)
    {
        objctils.enterText(txtfirstname,fname);
       fname= txtfirstname.getAttribute("value");
        objctils.enterText(txtoldpassword,password);

    }

    //click on Save button
    public void clickSave()
    {
        objctils.clickElement(btnsave);
    }
}

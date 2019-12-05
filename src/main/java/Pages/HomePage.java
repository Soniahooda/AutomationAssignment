package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class HomePage extends Driver {

    @FindBy(xpath = "//a[@class='login'][contains(text(),'Sign in')]")
    WebElement linksignin;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul[1]/li[3]")
    WebElement menutshirt;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement tshirtimage;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement btnaddcart;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement btnproceedtocheckout;

    @FindBy(xpath = "//a[@title='My orders']")
    WebElement linkmyorders;
    @FindBy(xpath = "//a[@title= 'Manage my personal information']")
    WebElement linkmypersonalinfo;

    @FindBy(xpath = "//a[@title= 'View my customer account']/span[1]")
    WebElement username;


    public  HomePage()
    {
        objctils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }
//click on my personal info link
    public void clickMyPersonalInfo()

    {

        objctils.clickElement(linkmypersonalinfo);
    }

    //verify updated first name
    public void verifyFirstName()
    {
        if(username.getText().contains("Tester"))
        {
            System.out.println("First Name Updated Successfully");
        }
        else
        {
            Assert.fail();
        }
    }

    //click on proceed to checkout
    public void clickProceedToCheckout()
    {
        objctils.clickElement(btnproceedtocheckout);
    }
    //click on Sign in Link from Header Menu
    public  void clickSignInFromMenu()
    {
        objctils.clickElement(linksignin);
    }

    String actualURL = "http://automationpractice.com/index.php";

    //verify home page url
    public void verifyURL() throws InterruptedException {
        linksignin.isDisplayed();
        String expURL = driver.getCurrentUrl();
        Assert.assertEquals(expURL,actualURL);
    }

    //click on T-shirt option
    public void clickTshirtMenu()
    {
        objctils.clickElement(menutshirt);
    }

    //click on add to cart
    public  void clickAddToCart()
    {
        Actions ac= new Actions(driver);
        ac.moveToElement(tshirtimage).perform();
        ac.click(btnaddcart).perform();
    }

    //click on my order link
    public void clickMyOrder()
    {
        objctils.clickElement(linkmyorders);
    }

}

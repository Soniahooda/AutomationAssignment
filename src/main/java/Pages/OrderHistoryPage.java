package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class OrderHistoryPage extends Driver {


    public OrderHistoryPage()
    {
        objctils = new CommonUtils();
        PageFactory.initElements(driver,this);
    }
    static  int ordercount=0;
    static int Newordercount;


    //get order count on order history table
    public void GetOrderCount() {
        if (ordercount == 0) {
            int row = driver.findElements(By.xpath("//table[@id='order-list']/tbody/tr")).size();
            ordercount = row;
        }
        else{
            int row = driver.findElements(By.xpath("//table[@id='order-list']/tbody/tr")).size();
            Newordercount = row;

        }
    }

    //verify new order
    public void verifyOrder()
    {
       if(Newordercount==(ordercount+1))
       {
           System.out.println("Order is placed Successfully");
       }
       else {
           System.out.println("Order is not placed Successfully");
           Assert.fail();
       }
    }
}

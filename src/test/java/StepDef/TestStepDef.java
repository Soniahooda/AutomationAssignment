package StepDef;

import Pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {

    PersonalInfoPage personalInfoPage = new PersonalInfoPage();
    OpenApplication openApplication= new OpenApplication();
    HomePage homePage = new HomePage();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    CartSummaryPage cartSummaryPage = new CartSummaryPage();
    AddressPage addressPage = new AddressPage();
    ShippingPage shippingPage= new ShippingPage();
    PayementPage payementPage = new PayementPage();
    OrderSummaryPage orderSummaryPage = new OrderSummaryPage();




    @Given("^I loggedIn into application with email address as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void LoggedIn(String email, String password) throws Throwable {
        openApplication.openURL();
        homePage.clickSignInFromMenu();
        authenticationPage.enterEmailAdd(email);
        authenticationPage.enterPassword(password);
        authenticationPage.clickSignInBtn();

    }

    @When("^I go to T-shirt page and add a T-shirt into cart$")
    public void addOrder() throws Throwable {
        homePage.clickMyOrder();
        orderHistoryPage.GetOrderCount();
        homePage.clickTshirtMenu();
        homePage.clickAddToCart();
        homePage.clickProceedToCheckout();

    }

    @When("^I place order by doing payment$")
    public void placeOrder() throws Throwable {
        cartSummaryPage.clickProceedBtn();
        addressPage.clickProceedBtn();
        shippingPage.selectCheckbox();
        shippingPage.clickProceedBtn();
        payementPage.clickPayByCheck();
        orderSummaryPage.ClickConfirmOrderBtn();
        homePage.clickMyOrder();

    }

    @Then("^i can see order in order History$")
    public void verifyOrder() throws Throwable {
        orderHistoryPage.GetOrderCount();
        orderHistoryPage.verifyOrder();
    }

    @When("^I click on My Personal Info$")
    public void clickPersonalInfoLink() throws Throwable {
        homePage.clickMyPersonalInfo();
    }
    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" as$")
    public void enterDetails(String fname, String password) throws Throwable {
       personalInfoPage.enterDetails(fname,password);
    }



    @When("^I click on Save Button$")
    public void clickSaveButton() throws Throwable {
        personalInfoPage.clickSave();
    }

    @Then("^I can see updated name of user next to Signout option$")
    public void verifyUpdatedDetails() throws Throwable {
        homePage.verifyFirstName();
    }


}

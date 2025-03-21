package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import utils.BaseTest;

public class CheckoutPageSteps extends BaseTest {
    CheckoutPage checkoutpage;

    @When("product removed")
    public void product_removed() {
        driver = BaseTest.getDriver();  
        checkoutpage = new CheckoutPage(driver);  
        checkoutpage.remove();

    }
    @When("quantity increased")
    public void quantity_increased() {
        driver = BaseTest.getDriver();  
        checkoutpage = new CheckoutPage(driver);  
        checkoutpage.quantity();
    }
    @Then("checkout")
    public void clickCheckout() {
        driver = BaseTest.getDriver();
        checkoutpage = new CheckoutPage(driver);  
        checkoutpage.clickCheckout();
    }
}

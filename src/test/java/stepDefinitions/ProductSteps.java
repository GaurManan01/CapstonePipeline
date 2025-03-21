package stepDefinitions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import utils.BaseTest;

public class ProductSteps extends BaseTest {

	ProductPage productPage;
	WebDriverWait wait;
	Actions actions;
	
	@When("User clicks the product")
	public void user_clicks_the_product() throws InterruptedException {
		driver = BaseTest.getDriver();
		productPage =  new ProductPage(driver);
		Thread.sleep(5000);
		productPage.clickProduct();
		
		
	}
	@Then("Verify product title")
	public void verify_product_title() {
		 String displayed = productPage.verifyTitle();
		 System.out.println(displayed);

	}
	@Then("Verify product description")
	public void verify_product_description() {
		String displayed1 = productPage.verifyFeature();
		String actual_Feature = "FEATURES";
		 Assert.assertEquals(displayed1,actual_Feature, "Product title does not match!");
	}
	@Then("Verify product price")
	public void verify_product_price() {
		String displayed2 = productPage.verifyPrice();
		System.out.println(displayed2);
	}
	@Then("Add to cart")
	public void add_to_cart() throws InterruptedException {
		driver = BaseTest.getDriver();
		productPage =  new ProductPage(driver);
		Thread.sleep(5000);
		productPage.clickaddTocart();
	}


}

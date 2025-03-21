package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductPage {
	 WebDriver driver;
	 
	 public ProductPage (WebDriver driver) {
		 this.driver = driver;
		 
		 }
	 By product = By.cssSelector("#search-results > div:nth-child(3) > ul > li:nth-child(1) > div > a.product-img");
	 public void clickProduct() {
		WebElement click =  driver.findElement(product);
		click.click();
	 }
	 
//	 By title = By.xpath("//*[@id=\"product-title\"]/div/div[1]/div[1]/h1");
	 public String verifyTitle() {
		 WebElement productTitleElement = driver.findElement(By.cssSelector("#product-title > div > div.col-md-7.titlesection > div.prodtitle.text-left > h1")); 
	     return productTitleElement.getText();
	    }
	 public String verifyFeature() {
		 WebElement features = driver.findElement(By.cssSelector("#product-show > div > div.row.clearfix.productinfodetails.center > div.module-content > ul > li.active > a"));
		 return features.getText();
	 }
	 public String verifyPrice() {
		 WebElement price = driver.findElement(By.cssSelector("#product_pricing > form > div.product-pricing.left > div > div.buy-section > div.productprice > div.price-components > div.row > div.column.right > div.right-components > div.price.final"));
		 return price.getText();
	 }
	 By addToCart = By.id("add-to-cart-button");
	 public void clickaddTocart() {
		WebElement click1 =  driver.findElement(addToCart);
		click1.click();
	 }

		 
	 }
	 

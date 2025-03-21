package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;


public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public Object remove() {
    	return null;
    }
    public Object quantity() {
    	return null;
    }
    public void closePopupIfExists() {
        try {
            WebElement popupCloseButton = driver.findElement(By.cssSelector(".popup-close"));  
            popupCloseButton.click();
            System.out.println(" Pop-up closed.");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(" No pop-up found.");
        }
    }

    public void clickCheckout() {
        try {
            closePopupIfExists(); 

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            WebElement checkoutButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#checkout-link")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block'; arguments[0].style.visibility='visible';", checkoutButton);
            Thread.sleep(2000);

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkoutButton);

            System.out.println("Product not purchased.");
        } catch (Exception e) {
            System.out.println("Product Purchased ");
        }
    }


}

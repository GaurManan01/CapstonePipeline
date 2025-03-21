package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    WebDriver driver;

 
    private By topOffersSection = By.xpath("//h2[contains(text(),'Top Offers')]");
    private By recommendedSection = By.xpath("//h2[contains(text(),'Recommended')]");
    private By searchBox = By.xpath("//input[@id='search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isTopOffersVisible() {
        return driver.findElement(topOffersSection).isDisplayed();
    }

    public boolean isRecommendedVisible() {
        return driver.findElement(recommendedSection).isDisplayed();
    }

    public boolean isSearchBoxDisplayed() {
        return driver.findElement(searchBox).isDisplayed();
    }
}

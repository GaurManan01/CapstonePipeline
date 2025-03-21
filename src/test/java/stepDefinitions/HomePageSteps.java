package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseTest;
import java.time.Duration;

public class HomePageSteps extends BaseTest {
    WebDriverWait wait;

    public HomePageSteps() {
        this.wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(10));
    }


    @Given("User is on UrbanLadder homepage")
    public void user_is_on_urban_ladder_homepage() {
        BaseTest.setup("chrome"); 
        driver = BaseTest.getDriver();
        driver.get("https://www.urbanladder.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Then("Search box should be visible")
    public void search_box_should_be_visible() {
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
        Assert.assertTrue(searchBox.isDisplayed(), "Search box is NOT displayed!");
    }

    @Then("Lighting & Decor section should be visible")
    public void lighting_decor_section_should_be_visible() {
        WebElement lightingDecorSection = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='topnav_wrapper']/ul/li[9]/span")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lightingDecorSection);
        Assert.assertTrue(lightingDecorSection.isDisplayed(), "Lighting & Decor section is NOT displayed!");
    }

    @Then("Stores section should be visible")
    public void stores_section_should_be_visible() {
        WebElement storesSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Stores')]")));
        Assert.assertTrue(storesSection.isDisplayed(), "Stores section is NOT displayed!");
    }

    @Then("User searches for {string}")
    public void user_searches_for(String product) throws InterruptedException {
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
        searchBox.clear();
        searchBox.sendKeys(product);

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search_button']/span")));
        searchButton.click();
        Thread.sleep(10000);
    }
   
}

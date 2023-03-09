package StpDfnts;

import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RefineStep extends CommonMethods {

    @Given("user opens browser and navigate to {string}")
    public void userOpensBrowserAndNavigateTo(String url) {
        get(url);
    }

    @Then("user entering {string}")
    public void userEntering(String string) {
        driver.findElement(By.name("q")).sendKeys("practice automation testing");
    }

    @Then("user  clicks on google search button")
    public void userClicksOnGoogleSearchButton() {
        driver.findElement(By.className("gNO89b")).click();
    }


    @Then("user clicks  {string}")
    public void userClicks(String string) {
        driver.findElement(By.partialLinkText("Automation Practice Site")).click();
    }

    @Then("user clicks shop")
    public void userClicksShop() {
        driver.findElement(By.xpath("//a[text()='Shop']")).click();
    }

    @Then("user close the ad")
    public void userCloseTheAd() {
        if (driver.findElements(By.xpath("//h4[text()='Refine By >']")).size() > 0) {
            //do nothing
        } else {
            driver.switchTo().frame("aswift_7");
            driver.switchTo().frame("ad_iframe");
            driver.findElement(By.xpath("//span[text()=\"Close\"]")).click();
            driver.switchTo().defaultContent();

        }
    }

    @When("user clicks Javascript under product category")
    public void userClicksJavascriptUnderProductCategory() {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='JavaScript']")));
        driver.findElement(By.xpath("//a[text()='JavaScript']")).click();

    }

    @Then("it should display only Javascript products")
    public void itShouldDisplayOnlyJavascriptProducts() {

        List<WebElement> productList = driver.findElements(By.xpath("//ul[contains(@class,'products')]/li"));
        int productCount = productList.size();
        System.out.println("Product count:" + productCount);
        Assert.assertEquals("Count is not matching", 3, productCount);
        for (WebElement product : productList) {
            String productLabel = product.findElement(By.xpath("//a/h3")).getText();
            System.out.println("ProductName," + productLabel);
            Assert.assertTrue("Javascript label is not Present", productLabel.contains("JS"));
        }
    }


    @And("user close the browser")
    public void userCloseTheBrowser() {
        driver.close();

    }
}


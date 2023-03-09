package StpDfnts;

import PagesObjectModel.Basket;
import PagesObjectModel.Checkout;
import PagesObjectModel.Product;
import PagesObjectModel.Shop;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.sql.Driver;

   public class MyStepShop extends CommonMethods {
    Shop shop = new Shop();
    Product product = new Product();
    Basket basket = new Basket();
    Checkout checkout = new Checkout();

    @Given("user opens the browser and navigate to {string}")
    public void userOpensTheBrowserAndNavigateTo(String url) {
        get(url);

    }

    @Then("user enters {string}")
    public void userEnters(String text) {
        setText("q", "name", text);
    }

    @Then("user user clicks on google search button")
    public void userUserClicksOnGoogleSearchButton() {
        clickAnElement("gNO89b", "className");
    }

    @Then("user clicks on {string}")
    public void userClicksOn(String string) {
        clickAnElement("Automation Practice Site", "partialLinkText");
    }



    @Then("user clicks on shop")
    public void userClicksOnShop() {
        clickAnElement("//a[text()='Shop']", "xpath");
    }

    @Then("user closes the ad")
    public void userClosesTheAd()
    {
        if (driver.findElements(By.xpath("//a[text()='Home']")).size() > 0)
        {
            //do nothing
        } else {
            switchToFrameWithName("aswift_7");
            switchToFrameWithId("ad_iframe");
            clickAnElement("//span[text()='Close']", "xpath");
            switchToDefaultContent();

        }
    }

    @Then("user clicks on mastering java script item")
    public void userClicksOnMasteringJavaScriptItem() {
        shop.clicksOnMasteringJavaScriptItem();
    }

    @Then("user clicks on add to basket for the item")
    public void userClicksOnAddToBasketForTheItem() {
        product.clicksOnAddToBasketForTheItem();

    }


    @Then("user clicks on cart")
    public void userClicksOnCart() {
        product.clicksOnCart();

    }


    @Then("user reach the cart page and scroll down")
    public void userReachTheCartPageAndScrollDown(Object Driver) {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");

    }


    @Then("user clicks on proceed to checkout button")
    public void userClicksOnProceedToCheckoutButton() {
        basket.clicksOnProceedToCheckout();
    }

    @Then("user enters billing details field")
    public void userEntersBillingDetailsField(String text) {
        checkout.entersBillingDetailsField(text);

    }

    @Then("user scroll the page")
    public void userScrollThePage(Object Driver) {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,2000)", "");
    }

    @And("user place the order")
    public void userClicksOnPlaceTheOrder() {
        checkout.placeOrder();


    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
        checkout.close();
    }


}


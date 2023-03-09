import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class MyStep {
    WebDriver chromeDriver=null;
    @Given("user opens the browser and navigate to {string}")
    public void userOpensTheBrowserAndNavigateTo(String url) {
        chromeDriver=new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
    }

    @Then("user enters {string}")
    public void userEnters(String string) {
        chromeDriver.findElement(By.name("q")).sendKeys("facebook");
    }


    @Then("user click on google search")
    public void userClickOnGoogleSearch() {
        chromeDriver.findElement(By.className("gNO89b")).click();

    }

    @When("user select or clicks  {string}")
    public void userSelectOrClicks(String string) {
        chromeDriver.findElement(By.partialLinkText("Facebook - log in or sign up")).click();
    }

    @Then("user able to see the logo displayed")
    public void userAbleToSeeTheLogoDisplayed() {
        WebElement element= chromeDriver.findElement(By.className("fb_logo"));
        boolean isLabelDisplayedOrNot= element.isDisplayed();
    }
}

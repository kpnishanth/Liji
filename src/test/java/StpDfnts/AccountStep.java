package StpDfnts;

import PagesObjectModel.MyAccount;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class AccountStep extends CommonMethods {
    MyAccount accountPage=new MyAccount();

    @Given("user open the browser and navigate to {string}")
    public void userOpenTheBrowserAndNavigateTo(String url) {
        get(url);

    }

    @Then("user enter {string}")
    public void userEnter(String text) {
        setText("q","name",text);


    }

    @And("user clicks on google search button")
    public void userClicksOnGoogleSearchButton() {
        clickAnElement("gNO89b","className");

    }

    @Then("user clicks {string}")
    public void userClicks(String text) {
        clickAnElement("Automation Practice Site","partialLinkText");

    }

    @Then("user clicks on my account")
    public void userClicksOnMyAccount() {
        clickAnElement("//a[text()=\"My Account\"]","xpath");
    }


    @Then("user closes the ad window")
    public void userClosesTheAdWindow()
    {

        if (driver.findElements(By.xpath("//h2[text()='Login']")).size()>0)

        {
            //do nothing
        } else {
            switchToFrameWithName("aswift_7");
            switchToFrameWithId("ad_iframe");
            clickAnElement("//span[text()=\"Close\"]","xpath");
            switchToDefaultContent();

        }
    }

    @Then("user enters valid email address for register {string}")
    public void userEntersValidEmailAddress(String email) {
        accountPage.enterEmailAddress(email);

    }

    @Then("user enters password for register {string}")
    public void userEntersPasswordForRegister(String password) {
        accountPage.enterPasswordForRegister(password);
    }
    @And("user clicks on register")
    public void userClicksOnRegister() {
        accountPage.clickRegister();

    }

    @Then("user enters login field with valid username {string}")
    public void userEntersLoginFieldWithValidUsername(String email) {
        accountPage.enterUserName(email);
    }
    @And("user enter password for login {string}")
    public void userEnterPasswordForLogin(String password) {
        accountPage.enterPassword(password);
    }
    @Then("clicks on login")
    public void clicksOnLogin() {
        accountPage.clickLogin();
    }

    @Then("user clicks on sign out")
    public void userClicksOnSignOut() {
        accountPage.signOut();
    }

    @Then("user closes the browser window")
    public void userClosesTheBrowserWindow()
    {
        accountPage.close();
    }



}

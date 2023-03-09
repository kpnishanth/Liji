package PagesObjectModel;

import Utilities.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;

public class Basket extends CommonMethods {
    public void proceedToCheckout(){}

    public void clicksOnProceedToCheckout() {
        clickAnElement("//a[contains(@class,'checkout-button button alt wc-forward')]","xpath");
    }
}

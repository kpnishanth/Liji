package PagesObjectModel;

import Utilities.CommonMethods;

public class Checkout extends CommonMethods {

    public void billingDetails() {}
    public void placeOrder(){}

    //>>>>Actions

    public void entersBillingDetailsField(String text) {
        setText("//input[@id='billing_first_name']", "xpath", text);
        setText("//input[@id='billing_last_name']", "xpath", text);
        setText("//input[@id='billing_email']", "xpath", text);
        setText("//input[@id='billing_phone']", "xpath", text);
        setText("//input[@id='billing_address_1']", "xpath", text);
        setText("//input[@id='billing_city']", "xpath", text);
        setText("//input[@id='billing_postcode']", "xpath", text);
    }

    public void clicksOnPlaceTheOrder(){
        clickAnElement("//input[@value='Place order']","xpath");
    }


    public void closesTheBrowser() {
        close();
    }
}


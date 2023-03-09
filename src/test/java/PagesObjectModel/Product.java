package PagesObjectModel;

import Utilities.CommonMethods;

public class Product extends CommonMethods {


    public void clicksOnAddToBasketForTheItem() {
        clickAnElement("//button[text()='Add to basket']", "xpath");
    }

    public void clicksOnCart() {
        clickAnElement("//a/span[text()='1 item']", "xpath");
    }
}
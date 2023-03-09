package PagesObjectModel;

import Utilities.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Shop extends CommonMethods {


    public void clicksOnMasteringJavaScriptItem() {
        clickAnElement("//*[@id=\"content\"]/ul/li[6]/a[1]/img", "xpath");
    }

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
    public void userCloseTheBrowser(){
        close();
    }
}



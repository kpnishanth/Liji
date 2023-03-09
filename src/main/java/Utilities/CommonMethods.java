package Utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
    protected static WebDriver driver;
    public CommonMethods(){
        driver=DriverManagement.getDriver();

    }
    public void clickAnElement(String locator,String locatorType){
        if (locatorType.equals("xpath")) {
            driver.findElement(By.xpath(locator)).click();
        }
        else if (locatorType.equals("id")) {
            driver.findElement(By.id(locator)).click();
        }
        else if (locatorType.equals("name")){
            driver.findElement(By.name(locator)).click();
        }
        else if(locatorType.equals("className")) {
            driver.findElement(By.className(locator)).click();

        }
        else if(locatorType.equals("linkText")){
            driver.findElement(By.linkText(locator)).click();
        }

        else if(locatorType.equals("partialLinkText")) {
            driver.findElement(By.partialLinkText(locator)).click();
        }
        else if(locatorType.equals("cssSelector")) {
            driver.findElement(By.cssSelector(locator)).click();
        }
        else if(locatorType.equals("tagName")) {
            driver.findElement(By.tagName(locator)).click();
        }

       else
        {
            System.out.println("Unable to identify locator type");
        }
    }

    public void setText(String locator,String locatorType,String text) {

        if (locatorType.equals("xpath")) {
            driver.findElement(By.xpath(locator)).sendKeys(text);
        }

        else if (locatorType.equals("id")) {
            driver.findElement(By.id(locator)).sendKeys(text);
        }
        else if (locatorType.equals("name")) {
            driver.findElement(By.name(locator)).sendKeys(text);
        }

        else if (locatorType.equals("className")) {
            driver.findElement(By.className(locator)).sendKeys(text);
        }

        else if (locatorType.equals("linkText")) {
            driver.findElement(By.linkText(locator)).sendKeys(text);
        }

        else if(locatorType.equals("partialLinkText")) {
            driver.findElement(By.partialLinkText(locator)).sendKeys(text);
        }

        else if(locatorType.equals("cssSelector")) {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }

        else if(locatorType.equals("tagName")) {
            driver.findElement(By.tagName(locator)).sendKeys(text);
        }

        else
        {
            System.out.println("Unable to identify locator type");

        }
    }

    public void switchToFrameWithName(String name)
    {
        driver.switchTo().frame(name);
    }
    public void switchToFrameWithId(String id)
    {
        driver.switchTo().frame(id);
    }
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void get(String url) {
        driver.get(url);
    }

    public void close() {
        driver.close();
    }

    public void reachTheCartPageAndScrollDown(Object Driver) {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

}

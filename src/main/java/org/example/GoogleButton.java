package org.example;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class GoogleButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        List<WebElement> googleSearch = driver.findElements(By.cssSelector("input.gNO89b[value=\"Google Search\"]"));
        System.out.println("Elements count is " + googleSearch.size());
        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("georgia state");
        for (WebElement search : googleSearch) {
            //System.out.println("Count is " +googleSearch.isEmpty());
            if (search.isDisplayed()) {
                System.out.println(search.getAccessibleName());
                search.click();
                break;
            }else {
                driver.close();
            }
            System.out.println("closed the browser");


                //driver.findElement(By.name("q")).sendKeys("georgia state");

                //List<WebElement> elements = driver.findElements(By.cssSelector("input.gNO89b[type=\"submit\"]"));


                //elements.get(0).click();

        }
    }
}




package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
      WebDriverManager.chromedriver().driverVersion("111.0.5563.64").browserVersion("111.0.5563.64").setup();
        WebDriver webDriver= new ChromeDriver(options);
        webDriver.get("http://google.com");
    }
}
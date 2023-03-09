package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
            WebDriver driver = new SafariDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://www.google.com");
    }

}
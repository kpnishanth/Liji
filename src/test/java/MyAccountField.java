import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyAccountField {
    public static void main(String[] args) throws InterruptedException {
        WebDriver Driver = new ChromeDriver();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.get("https://www.google.com");
        Driver.manage().window().maximize();
        Driver.findElement(By.name("q")).sendKeys("practice automation testing");
        Driver.findElement(By.className("gNO89b")).click();
        Driver.findElement(By.partialLinkText("Automation Practice Site")).click();
        Driver.findElement(By.xpath("//a[text()=\"My Account\"]")).click();
        if (Driver.findElements(By.xpath("//h2[text()='Login']")).size() > 0) {
            //do nothing
        } else {
            Driver.switchTo().frame("aswift_7");
            Driver.switchTo().frame("ad_iframe");
            Driver.findElement(By.xpath("//span[text()=\"Close\"]")).click();
            Driver.switchTo().defaultContent();
            Driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("arshunish18@gmail.com");
            Driver.findElement(By.xpath("//input[@id=\"reg_password\"]")).sendKeys("heeranishanth87");
            Driver.findElement(By.xpath("//input[@name=\"register\"]")).click();
            //chromeDriver.switchTo().defaultContent();
            Driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("heera.arshu19@gmail.com");
            Driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("heeranishanth87");
            Driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
            Driver.findElement(By.xpath("//a[text()='Sign out']")).click();
            Driver.close();

        }
    }


}

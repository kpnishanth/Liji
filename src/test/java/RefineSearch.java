import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RefineSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("practice automation testing");
        driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.partialLinkText("Automation Practice Site")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
        driver.switchTo().frame("aswift_7");
        driver.switchTo().frame("ad_iframe");
        driver.findElement(By.xpath("//span[text()=\"Close\"]")).click();
        driver.switchTo().defaultContent();
        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='JavaScript']")).click();

        List<WebElement> productList = driver.findElements(By.xpath("//ul[contains(@class,'products')]/li']"));
       int productCount = productList.size();
       System.out.println("Product count:" + productCount);
       Assert.assertEquals("Count is not matching", 3, productCount);
        for (WebElement product : productList) {
            String productLabel = product.findElement(By.xpath("//a/h3")).getText();
            System.out.println("ProductName," + productLabel);
            Assert.assertTrue("Javascript label is not Present", productLabel.contains("JS"));

        }
        driver.close();


    }
}
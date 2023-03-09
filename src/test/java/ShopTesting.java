import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("practice automation testing");
        driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.partialLinkText("Automation Practice Site")).click();
        driver.findElement(By.xpath("//a[text()='Shop']")).click();
        if (driver.findElements(By.xpath("//a[text()='Home']")).size() > 0) {
            //do nothing
        } else {
            driver.switchTo().frame("aswift_7");
            driver.switchTo().frame("ad_iframe");
            driver.findElement(By.xpath("//span[text()='Close']")).click();
            driver.switchTo().defaultContent();
            //chromeDriver.switchTo().frame("//iframe[@title=\"Advertisement\"]");
            //chromeDriver.findElement(By.xpath("//div[@id=\"dismiss-button\"]")).click();
            //Working ^^^^^^
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,260)", "");
            driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a[1]/img")).click();
            //chromeDriver.findElement(By.xpath("//a[@data-product_id=\"165\"]")).click();
            //chromeDriver.findElement(By.xpath("//a[text()=\"Add to basket\"]")).click();
            //js.executeScript("window.scrollBy(0,2000)", "");
            driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
            driver.findElement(By.xpath("//a/span[text()='1 item']")).click();
            //chromeDriver.findElement(By.xpath("//div[contains(@class,'cart_totals')]"));
            js.executeScript("window.scrollBy(0,250)", "");
            driver.findElement(By.xpath("//a[contains(@class,'checkout-button button alt wc-forward')]")).click();

            //^^^^Working, Proceed to Checkout^^^^^
            driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("Liji");
            driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("Nishanth");
            driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("liji.skyview@gmail.com");
            driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("123456789");
            driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("121 street");
            driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Cochin");
            driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("654321");
            js.executeScript("window.scrollBy(0,1000)", "");
            driver.findElement(By.xpath("//input[@value='Place order']")).click();
            //Place Order^^^^^^^
            driver.close();


        }


    }
}


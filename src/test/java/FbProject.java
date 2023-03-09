
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class FbProject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.quit();
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.name("q")).sendKeys("facebook");
        chromeDriver.findElement(By.className("gNO89b")).click();
        chromeDriver.findElement(By.partialLinkText("Facebook - log in or sign up")).click();
        WebElement element= chromeDriver.findElement(By.className("fb_logo"));
        boolean isLabelDisplayedOrNot= element.isDisplayed();
        Assert.assertTrue("Label is not displayed",isLabelDisplayedOrNot);
        chromeDriver.findElement(By.name("login"));
        chromeDriver.close();
    }

    }


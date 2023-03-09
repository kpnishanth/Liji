import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class JavaHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
        //System.out.println(chromeDriver.getWindowHandles());
        chromeDriver.switchTo().newWindow(WindowType.TAB);
        chromeDriver.switchTo().newWindow(WindowType.TAB);
        chromeDriver.switchTo().newWindow(WindowType.TAB);
        Set<String> whs=chromeDriver.getWindowHandles();
        chromeDriver.switchTo().window(whs.toArray()[1].toString());
        chromeDriver.get("https://www.facebook.com");
        Thread.sleep(2000);
        chromeDriver.switchTo().window(whs.toArray()[2].toString());
        chromeDriver.get("https://www.youtube.com");
        Thread.sleep(2000);
        chromeDriver.switchTo().window(whs.toArray()[3].toString());
        chromeDriver.get("https://www.instagram.com");
        Thread.sleep(2000);



    }
}

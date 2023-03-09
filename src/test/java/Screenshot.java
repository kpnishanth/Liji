import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
//import java.nio.file.Path;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
//import java.util.concurrent.ScheduledExecutorService;

public class Screenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.name("q")).sendKeys("udemy");
        chromeDriver.findElement(By.className("gNO89b")).click();
        chromeDriver.findElement(By.partialLinkText("IT & Software Courses")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[3]/div[7]/a")).click();
        Thread.sleep(2000);
        TakesScreenshot ss=(TakesScreenshot)chromeDriver;
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        Random d=new Random();
        d.nextInt(500);
        String ScreenshotName="Scn 001_"+(d.nextInt(500));
        System.out.println(ScreenshotName);
        File destinationFile = new File(System.getProperty("user.dir") + "//target//"+ScreenshotName+".png");
        FileUtils.copyFile(sourceFile,destinationFile);
        Thread.sleep(2000);
    }
}

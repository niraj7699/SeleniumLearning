package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        
        driver.switchTo().frame(0); //to switch to frame
        driver.findElement(By.xpath("//div[@id='draggable']")).click();
        driver.navigate().back();
        
	}

}

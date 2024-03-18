package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class alertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);
        
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
       
        alert.accept(); // to click on ok button
        //alert.dismiss(); ---> //to click on cancel button
        
        
	}

}

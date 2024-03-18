package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleFileuploadDesktopPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.get("https://html.com/input-type-file/");
        
        
        //Instead of clicking "Browser or choose file" button, we have to just send location of the file in OS
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ASUS\\Desktop\\New Text Document.txt");
         
       
	}

}

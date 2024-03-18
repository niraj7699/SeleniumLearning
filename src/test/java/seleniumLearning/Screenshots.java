package seleniumLearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Screenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        
        driver.get("https://google.com");
        
        //To take screenshot and stored as file format
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        //copy the screenshot to desired location using copyfile method
        FileUtils.copyFile(src, new File("C:\\Users\\ASUS\\eclipse-workspace\\selenium-learning\\ScreenshotsCaptured"));
        
        
       
       
	}

}

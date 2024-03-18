package seleniumLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class objectrepo {

	public static void main(String[] args) throws IOException {
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Properties pr=new Properties(); 
		
		FileInputStream fl=new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\selenium-learning\\src\\test\\java\\seleniumLearning\\config.properties");
		
		pr.load(fl); // load f1 object with help of properties object.
		
		String urlString=pr.getProperty("url"); //to fetch the values from properties file.
		driver.get(urlString);
		
		driver.findElement(By.cssSelector(pr.getProperty("searchfield"))).sendKeys(pr.getProperty("t"));
		driver.findElement(By.cssSelector(pr.getProperty("searchbtn"))).click();
		
	
	}
}

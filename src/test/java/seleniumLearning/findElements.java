package seleniumLearning;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Eclipse\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        
	        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        driver.get("https://google.com");
	        
	        List <WebElement> lt=driver.findElements(By.tagName("a"));
	        for(int i=0;i<lt.size();i++) {
	        	String st=lt.get(i).getText();
	        	System.out.println(st);  
	        }
	        System.out.println(lt.size());
	}

}

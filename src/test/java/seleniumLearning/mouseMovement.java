package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.udemy.com/?utm_source=adwords-brand&utm_medium=udemyads&utm_campaign=Brand-Udemy_la.EN_cc.INDIA_dev.Desktop.Tablet&utm_term=_._ag_133043842461_._ad_595460368512_._de_c_._dm__._pl__._ti_kwd-43360705933_._li_1007828_._pd__._&utm_term=_._pd__._kw_udemy%20courses_._&matchtype=e&gclid=Cj0KCQjw-fmZBhDtARIsAH6H8qgQVAyadFQ011JF5yMKbUCyQ9wHIOdTe_209tmb8Iff-kGf8pViBF4aAmCVEALw_wcB");
	        driver.manage().window().maximize();
	        //driver.manage().deleteAllCookies();
	        Actions action=new Actions(driver);
	        
	        //pageloadtimeout and implicitlywait are dynamics,whereas Thread.sleep is static
	        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        action.moveToElement(driver.findElement(By.xpath("//span[text()='Categories']"))).build().perform();
	 
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Development']")).click();

	}

}

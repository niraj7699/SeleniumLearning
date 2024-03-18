package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class googleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:www.google.com");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testi");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
        System.out.println(list.size());
       for (WebElement suggest : list) {
    	   System.out.println(suggest.getText());
		
	}
        

	}

}

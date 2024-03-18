package seleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:www.dummysoftware.com/popupdummy_testpage.html");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        Set<String> p=driver.getWindowHandles();
        
        Iterator<String> iterator=p.iterator();
        
        String parent=iterator.next();
        System.out.println(parent);
        
        String child=iterator.next();
        driver.switchTo().window(child);
        
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        
        driver.close();
        
        Thread.sleep(3000);
        
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
        
        
        
        
        
        																												

	}

}

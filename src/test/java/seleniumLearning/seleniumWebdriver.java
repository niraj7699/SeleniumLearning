package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805943%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805943&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D20465%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA1uKMBhAGEiwAxzvX9xaVeLx6KOUJhbXqZiEXwS-OTyPaLe3edayM2TO4-_lkIitqAKkxWhoCmnAQAvD_BwE");
        
        driver.findElement(By.cssSelector("input[id*='u_0_b_']")).sendKeys("Niraj");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nk0431311@gmail.com");
     
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nk0431311@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345@");
        
       Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
       Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
       Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
       
         
       day.selectByVisibleText("1");
       month.selectByVisibleText("Aug");
       year.selectByVisibleText("1998");
       
       driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
       
      // driver.findElement(By.xpath("//button[@name='websubmit']")).click();
       
	}

}

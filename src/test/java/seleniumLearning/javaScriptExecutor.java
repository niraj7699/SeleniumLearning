package seleniumLearning;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class javaScriptExecutor {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Eclipse\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.ebay.com/");
    
    //WebElement element=driver.findElement(By.cssSelector("#gh-btn"));
    
    WebElement element=driver.findElement(By.xpath("//a[text()='Stores']"));
    //flash(element, driver);
    //drawborder(element,driver);
    
    //alert(element, driver, "There is an issue in the button");
    
    
//    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(src, new File("C:\\Users\\ASUS\\eclipse-workspace\\Selenium\\Screenshots\\alert.jpg"));
//    
    //clickElementByJavascript(element,driver);
    
    //refreshPageByJS(driver);
    
    //gettitleByJS(driver);
    //getinnerText(driver);
    
    //scrolldown(driver);
    
    scrollIntoView(element, driver);
    
	}
	
	public static void flash(WebElement Element,WebDriver driver) throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
			String bg=Element.getCssValue("backgroundColor");
			for(int i=0;i<=5;i++) {
				changeColor("rgb(255,0,0)",Element,driver);
				Thread.sleep(1000);
				changeColor(bg,Element,driver);
				Thread.sleep(1000);
			}
		
	}
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		//typecasting the driver to use with javascript
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//executeScript--->to execute javascript code
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//executeScript--->to execute javascript code
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public static void alert(WebElement element,WebDriver driver,String msg) throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		js.executeScript("alert('"+msg+"')");
		
		
	}
	
	public static void clickElementByJavascript(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()", element);
	}
   
	public static void refreshPageByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static void gettitleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		System.out.println(js.executeScript("return document.title;").toString());
	}
	
	public static void getinnerText(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		System.out.println(js.executeScript("return document.documentElement.innerText;").toString());
	}
	public static void scrolldown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

}

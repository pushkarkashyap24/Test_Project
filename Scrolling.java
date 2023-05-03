import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.Value;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		
		Thread.sleep(5000L);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		WebElement webele=driver.findElement(By.id("displayed-text"));
		
		js.executeScript("arguments[0].click()",webele);
		
		js.executeScript("arguments[0].value='Pushkar'",webele);
		}

}

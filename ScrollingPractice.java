import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPractice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://google.com");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	/*	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollby(0,500)");
		Thread.sleep(5000L);
		js.executeScript("document.queryselector('.tableFixHead').scrollTop=5000");
	*/	
		int sum=0;
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		for(int i=0;i<values.size();i++)
		{
			int k=Integer.parseInt(values.get(i).getText());
			sum=sum+k;
		}
		System.out.println(sum);
		

	}
}

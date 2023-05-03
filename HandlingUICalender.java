

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUICalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
		}
		
		driver.findElement(By.xpath("//td[text()='23']")).click();
		
		
		}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//CheckBox Script
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}

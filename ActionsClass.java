import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId= it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		String text[]=driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ");
		System.out.println(text[4]);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(text[4]);
		
		
	}

}

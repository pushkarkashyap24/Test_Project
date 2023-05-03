import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce_Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("9038416351");
		driver.findElement(By.cssSelector("#password")).sendKeys("RadhaaswamiI@24");
	
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
			}

}

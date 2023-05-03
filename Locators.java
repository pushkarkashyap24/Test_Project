import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("9038416351");
		driver.findElement(By.id("pass")).sendKeys("RadhaaswamiI@24");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.name("login")).click();
		//System.out.println(driver.getTitle());
		//driver.navigate().to(http://yahoo.com");
		//System.out.println(driver.getTitle());
		//driver.close();
	}

}

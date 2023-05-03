import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsByCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Java 11\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("irjjgdffkj");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("yjytw7iyuik");
		driver.findElement(By.cssSelector("[name='login']")).click();
	}

}

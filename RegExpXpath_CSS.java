import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegExpXpath_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("ghjkhhihi");
		driver.findElement(By.cssSelector("input[type*='passwo']")).sendKeys("gkgukhh");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
	}

}


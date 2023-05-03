import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//*[text()='Cucumber - 1 Kg']/parent::div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[text()='Cucumber - 1 Kg']/parent::div/div[3]/button")).click();
		
	}

}

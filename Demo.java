import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://yahoo.com");
		System.out.println(driver.findElement(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label")).getText());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		//driver.wait(5000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}

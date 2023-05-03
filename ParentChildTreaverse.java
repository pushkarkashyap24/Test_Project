import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTreaverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//div[@class='_yb_a2n8g _yb_bustq']/div[3]/div/div/a")).click();
		
	}

}

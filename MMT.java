
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']")).isEnabled());
	
		//driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		
		if(driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']")).getText().contains("Tap to add a return date for bigger discounts"))
		{
			System.out.println("Disabled");
		}
		else
		{
			System.out.println(" Enabled");
		}
	
	
	}
	}
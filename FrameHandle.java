
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")) ).build().perform();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//driver.switchTo().defaultContent();
		
	}
}

		
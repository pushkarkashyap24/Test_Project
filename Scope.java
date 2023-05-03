
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		System.out.println(
				driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style'] //a")).size());

		// 2.
		WebElement footerColumn = driver.findElement(
				By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']/table/tbody/tr/td[1]/ul"));
		System.out.println(footerColumn.findElements(By.tagName("a")).size());

		for (int i = 1; i < footerColumn.findElements(By.tagName("a")).size(); i++) {
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		}
		Set<String> abcd=driver.getWindowHandles();
		/*Iterator it=abcd.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window((String) it.next());
			System.out.println(driver.getTitle());
		}*/
		for(String s:abcd)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
		}

	}

}

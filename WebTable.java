import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		String befXpath="//*[@id=\"customers\"]/tbody/tr[";
		String aftXpath="]/td[1]";
		////*[@id="customers"]/tbody/tr[2]/td[1]
		////*[@id="customers"]/tbody/tr[3]/td[1]
		for(int i=2;i<=rows.size();i++)
		{
			String actualXpath=befXpath+i+aftXpath;
			System.out.println(driver.findElement(By.xpath(actualXpath)).getText());
		}
	}

}

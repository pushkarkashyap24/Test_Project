import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//AutoSuggestion
		driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
			else
			{
				continue;
			}
		}
	
//DropDown and Parent-Child Relationship Xpath
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Amritsar (ATQ)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Bagdogra (IXB)']")).click();
		
//Current Date pick
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		
//CheckBox		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")));
		
//Incresing count in drop down		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Thread.sleep(3000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		
//Static Dropdown		
		WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select option=new Select(staticDropDown);
		option.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		
		
	}
}


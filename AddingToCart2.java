import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingToCart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String reqItem[] = { "Cucumber", "Beetroot" };
		int j = 0;
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		List<String> reqirementList = Arrays.asList(reqItem);
		for (int i = 0; i < items.size(); i++) {
			String[] name = items.get(i).getText().split("-");
			String formattedName = name[0].trim();

			if (reqirementList.contains(formattedName)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				j++;
				if (j == reqItem.length) {
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']"));
		
		

	}

}

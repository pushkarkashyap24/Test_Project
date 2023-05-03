import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalVariable {
	
	public static void main(String args[]) throws IOException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Java 11\\\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("");
		Properties fis=new Properties();
		FileInputStream fos=new FileInputStream("C:\\Users\\USER\\eclipse-workspaceNew\\Introduction\\src\\Global.properties"); 
		fis.load(fos);//properties get knowledge of where to scan
		System.out.println(fis.getProperty("browser"));
		System.out.println(fis.getProperty("url"));
		fis.setProperty("browser","Firefox");
		fis.setProperty("url","gmail.com");
		System.out.println(fis.getProperty("browser"));
		System.out.println(fis.getProperty("url"));
		
		FileOutputStream fps=new FileOutputStream("C:\\\\Users\\\\USER\\\\eclipse-workspaceNew\\\\Introduction\\\\src\\\\Global.properties");
		
		fis.store(fps, null);
		
	}

}

package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	public static WebDriver driver;
	
@BeforeTest
public static void setUp() throws IOException{
	Properties p27=new Properties();
	FileReader r27=new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\config27.properties");
	p27.load(r27);//loading file inside the object
	System.out.println(p27.getProperty("browser"));
	if(p27.getProperty("browser").equalsIgnoreCase("chrome")){
		System.out.println("hi55");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        driver = new ChromeDriver();			
		 System.out.println("hi");
	}
	else if(p27.getProperty("browser").equalsIgnoreCase("firefox")){
		System.out.println("hi55");
		System.setProperty("webdriver.geckodriver.driver", "D://Selenium Testing Training//geckodriver.exe");
		System.out.println("hi55ss");
		driver=new FirefoxDriver();
			
		 System.out.println("hi");
	}

	else 
	{
		System.out.println("Browser not found");
	}
	driver.get(p27.getProperty("url")); 
}
@AfterTest
public static void teardown(){
	driver.quit();	
}














}

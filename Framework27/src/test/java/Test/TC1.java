package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.Pgs27;

public class TC1 extends BaseTest {
	
	
@Test
public static void HomePageClick(){
	Pgs27 homep27= new Pgs27(driver);
	
	homep27.Search.sendKeys("watch");
	homep27.Submit.click();
	Assert.assertEquals(driver.getTitle(), "Amazon.com: watch");
}
}

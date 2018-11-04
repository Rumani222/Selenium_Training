package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pgs27 {
	@FindBy(id="twotabsearchtextbox") public WebElement Search;
	@FindBy(xpath="(//input[@type='submit'])[1]") public WebElement Submit;

public Pgs27 (WebDriver driver){
	PageFactory.initElements(driver,this);
}

}

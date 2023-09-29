package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deygalogin {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"Header__Wrapper\"]/div[2]/button") WebElement hamburger;
	@FindBy(xpath="//*[@id=\"Header__Wrapper\"]/div[4]/nav/ul/li[1]/div[2]/ul/li[3]/a") WebElement createaccount;
	
	public deygalogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void hamburgrClick()
	{
		hamburger.click();
		createaccount.click();
	}
	
}

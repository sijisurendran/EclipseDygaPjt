package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class deygabaseclass {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://deyga.in/");
	}
}

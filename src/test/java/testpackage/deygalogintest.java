package testpackage;

import org.testng.annotations.Test;

import pagepackage.deygabaseclass;
import pagepackage.deygalogin;

public class deygalogintest extends deygabaseclass{
	@Test
	public void login()
	{
		deygalogin ob=new deygalogin(driver);
		ob.hamburgrClick();
	}
	
}

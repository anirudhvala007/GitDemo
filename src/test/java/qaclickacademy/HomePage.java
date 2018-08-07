package qaclickacademy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObj.LandingPage;
import PageObj.LoginPage;
public class HomePage extends base
{
	@Test(dataProvider="getData")
	public void basePageNav(String uname,String pass) throws IOException
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		
		LandingPage l=new LandingPage(driver);
		l.login().click();
		LoginPage lp=new LoginPage(driver);
		lp.email().sendKeys(uname);
		lp.passw().sendKeys(pass);
		lp.log().click();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="restricted@";
		data[0][1]="sdhdhd";
//		data[1][0]="nonresticted@";
//		data[1][1]="cffghnjbv";
		return data;
		
}

}

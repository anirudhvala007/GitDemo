package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	public WebDriver driver;
	By signin=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement login()
	{
		return driver.findElement(signin);
	}

}

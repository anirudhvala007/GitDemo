package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	By email=By.xpath("//input[@type='email']");
	By passw=By.xpath("//input[@type='password']");
	By log=By.xpath("//input[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement passw()
	{
		return driver.findElement(passw);
	}
	public WebElement log()
	{
		return driver.findElement(log);
	}



}

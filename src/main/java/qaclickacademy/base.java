package qaclickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base 
{
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\aniru\\Mavenjava\\src\\main\\java\\qaclickacademy\\data.properties");
        prop.load(fi);
        String browserName=prop.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\aniru\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\aniru\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {
        	System.setProperty("webdriver.ie.driver",
					"C:\\Users\\aniru\\Downloads\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");

			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

		 driver = new InternetExplorerDriver(cp);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
	}
		
}

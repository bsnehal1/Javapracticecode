package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Chrometest1 {
	
	


	@Test
	public void test1() throws MalformedURLException 
	{
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://www.google.com");		
		System.out.println(driver.getTitle());
		driver.quit();
		


	}
	
	@Test
	public void test2() throws MalformedURLException
	{		
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://www.gmail.com");		
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@Test
	public void test3() throws MalformedURLException 
	{
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://www.yahoo.com");		
		System.out.println(driver.getTitle());
		driver.quit();
	}



}

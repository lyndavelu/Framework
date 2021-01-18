package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FWGen_BaseTestYahoo implements FWGen_AutoConstantYahoo
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.quit();
	}
}

package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FWGen_BaseTestFB implements FWGen_AutoConstantFB
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() throws InterruptedException
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='cookie-policy-banner-accept']")).click();
		driver.manage().window().maximize();
		//driver.switchTo().window(url);
	}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.quit();
	}
}

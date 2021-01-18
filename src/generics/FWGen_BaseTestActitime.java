package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pom.FWPom_ActitimeHomePage;
import pom.FWPom_ActitimeLoginPage;


public class FWGen_BaseTestActitime implements FWGen_AutoConstantActitime
{
	public WebDriver driver;
	
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("execution started", true);
	}
	
	@BeforeClass
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	
	@BeforeClass (dependsOnMethods = "openbrowser")
	public void login() throws IOException
	{
		FWPom_ActitimeLoginPage login=new FWPom_ActitimeLoginPage(driver);
		login.actitimeloginMethod();
	}
	
	@AfterClass
	public void logout() throws InterruptedException
	{
		FWPom_ActitimeHomePage home=new FWPom_ActitimeHomePage(driver);
		home.logoutMethod();
	}
	
	@AfterClass (dependsOnMethods = "logout")
	public void closebrowser()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executioncompleted()
	{
		Reporter.log("execution is completed",true);
	}
}
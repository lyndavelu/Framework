package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FWPom_ActitimeHomePage 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplansLink;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timetrackLink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public FWPom_ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoactiplansMethod()
	{
		switchtoactiplansLink.click();
	}
	
	public void timetrackMethod()
	{
		timetrackLink.click();
	}
	
	/*
	public void tasksMethod()
	{
		tasksLink.click();
	}
	*/
	
	public void tasksMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", tasksLink);
	}
	
	public void reportsMethod()
	{
		reportsLink.click();
	}
	
	public void usersMethod()
	{
		usersLink.click();
	}
	
	public void calendersMethod()
	{
		calendersLink.click();
	}
	
	public void settingsMethod()
	{
		settingsLink.click();
	}
	
	public void integrationsMethod()
	{
		integrationsLink.click();
	}
	
	public void helpandsupportMethod()
	{
		helpandsupportLink.click();
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}	
}
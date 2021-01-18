package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FWPom_ActitimeLeaveTypesPage 

{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement createleavetypeLink;
	
	@FindBy (xpath ="(//span[.='LV Sick'])[1]")
	private WebElement clickleavetypeButton;
	
	@FindBy(xpath = "//span[.='LV Sick2 weeks']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteleavetypeButton;
	
	@FindBy (xpath = "//input[@id='inputDiv']")
	private WebElement editleavetypeTextfield;
	
	@FindBy (xpath = "(//div[@class='applyButton'])[2]")
	private WebElement applyleavechangeButton;
	
	public FWPom_ActitimeLeaveTypesPage(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypeMethod()
	{
		createleavetypeLink.click();
	}
	
	public void clickleavetypeMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clickleavetypeButton);
	}
	
	public void editleavetypeMethod()
	{
		editleavetypeTextfield.sendKeys("2 weeks");
		
	}
	
	public void applyleavechangeMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", applyleavechangeButton);
	}
	
	public void deleteleavetypeMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", deleteleavetypeButton);
	}
	
}

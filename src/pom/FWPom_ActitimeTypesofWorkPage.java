package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_BasePage;

public class FWPom_ActitimeTypesofWorkPage extends FWGen_BasePage
{
	public WebDriver driver;

	@FindBy (xpath = "//span[.='Create Type of Work']")
	private WebElement createtypeofworkLink;

	@FindBy (xpath = "//input[@value='Show Types of Work']")
	private WebElement showtypesofworkButton;
	
	@FindBy (xpath = "//a[.='Testing123']")
	private WebElement selecttypeofworkLink;

	@FindBy (xpath = "//a[contains (text(),'Testing123')]/../..//a[contains(text(),'delete')]")
	private WebElement deletetypeofworkButton;

	public FWPom_ActitimeTypesofWorkPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createtypeofworkMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createtypeofworkLink);
	}


	public void showtypeofworkMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", showtypesofworkButton);
	}
	
	public void selecttypeofworkMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", selecttypeofworkLink);
	}
	public void deletetypeofworkMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", deletetypeofworkButton);
		alertaccept(driver);
		
	}

}

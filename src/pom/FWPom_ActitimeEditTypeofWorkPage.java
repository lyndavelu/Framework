package pom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_AutoConstantActitime;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibraryActitime;

public class FWPom_ActitimeEditTypeofWorkPage extends FWGen_BasePage implements FWGen_AutoConstantActitime
{

	public WebDriver driver;
	
	@FindBy (xpath ="//input[@value='Testing123']")
	private WebElement edittypeofworknameTextfield;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement savechangeButton;
	
	public FWPom_ActitimeEditTypeofWorkPage(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void edittypeofworknameMethod() throws IOException
	{
		//edittypeofworknameTextfield.sendKeys("Edit");
		edittypeofworknameTextfield.sendKeys(FWGen_ExcelLibraryActitime.getcellvalue(excel_path, sheet_name,1, 5));
	}
	
	public void savechangeMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", savechangeButton);
	}
	
}

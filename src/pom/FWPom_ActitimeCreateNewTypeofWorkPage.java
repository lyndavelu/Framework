package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_AutoConstantActitime;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibraryActitime;

public class FWPom_ActitimeCreateNewTypeofWorkPage extends FWGen_BasePage implements FWGen_AutoConstantActitime
{
	@FindBy (xpath ="//input[@name='name']")
	private WebElement entertypeofworknameTextfield;
	
	@FindBy (xpath ="//select[@name='active']")
	private WebElement selectstatusDropDown;
	
	@FindBy (xpath ="(//input[@name='billable'])[1]")
	private WebElement categorybillableRadioButton;
	
	@FindBy (xpath ="//input[@class='rate']")
	private WebElement enterbillingrateTextfield;
	
	@FindBy (xpath ="(//input[@name='billable'])[2]")
	private WebElement categorynonbillableRadioButton;
	
	@FindBy (xpath ="//input[@type='submit']")
	private WebElement createtypeofworkButton;
	
	@FindBy (xpath = "//input[@type='button']")
	private WebElement cancelButton;
	
	public FWPom_ActitimeCreateNewTypeofWorkPage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	
	public void entertypeofworknameMethod() throws IOException
	{
		//entertypeofworknameTextfield.sendKeys("Testing123");
		entertypeofworknameTextfield.sendKeys(FWGen_ExcelLibraryActitime.getcellvalue(excel_path, sheet_name,1, 3));
	}
	
	public void selectstatusMethod()
	{
		selectstatusDropDown.click();
	}
	
	public void selectnonbillableCategoryMethod()
	{
		categorynonbillableRadioButton.click();
	}
	
	public void selectbillableCategoryMethod()
	{
		categorybillableRadioButton.click();
	}
	
	public void enterbillingrateMethod() throws IOException
	{
		//enterbillingrateTextfield.sendKeys("500");
		enterbillingrateTextfield.sendKeys(FWGen_ExcelLibraryActitime.getcellvalue(excel_path, sheet_name,1, 4));
	}
	
	public void createtypeofworkMethod()
	{
		createtypeofworkButton.click();
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}	
	
	
	
}

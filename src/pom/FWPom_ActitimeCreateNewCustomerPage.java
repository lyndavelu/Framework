package pom;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.FWGen_AutoConstantActitime;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibraryActitime;

public class FWPom_ActitimeCreateNewCustomerPage extends FWGen_BasePage implements FWGen_AutoConstantActitime
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextfield;
	
	@FindBy(xpath = "((//div[.='- Select Customer -'])[1]")
	private WebElement copyprojectsfromanexistingcustomerDropdownlist;
	
	@FindBy (xpath = "//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[.='Cancel'][@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public FWPom_ActitimeCreateNewCustomerPage(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernameMethod() throws IOException
	{
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value = 'Lynda'", entercustomernameTextfield);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")));
		entercustomernameTextfield.sendKeys(FWGen_ExcelLibraryActitime.getcellvalue(excel_path, sheet_name,1, 2));
	}
	/*
	public void entercustomerdescriptionMethod()
	{
		entercustomerdescriptionTextfield.sendKeys("Customer description");
	}
	*/
	public void createcustomerMethod() throws InterruptedException
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createcustomerButton);
		Thread.sleep(3000);
	}
	
	public void cancelMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", cancelButton);
	}
	
	
	
}

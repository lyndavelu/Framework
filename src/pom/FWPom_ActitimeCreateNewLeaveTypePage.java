package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FWPom_ActitimeCreateNewLeaveTypePage 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Leave Type Name']")
	private WebElement enterleavetypenameTextfield;
	
	@FindBy (xpath = "//input[@id='leaveTypeLightBox_rateCoefficient']")
	private WebElement enterleavehourrateTextfield;
	
	@FindBy (xpath = "//input[@id='processLeaveTimeCheckbox_createPopup']")
	private WebElement processleavetimeCheckbox;
	
	@FindBy (xpath ="//input[@id='asPtoRadioButton_createPopup']")
	private WebElement asPTORadioButton;
	
	@FindBy (xpath = "//input[@id='ptoCoefficientInput_createPopup']")
	private WebElement assickdaysRadioButton;
	
	@FindBy (xpath = "(//span[.='Create Leave Type'])[2]")
	private WebElement createleavetypeButton;
	
	@FindBy (xpath = "(//div[.='Cancel'])[2]")
	private WebElement cancelButton;
	
	public FWPom_ActitimeCreateNewLeaveTypePage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterleavetypenameMethod()

	{
		enterleavetypenameTextfield.sendKeys("LV Sick");
	}
	
	public void enterleavehourrateMethod()

	{
		enterleavehourrateTextfield.sendKeys("1.5");
	}
	
	public void processleavetimeMethod()

	{
		//processleavetimeCheckbox.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", processleavetimeCheckbox);
	}
	
	public void asPTOMethod()

	{
		//asPTORadioButton.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", asPTORadioButton);
	}
	
	public void assickdaysMethod()

	{
		//assickdaysRadioButton.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", assickdaysRadioButton);
	}
	
	public void createleavetypeMethod()

	{
		//createleavetypeButton.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createleavetypeButton);
	}
	
	public void cancelMethod()

	{
		//cancelButton.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", cancelButton);
	}
}

package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FWPom_ActitimeTasksPage 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement newprojectLink;
	
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement newtaskLink;
	
	@FindBy(xpath="//div[.='Import Tasks from CSV']")
	private WebElement importtasksfromcsvButton;
	
	@FindBy(xpath = "(//div[.='QSpiders']/..//div[@class='editButton']")
	private WebElement editcustomerLink;
	
	@FindBy (xpath ="(//div[.='Lynda'])[1]")
	private WebElement selectcustomerButton;
	
	@FindBy(xpath = "//div[.='Lynda']/../..//div[@class='editButton']")
	private WebElement clickCustomerLink;
	
	@FindBy(xpath ="(//input[@placeholder ='Start typing name ...'])[1]")
	private WebElement searchcustomerTextfield;
	
	@FindBy(xpath="(//span[.='Lynda'])[1]")
	private List<WebElement> customerList;
	
	public FWPom_ActitimeTasksPage(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addnewButton);
	}
	
	public void newCustomerMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newcustomerLink);
	}
	
	public void newProjectMethod()
	{
		newprojectLink.click();
	}
	
	public void newtaskMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newtaskLink);
	}
	
	public void  editcustomerMethod()
	{
		editcustomerLink.click();
	}
	
	public void selectcustomerMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", selectcustomerButton);
	}
	
	public void clickcustomerMethod()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clickCustomerLink);
	}
	
	public void searchcustomerMethod() throws InterruptedException
	{
		searchcustomerTextfield.sendKeys("Lynda");
		Thread.sleep(3000);
	}
	
	public void customerlistMethod()
	{
		for(int i=0; i<customerList.size();i++)
		{
			if(customerList.get(i).getText().equalsIgnoreCase("Lynda"))
			{
				customerList.get(i).click();
				break;
			}
		}
	}
}
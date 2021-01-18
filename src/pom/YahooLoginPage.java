package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_AutoConstantYahoo;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibraryYahoo;

public class YahooLoginPage extends FWGen_BasePage implements FWGen_AutoConstantYahoo
{
	@FindBy (xpath="//input[@placeholder='Email address or phone number']")
	private WebElement emailTextfield;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	private WebElement passwordTextfield;
	
	public YahooLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logindetails() throws IOException
	{
		emailTextfield.sendKeys(FWGen_ExcelLibraryYahoo.getcellvalue(excel_path, sheet_name,2, 0));
		passwordTextfield.sendKeys(FWGen_ExcelLibraryYahoo.getcellvalue(excel_path, sheet_name,2, 1));
	}	
}

package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_AutoConstantFB;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibraryLogin;

public class FacebookLoginPage extends FWGen_BasePage implements FWGen_AutoConstantFB
{
	@FindBy (xpath="//input[@placeholder='Email address or phone number']")
	private WebElement emailTextfield;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	private WebElement passwordTextfield;
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logindetails() throws IOException
	{
		emailTextfield.sendKeys(FWGen_ExcelLibraryLogin.getcellvalue(excel_path, sheet_name,1, 0));
		passwordTextfield.sendKeys(FWGen_ExcelLibraryLogin.getcellvalue(excel_path, sheet_name,1, 1));
	}	
}

package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_AutoConstantActitime;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibraryActitime;

public class FWPom_ActitimeLoginPage extends FWGen_BasePage implements FWGen_AutoConstantActitime
{
	@FindBy(xpath ="//input[@name='username']")
	private WebElement usernameTextfield;

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement  loginButton;
	
	public FWPom_ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void actitimeloginMethod() throws IOException
	{
		usernameTextfield.sendKeys(FWGen_ExcelLibraryActitime.getcellvalue(excel_path, sheet_name,1, 0));
		passwordTextfield.sendKeys(FWGen_ExcelLibraryActitime.getcellvalue(excel_path, sheet_name,1, 1));
		loginButton.click();
	}	
}

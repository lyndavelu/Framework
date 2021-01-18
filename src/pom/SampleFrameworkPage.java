package pom;

//The reusable components in AutoConstants, BasePage and ExcelLibrary (Static) are implemented in the pom class
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FWGen_AutoConstant;
import generics.FWGen_BasePage;
import generics.FWGen_ExcelLibrary;

//Had to call AutoConstant an Interface as cannot extend (inherit) multiple classes in Java
public class SampleFrameworkPage extends FWGen_BasePage implements FWGen_AutoConstant
{
	//Declaration of Elements
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileTextfield;
	
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement remembermeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy(xpath="//textarea")
	private WebElement addressTextarea;
	
	//Initialisation of Elements - need to create a constructor of type WebDriver
	public SampleFrameworkPage(WebDriver driver)
	{
		//perform initialisation by calling the initElements method of PageFactory class 
		PageFactory.initElements(driver, this);
	}
	
	//perform operation by creating a non-static Method
	public void submitdetails() throws IOException
	{
		//Details to submit are added below. Need to fetch data from excel spreadsheet - code for this in ExcelLibrary class which needs to bve declared as Static so can be used here.
		//Details of spreadsheet is stored in AutoConstant interface so needs be implemented
		firstnameTextfield.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		lastnameTextfield.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		usernameTextfield.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 2));
		passwordTextfield.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 3));
		emailTextfield.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 4));
		mobileTextfield.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 5));
		femaleRadioButton.click();
		remembermeCheckbox.click();
		selectbyvisibletext(countrycodeDropdownlist, "+91");
		addressTextarea.sendKeys(FWGen_ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 6));		
	}
	
	
	
	
}

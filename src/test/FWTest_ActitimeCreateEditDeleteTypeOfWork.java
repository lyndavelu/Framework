package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generics.FWGen_AutoConstantActitime;
import generics.FWGen_BasePage;
import generics.FWGen_BaseTestActitime;
import pom.FWPom_ActitimeCreateNewTypeofWorkPage;
import pom.FWPom_ActitimeEditTypeofWorkPage;
import pom.FWPom_ActitimeHomePage;
import pom.FWPom_ActitimeSettingsPage;
import pom.FWPom_ActitimeTypesofWorkPage;

public class FWTest_ActitimeCreateEditDeleteTypeOfWork extends FWGen_BaseTestActitime
{
	@Test
	public void CreateTOW() throws InterruptedException, IOException
	{
		//Create New type of Work
		FWPom_ActitimeHomePage home = new FWPom_ActitimeHomePage(driver);
		home.settingsMethod();

		FWPom_ActitimeSettingsPage work = new FWPom_ActitimeSettingsPage(driver);
		work.typesofworkMethod();

		FWPom_ActitimeTypesofWorkPage type = new FWPom_ActitimeTypesofWorkPage (driver);
		type.createtypeofworkMethod();

		FWPom_ActitimeCreateNewTypeofWorkPage newtype = new FWPom_ActitimeCreateNewTypeofWorkPage(driver);
		newtype.entertypeofworknameMethod();
		newtype.selectbillableCategoryMethod();
		newtype.enterbillingrateMethod();
		newtype.createtypeofworkMethod();
	}
	@Test
	public void editTOW() throws IOException
	{
		//Edit TOW
		FWPom_ActitimeTypesofWorkPage type = new FWPom_ActitimeTypesofWorkPage (driver);
		type.selecttypeofworkMethod();

		FWPom_ActitimeEditTypeofWorkPage edit = new FWPom_ActitimeEditTypeofWorkPage (driver);
		edit.edittypeofworknameMethod();
		edit.savechangeMethod();
	}
	@Test(dependsOnMethods= "CreateTOW")
	public void DeleteTOW() throws InterruptedException
	{
		//Delete TOW
		FWPom_ActitimeTypesofWorkPage type = new FWPom_ActitimeTypesofWorkPage (driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains (text(),'Testing123')]/../..//a[contains(text(),'delete')]")));
		type.deletetypeofworkMethod();
		Thread.sleep(3000);		
	}
	
	
	
}

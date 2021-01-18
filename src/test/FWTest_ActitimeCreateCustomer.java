package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.FWGen_BaseTest;
import generics.FWGen_BaseTestActitime;
import pom.FWPom_ActitimeCreateNewCustomerPage;
import pom.FWPom_ActitimeHomePage;
import pom.FWPom_ActitimeTasksPage;

public class FWTest_ActitimeCreateCustomer extends FWGen_BaseTestActitime 
{
	@Test
	public void customer() throws InterruptedException, IOException
	{

		FWPom_ActitimeHomePage home = new FWPom_ActitimeHomePage (driver);
		home.tasksMethod();

		FWPom_ActitimeTasksPage task = new FWPom_ActitimeTasksPage (driver);
		task.addnewMethod();
		task.newCustomerMethod();

		FWPom_ActitimeCreateNewCustomerPage customer = new FWPom_ActitimeCreateNewCustomerPage(driver);
		customer.entercustomernameMethod();
		customer.createcustomerMethod();
	}
}

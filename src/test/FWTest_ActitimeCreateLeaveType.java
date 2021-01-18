package test;

import org.testng.annotations.Test;


import generics.FWGen_BaseTestActitime;
import pom.FWPom_ActitimeCreateNewLeaveTypePage;
import pom.FWPom_ActitimeHomePage;
import pom.FWPom_ActitimeLeaveTypesPage;
import pom.FWPom_ActitimeSettingsPage;

public class FWTest_ActitimeCreateLeaveType extends FWGen_BaseTestActitime
{
	@Test
	public void CreateLeaveType() throws InterruptedException
	{
		//Create New Leave Type
		FWPom_ActitimeHomePage home = new FWPom_ActitimeHomePage(driver);
		home.settingsMethod();

		FWPom_ActitimeSettingsPage leave = new FWPom_ActitimeSettingsPage(driver);
		leave.leavetypesMethod();

		FWPom_ActitimeLeaveTypesPage type = new FWPom_ActitimeLeaveTypesPage (driver);
		type.createleavetypeMethod();

		FWPom_ActitimeCreateNewLeaveTypePage newleave = new FWPom_ActitimeCreateNewLeaveTypePage (driver);
		newleave.enterleavetypenameMethod();
		newleave.enterleavehourrateMethod();
		newleave.processleavetimeMethod();
		newleave.assickdaysMethod();
		newleave.createleavetypeMethod();
	}
}

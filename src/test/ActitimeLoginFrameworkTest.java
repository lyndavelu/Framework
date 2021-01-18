package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.FWGen_BaseTestActitime1;
import pom.FWPom_ActitimeLoginPage;

public class ActitimeLoginFrameworkTest extends FWGen_BaseTestActitime1
{
	//object creation and method calling will be in every test class so need to create obj of pom class
	@Test
	public void login() throws IOException
	{
		FWPom_ActitimeLoginPage login=new FWPom_ActitimeLoginPage(driver);
		login.actitimeloginMethod();	
	}	
}

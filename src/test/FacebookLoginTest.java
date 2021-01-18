package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.FWGen_BaseTestFB;
import pom.FacebookLoginPage;

public class FacebookLoginTest extends FWGen_BaseTestFB
{
	//object creation and method calling will be in every test class so need to create obj of pom class
	@Test
	public void login() throws IOException
	{
		FacebookLoginPage fblogin=new FacebookLoginPage(driver);
		fblogin.logindetails();	
	}	
}

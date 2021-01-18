package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.FWGen_BaseTestFB;
import generics.FWGen_BaseTestYahoo;
import pom.FacebookLoginPage;
import pom.YahooLoginPage;

public class YahooLogin extends FWGen_BaseTestYahoo
{
	//object creation and method calling will be in every test class so need to create obj of pom class
	@Test
	public void login() throws IOException
	{
		YahooLoginPage yhlogin=new YahooLoginPage(driver);
		yhlogin.logindetails();	
	}	
}

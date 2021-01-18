package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.FWGen_BaseTest;
import pom.SampleFrameworkPage;

public class SampleFrameworkTest extends FWGen_BaseTest
{
	//object creation and method calling will be in every test class so need to create obj of pom class
	@Test
	public void submit() throws IOException
	{
		SampleFrameworkPage sample=new SampleFrameworkPage(driver);
		sample.submitdetails();		
	}	
}

package generics;

//Store all reusable Methods

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FWGen_BasePage 
{
	
	public void selectbyvisibletext(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void movetoelement(WebElement target, WebDriver driver)
	{
	
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public void enterrobot() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void alertaccept(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	public void dismissMethod(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}

	
	
}

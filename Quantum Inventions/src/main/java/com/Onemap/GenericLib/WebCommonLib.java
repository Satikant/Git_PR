package com.Onemap.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class WebCommonLib extends BaseClass{
	public void PageToLoad()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
    public void RightClickAction(WebElement element) {
	 Actions act=new Actions(driver);
		 act.contextClick(element).build().perform();
    }
    public void Dropdowns(WebElement element) {
    	Select select =new Select(element);
    	select.deselectByValue("value");
    }
    
}

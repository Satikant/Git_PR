package com.Onemap.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Onemap.GenericLib.BaseClass;
import com.Onemap.GenericLib.Constants;
import com.Onemap.GenericLib.WebCommonLib;

public class Homepage{
	@FindBy(xpath="//div[@class='close_btn']/a/span")
	private WebElement closeBtn;
public void Homepageredirect()
{
	BaseClass.driver.get(Constants.URL);
	closeBtn.click();
	WebCommonLib wlib=new WebCommonLib();
	wlib.PageToLoad();
	
	
}


}

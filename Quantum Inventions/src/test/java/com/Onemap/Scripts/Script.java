package com.Onemap.Scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Onemap.GenericLib.BaseClass;
import com.Onemap.ObjectRepo.Homepage;
import com.Onemap.ObjectRepo.WidgetBar;

@Listeners(com.Onemap.GenericLib.SampleListenr.class)
public class Script extends BaseClass{
	@Test
	public void Scripting() throws Throwable
	{
		Homepage hpage=PageFactory.initElements(BaseClass.driver, Homepage.class);
		hpage.Homepageredirect();
		WidgetBar wbar=PageFactory.initElements(driver, WidgetBar.class);
		wbar.Menus();
		
	}
	

}

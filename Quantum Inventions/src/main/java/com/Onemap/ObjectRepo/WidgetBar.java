package com.Onemap.ObjectRepo;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.Onemap.GenericLib.BaseClass;
import com.Onemap.GenericLib.WebCommonLib;


public class WidgetBar extends BaseClass{
	/* Action on widget to appear*/
	@FindBy(xpath="//div[@id='widgetbar']/a")
	private WebElement widget;
	/*Action on a menu on Navbar*/
	@FindBy(xpath="//div[@class='mobile_view_display']/div[4]")
	private WebElement MenuDisplay;
	/*Action on Alert button */
	@FindBy(xpath="//div[@class='swal2-buttonswrapper']/button[1]")
	private WebElement Btnswrapper;
	/*Enter location */
	@FindBy(id="search-text")
	private WebElement locationsearch;
	/*Click on dronecheckbox*/
	@FindBy(xpath="//div[@class='themes-options']/div[7]")
	private WebElement Dronecheckbox;
	
	@FindBy(xpath="//div[@class='swal2-buttonswrapper']/button[2]")
	private WebElement Showresults;
	@FindBy(xpath="//div[@class='leaflet-pane leaflet-marker-pane']/img[1]")
	private WebElement markerpane;
	
	@FindBy(xpath="//div[@class='swal2-buttonswrapper']/button[1]")
	private WebElement Enterlocation;
	/*Search for the description in the page*/
    @FindBy(xpath="//div[@class='themes-item description']/p[2]")
    private WebElement locdescription;
	/*Action on Navigate */
    @FindBy(xpath="//div[@class='hyperlink_overall']/a[text()='Navigate']")
	private WebElement Navigate;
    @FindBy(id="navigate")
    private WebElement Navigation;
    /*Copy link*/
    @FindBy(xpath="//div[@class='copybtn_blue']")
    private WebElement Link;
  
public void Menus() throws Throwable
{
	WebCommonLib wlib=new WebCommonLib();
	wlib.PageToLoad();
	widget.click();
	MenuDisplay.click();	
	Btnswrapper.click();
	Dronecheckbox.click();
	Showresults.click();
	widget.click();
	locationsearch.sendKeys("Pioneer Hub");	
	Thread.sleep(3000);
	locationsearch.sendKeys(Keys.ENTER);
	wlib.RightClickAction(markerpane);
	Navigation.click();
	Showresults.click();
	Thread.sleep(3000);
	//copy link to clipboard
	Link.click();
	// extracting the text that was copied to the clipboard
	String linkText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); 
	Reporter.log(linkText,true);
}
}

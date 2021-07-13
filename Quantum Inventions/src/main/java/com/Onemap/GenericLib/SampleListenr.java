package com.Onemap.GenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListenr implements ITestListener{
	public void onTestFailure(ITestResult ss) {
		String FailedTC=ss.getMethod().getMethodName();
		EventFiringWebDriver edr=new EventFiringWebDriver(BaseClass.driver);
		File Exp=edr.getScreenshotAs(OutputType.FILE);
		File Act=new File("./Screenshots/"+FailedTC+".png");
		try {
			FileUtils.copyFile(Exp, Act);
		}
		catch (IOException e) {
			System.out.println(e.getMessage()+FailedTC);
		}
			System.out.println("Screenshot has Taken");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}




}

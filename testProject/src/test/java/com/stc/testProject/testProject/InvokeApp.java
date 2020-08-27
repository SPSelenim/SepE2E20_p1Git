package com.stc.testProject.testProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeApp {

	WebDriver driver=null;	  
	String AppPath="E:\\SeleniumTraining1\\TestingApp.html";
	String ChrPath="E:\\SeleniumTraining1\\Drivers\\chromedriver.exe";

	@Test
  public void f() {

System.setProperty("webdriver.chrome.driver", ChrPath);
try
{
	driver=new ChromeDriver();
	driver.get(AppPath);
driver.manage().window().maximize();
Thread.sleep(2000);
}

catch(Exception e)
{
	System.out.println(e.getMessage());
}

  }
}

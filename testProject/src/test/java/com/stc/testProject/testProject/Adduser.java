package com.stc.testProject.testProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
//Date
public class Adduser extends InvokeApp {
  @Test
  public void f() {
	 init();
	 try
	 {
		 System.out.println("Second Started");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("UN")).sendKeys("Helllooooo");
	 Thread.sleep(2000);
	 driver.findElement(By.id("PWD")).sendKeys("Helllooooo");
	 Thread.sleep(2000);
driver.quit();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
  }
}

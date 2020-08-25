package com.snearchitect.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.snearchitect.base.TestBase;

public class Launchtest extends TestBase {
	
	@Test
	public void launchgoogle()
	{
		driver.findElement(By.xpath(OR.getProperty("googlesearchbox"))).click();
		driver.findElement(By.xpath(OR.getProperty("searchbtn"))).click();

	}
	

}

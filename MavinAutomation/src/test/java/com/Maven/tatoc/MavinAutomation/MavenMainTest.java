package com.Maven.tatoc.MavinAutomation;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MavenMainTest extends BasicCourse {
	
static WebDriver driver;
	
	@Test(priority = 0)
	public void verifyBasicCourseSelection() {
		Assert.assertTrue(new BasicCourse().basicCourseSelection(driver));
	}
	
	@Test(priority = 1)
	public void verifyGreenBoxSelected() {
		Assert.assertTrue(new GridGate().clickBox(driver));
	}
	
	@Test(priority = 2)
	public void verifyBoxColorSame() {
		Assert.assertTrue(new FrameDungeon().colorMatching(driver));
	}
	
	@Test(priority = 3)
	public void verifyDragPerformed() {
		Assert.assertTrue(new DragAround().drag(driver));
	}
	
	@Test(priority = 4)
	public void verifyTextEnteredInPopupWindow() {
		Assert.assertTrue(new PopupWindows().launchPopupWindow(driver));
	}
	
	@Test(priority = 5)
	public void verifyCookieAdded() {
		Assert.assertTrue(new CookieHandling().addCookie(driver));
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashantkumarsingh\\eclipse-workspace\\MavinAutomation\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		driver.quit();
		
	} 
}

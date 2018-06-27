package com.Maven.tatoc.MavinAutomation;

 import java.util.ArrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class PopupWindows {

		public boolean launchPopupWindow(WebDriver driver) {
			driver.findElement(By.xpath("//a[text()='Launch Popup Window']")).click();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.cssSelector("#name")).sendKeys("Prashant Kumar Singh");
			driver.findElement(By.cssSelector("#submit")).click();
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath("//a[text()='Proceed']")).click();
			String expectedUrl = "http://10.0.1.86/tatoc/basic/cookie";
			String actualUrl = driver.getCurrentUrl();
			if (expectedUrl.equals(actualUrl)) {
				return true;
			}
			return false;
		}

	}

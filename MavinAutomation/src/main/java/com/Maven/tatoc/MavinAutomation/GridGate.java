package com.Maven.tatoc.MavinAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GridGate {

	public boolean clickBox(WebDriver driver) {
		driver.findElement(By.cssSelector("div[class='greenbox']")).click();
		String expectedUrl = "http://10.0.1.86/tatoc/basic/frame/dungeon";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)) {
			return true;
		}
		return false;
	}

}
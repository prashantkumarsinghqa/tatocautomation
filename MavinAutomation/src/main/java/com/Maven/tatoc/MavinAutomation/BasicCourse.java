package com.Maven.tatoc.MavinAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicCourse {
	
	public boolean basicCourseSelection(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Basic Course']")).click();
		String expectedUrl = "http://10.0.1.86/tatoc/basic/grid/gate";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)) {
			return true;
		}
		return false;
			}
		}
	

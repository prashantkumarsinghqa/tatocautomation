package com.Maven.tatoc.MavinAutomation;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Cookie;
	import org.openqa.selenium.WebDriver;

	public class CookieHandling {

		public boolean addCookie(WebDriver driver) {
			driver.findElement(By.xpath("//a[text()='Generate Token']")).click();
			String token = driver.findElement(By.cssSelector("span[id='token']")).getText();
			String tokenValue = token.substring(7);
			Cookie cookie = new Cookie("Token", tokenValue);
			driver.manage().addCookie(cookie);
			driver.findElement(By.xpath("//a[text()='Proceed']")).click();
			String expectedUrl = "http://10.0.1.86/tatoc/end";
			String actualUrl = driver.getCurrentUrl();
			if (expectedUrl.equals(actualUrl)) {
				return true;
			}
			return false;
		}

	}


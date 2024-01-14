package com.qa.easy_ques1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Rediff_getTitle {
	
	public WebDriver driver;
	
	
@Test
public void getTitle() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	String actualTitle = driver.getTitle();
	String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

	if (actualTitle.equals(expectedTitle)) {
		System.out.println("Landing Page is correct");
		driver.findElement(By.className("signin")).click();
	} else {
		System.out.println("Landing Page is incorrect");
	}

}

@AfterMethod
public void teardown() {
	driver.quit();
	
}

}
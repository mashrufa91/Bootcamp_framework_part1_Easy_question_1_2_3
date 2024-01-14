package com.qa.easy_ques1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_navigate_different_page {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");		
	}
	
	@Test
	public void getTitle() {
		
	    driver.findElement(By.linkText("Shopping")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//img[@class='redlogo vmid']")).isDisplayed());
	    System.out.println("user is navigated to the shopping page");
}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
}
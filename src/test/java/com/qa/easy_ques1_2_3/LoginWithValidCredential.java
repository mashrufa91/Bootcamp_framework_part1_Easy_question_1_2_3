package com.qa.easy_ques1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithValidCredential {
public WebDriver driver;
	

@BeforeMethod
public void setup() {
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	
}

@Test

public void loginWithValidCredentials() throws Exception {

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");

	driver.findElement(By.id("login-button")).click();
	
	Assert.assertTrue(driver.findElement(By.className("product_label")).isDisplayed());

}

@AfterMethod
public void teardown() {
	driver.quit();
	
}
}

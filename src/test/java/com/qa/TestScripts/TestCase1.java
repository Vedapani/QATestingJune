package com.qa.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestCase1 {
	
	
	// we will write Test method
	@Test  // annotation of testnG that will execute your test cases
	public void openbrowserTest() throws InterruptedException
	{
		// test steps to be executed
		
		// Step1: Open Chrome browser
		
	WebDriver driver= new ChromeDriver();
	// Step 2: Enter the URL, open the app
	
	driver.get("http://34.66.164.22:49153/addressbook/");
	
	// Step 3: maximize the browser window
	
	driver.manage().window().maximize();
	
	// get the title of the page and save in the string variable
	
	String title= driver.getTitle();
	System.out.println(title);  // Addressbook
	
	Assert.assertEquals(title, "Addressbook", "title donot match");
	
	System.out.println("title is correct");
	
	System.out.println(driver.getCurrentUrl());
	
	// Find an element on the webpage and perform an action on it
	
	// 1. address of the element on the page
	// how to find the element address??? ==> Locators
	
	// Locator : XPATH (relative XPATH) : //*[@id="addressbook-1376863011"]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div
	
	// //*[@id="gwt-uid-5"]
	Thread.sleep(3000);
	
	driver.
	findElement(By.xpath("//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).
	click();
	
Thread.sleep(2000)	;
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("Sonal");
		
	Thread.sleep(2000)	;
		//
	
	///html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input
		
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Mittal");
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/input")).sendKeys("abc@gmail.com");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[6]/td[3]/div/input")).sendKeys("5/19/21,");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
	
	Thread.sleep(2000);
	
	driver.close();	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}

}

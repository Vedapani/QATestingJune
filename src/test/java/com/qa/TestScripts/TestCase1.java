package com.qa.testphpapp;

import org.openqa.selenium.By;
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;



public class Testphpapplication {

	public void setup() throws InterruptedException{
		//Start chrome browser
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//open PHP application on chrome browser
	driver.get("http://52.66.187.131:49154/");
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath(/html/body/div/header/nav/a[2])).click();
	driver.close();
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}

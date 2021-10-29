package com.hrms.practiseTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;


/*This testcase is to check how to perform 
click activity using keys concept of webDriver */
public class TC_KB_WebDriver {
	public static void main(String args[]) throws Exception {
	//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.google.com");
			//Keyboard clicks using Webdriver
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(2000);
			//Webdriver keys activity
			driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.close();	
}
}

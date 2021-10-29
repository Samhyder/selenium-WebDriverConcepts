package com.hrms.practiseTestCases;

import java.io.File;

//common.io jar file provides the functionality to copy screenshots to a file
import org.apache.commons.io.FileUtils;
//below package helps in object Identifications
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;//required for file output type
import org.openqa.selenium.TakesScreenshot;//for screenshot functionality
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;//for mouseover

//Understanding how to take a screenshot.
public class TC_Screenshot {
	public static void main(String []args) throws Exception
	{
		//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee123")).click();
		Thread.sleep(2000);
		System.out.println("clicked on submenu");
		driver.findElement(By.linkText("Logout")).click();
		}
		catch(Exception e){
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("Z:\\TestResults.png"));
		}
		driver.quit();
	}
}
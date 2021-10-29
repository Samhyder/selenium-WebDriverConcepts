package com.hrms.practiseTestCases;

//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;
//below package helps in object Identifications
import org.openqa.selenium.By;
//below package helps in performing mouse over on a webpage.
import org.openqa.selenium.interactions.Actions;

/*This testcase is to check how to Login,Logout,Verify Title & 
to perform mouseover in a web application. */
public class TC002 {
	public static void main(String []args) throws Exception
	{
		//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(2000);
		System.out.println("Application Opened");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login completed");
		//MouseOver
		Actions ac  = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("MouseOver Completed");
		Thread.sleep(2000);
		//Click on Submenu
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked on Submenu");
		Thread.sleep(2000);
	 	driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		System.out.println("Logout Completed");
		driver.close();	
	}
}

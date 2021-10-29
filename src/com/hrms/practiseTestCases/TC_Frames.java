package com.hrms.practiseTestCases;

//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;
//below package helps in object Identifications
import org.openqa.selenium.By;

/*This testcase is to understand how to approach script issues by using
 iframes in a web application. */
public class TC_Frames {
	public static void main(String []args) throws Exception
	{
		//For selenium to access chrome, chromedriver.exe acts as 
		//a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(2000);
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(2000);
		//iframes
		//Enter into the iframe
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value = 'Add']")).click();
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("New Emp Added");
		Thread.sleep(2000);
		//exit from the iframe
		driver.switchTo().defaultContent();
	 	driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		System.out.println("Logout Completed");
		driver.close();	
	}
}

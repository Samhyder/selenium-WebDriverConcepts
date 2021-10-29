package com.hrms.practiseTestCases;

//below package helps in object Identifications
import org.openqa.selenium.By;
//Below package is useful for utilizing the functions of javascript Executor
import org.openqa.selenium.JavascriptExecutor;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps to create an object of type WebElement which is
//returned by findElement function of driver object.
import org.openqa.selenium.WebElement;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;

/*Writing this test case to help understand how javascript executor helps
 * as an alternative to other functionalities such as Robot class of java
 * and click functionalities present in the WebDriver class */
public class TC_JSE {
	public static void main(String []args) throws Exception
	{
		//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.xpath("//input[@name = 'txtUserName']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		//using JavaScript Executor to click on login btn
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);
		Thread.sleep(2000);
		System.out.println("Login Completed");
		Thread.sleep(2000);
		
		//Using JSE to click on logout btn
		WebElement logout = driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", logout);
		System.out.println("Logout Completed");
		driver.close();	
	}
}

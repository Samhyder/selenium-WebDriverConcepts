package com.hrms.practiseTestCases;

//below package helps in object Identifications
import org.openqa.selenium.By;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;
//below package helps in utilizing the functionalities related to explicit wait
import org.openqa.selenium.support.ui.ExpectedConditions;
//below package is useful for creating an object to utilize explicit wait functionality.
import org.openqa.selenium.support.ui.WebDriverWait;
//Below package is used for defining units of time like secs,mins,hrs etc.
import java.util.concurrent.TimeUnit;


/*This testcase is to learn what is Implicit wait and 
 * explicit wait */
public class TC_WaitStmts {
	public static void main(String args[]) throws Exception {
	//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Thread.sleep(1000);
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	//Understanding Explicit Wait condition: 
	//Wait until login btn needs to be loaded.
	WebDriverWait wait = new WebDriverWait(driver,3000);
	wait.until(ExpectedConditions.elementToBeClickable(
			driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	//Understanding Implicit Wait Condition.
	//Wait until the page is loaded.
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	System.out.println("Logout Completed");
	driver.close();
}
}
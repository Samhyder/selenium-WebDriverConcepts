package com.hrms.practiseTestCases;

//below package helps in object Identifications
import org.openqa.selenium.By;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/*This testcase is to check how to perform 
click activity using Robot class of java. */
public class TC_Selects {
	public static void main(String args[]) throws Exception {
	//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Thread.sleep(1000);
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
	Thread.sleep(2000);
	//Enter into frame
	driver.switchTo().frame("rightMenu");
	Select st = new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp. ID");
	Thread.sleep(1000);
	driver.findElement(By.name("loc_name")).sendKeys("0001");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value = 'Search']"));
	Thread.sleep(1000);
	driver.findElement(By.name("chkLocID[]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value = 'Delete']")).click();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(1000);
	driver.close();
	
	
	}
}

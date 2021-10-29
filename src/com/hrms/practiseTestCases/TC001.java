package com.hrms.practiseTestCases;

//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;


//This testcase is to check how to open an application and close an application
public class TC001 {
	public static void main(String []args) throws Exception
	{
		//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		driver.close();	
	}
}

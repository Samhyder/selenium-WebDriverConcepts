package com.hrms.practiseTestCases;

//importing the package to create a ArrayList Object
import java.util.ArrayList;

//below package helps in object Identifications
import org.openqa.selenium.By;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps to create an object of type WebElement which is
//returned by findElement function of driver object.
import org.openqa.selenium.WebElement;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;

//Point1: getWindowHandle method helps in getting info about only one open/active tab in browser.
//Point2: getWindowHandles method helps in getting info about all the open tabs in a browser.
public class TC_WindowHandles{
public static void main(String []args) throws Exception{
	//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//First Window
	driver.navigate().to("file:///Z:/SoftwareTesting/Softwares/htmlFiles/multiplewindows.html");
	//second window
	driver.findElement(By.id("btn2")).click();
	//third Window
	driver.findElement(By.id("btn3")).click();
	
	ArrayList<String> windowsInfo = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windowsInfo.get(2));
	Thread.sleep(3000);
	//to close the current window use driver.close();
	//to close all the windows.
	driver.quit();
	}
}

package com.hrms.practiseTestCases;

import org.openqa.selenium.By;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;//to perform Mouseover functionality
import static org.testng.Assert.assertEquals;

/*Understanding Drag and drop */
public class TC_DragAndDrop {
	public static void main(String []args) throws Exception
	{
		//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		assertEquals("Droppable | jQuery UI",driver.getTitle());
		System.out.println("Title matched");
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close();	
	}
}

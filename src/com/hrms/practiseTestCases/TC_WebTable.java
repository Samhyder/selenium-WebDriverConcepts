package com.hrms.practiseTestCases;

//below package helps in object Identifications
import org.openqa.selenium.By;
//below package helps in accessing webdriver classes and methods
import org.openqa.selenium.WebDriver;
//below package helps in accessing chrome browser.
import org.openqa.selenium.chrome.ChromeDriver;

/*Webtable is known for tabular representation of data on a web page.
In order to retrieve count from a webtable we use size() method in association with
findelements method to get the count of the rows or columns or both row&column.*/

/*If we were to retrieve data from the cells in a webtable, we could do that by using
 * getText() method in association with findelement method to get the data present in a
 * cell of a webtable*/

public class TC_WebTable {
	public static void main(String []args) throws Exception{
		//For selenium to access chrome, chromedriver.exe acts as a mediator for accessing windows application.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\REHMATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///Z:/SoftwareTesting/Softwares/htmlFiles/WebTable.html");
		//Retrieving count in a webtable
		int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

		System.out.println("Row count is " + row);
		System.out.println("Column count is " + col);
		System.out.println("Row-column count is " + row_col);
	
		//retrieving data from a cell in a webtable
		String cell = driver.findElement(By.xpath("//*[@id = 'idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(cell);
		//Retrieving data from all the cells in a table
		for(int i = 1; i<row ; i++) {
			String data = driver.findElement(By.xpath("//*[@id = 'idCourse']/tbody/tr[" + i + "]")).getText();
			System.out.println(data);
		}
		driver.close();
	}
}

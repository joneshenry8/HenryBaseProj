package org.test.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\JonesHenry\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	
		WebElement amountsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement amountdest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(amountsrc, amountdest).perform();
	
	}
	
//	Alert alert=driver.switchTo().alert();
	
		
}

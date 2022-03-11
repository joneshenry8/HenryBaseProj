package org.test.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\JonesHenry\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		Actions a=new Actions(driver);
		WebElement course = driver.findElement(By.xpath("(//a[@class='mega-menu-link'])[1]"));
		a.moveToElement(course).perform();
//		a.click().perform();
		Thread.sleep(2000);
		WebElement appDev = driver.findElement(By.xpath("//a[text()='Application Development']"));
		a.moveToElement(appDev).perform();
		a.click().perform();
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

}
	
	
}
	

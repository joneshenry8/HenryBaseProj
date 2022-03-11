package org.test.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	
	public static ChromeDriver driver;
	public static Actions a;
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\JonesHenry\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		TakesScreenshot scc=(TakesScreenshot) driver;
		File srcc = scc.getScreenshotAs(OutputType.FILE);
		long time1 = System.currentTimeMillis();
		File dess=new File ("C:\\Users\\ELCOT\\eclipse-workspace\\JonesHenry\\ss\\"+time1+".png");	
		FileUtils.copyFile(srcc, dess);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
//		userName.sendKeys("jones");
//		String textUser = userName.getAttribute("value");
//		System.out.println(textUser);
		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
//		passWord.sendKeys("1234567");
//		String texPass = passWord.getAttribute("value");
//		System.out.println(texPass);
//		WebElement fbText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
//		String text1 = fbText.getText();
//		System.out.println(text1);
//		String attribute1 = fbText.getAttribute("innerText");
//		System.out.println(attribute1);
////		WebElement btnClick = driver.findElement(By.xpath("//button[@name='login']"));
////		btnClick.click();
//		
//		Actions a=new Actions(driver);
//		WebElement crctButn = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
////		a.moveToElement(crctButn).perform();
////		a.click(crctButn).perform();
////	
//		a.moveToElement(crctButn).click(crctButn).perform();
		
//		a.doubleClick(userName).perform();
//		a.contextClick(userName).perform();
//		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
//		a.click(passWord).perform();
//		a.contextClick(passWord).perform();
//		
//		for (int i = 0; i < 4; i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement newReg = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newReg.click();
		Thread.sleep(2000);
//		WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		Select s=new Select(dob);
//		s.selectByVisibleText("3");
//		
//		List<WebElement> getDob = s.getOptions();
//		System.out.println("allavlues......"+getDob.size());
//		
//		for (int i = 0; i < getDob.size(); i++) {
//			WebElement each = getDob.get(i);
//			String oneByOne = each.getText();
//			System.out.println(oneByOne);
//		}
		
//		for (WebElement eachText : getDob) {	
//			String oneByOne = eachText.getText();
//			System.out.println(oneByOne);
//			
//		}
		
		File source = scc.getScreenshotAs(OutputType.FILE);
		long time = System.currentTimeMillis();
		File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\JonesHenry\\ss\\"+time+".png");
		FileUtils.copyFile(source, destination);
	
		
		
	}
	
	
	
	
}

package com.test.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// package.class

public class Sampleseltest {
	
		
		
		
		
		@BeforeMethod
		
		public void SetUp() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver ();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
					
		}
		
		
		@Test
		
	public void nameofthepagetitle() throws Throwable {	
			
			WebDriver driver= new ChromeDriver ();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
			WebElement Username = driver.findElement(By.name("username")) ;
			Username.sendKeys("Admin") ;
			Thread.sleep(10000);
			WebElement password = driver.findElement(By.name("password")) ;
			password.sendKeys("admin123") ;
			
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
			String	element = driver.getTitle();
			System.out.println("The name of the page is " + element);
			
			
		}  
		
		
		@AfterMethod
		
		public void logoutfromtheapplication()  {
			WebDriver driver= new ChromeDriver ();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
			WebElement Username = driver.findElement(By.name("username")) ;
			Username.sendKeys("Admin") ;
			WebElement password = driver.findElement(By.name("password")) ;
			password.sendKeys("admin123") ;
			
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
			
			
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/header[@class='oxd-topbar']/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();
			
			String	element = driver.getTitle();
			System.out.println("logoutfromapplication ");
		}
		
		
		@AfterClass
		
		public void closebrowser() {
			WebDriver driver= new ChromeDriver ();
			
			driver.quit();
			System.out.println("close browser");
		}
		
		
		@AfterTest
		
		public void deletecachecookiesanything() {
			System.out.println("deletecookies");
	
		}
	 
}

package com.test.seleniumtest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exwait {
	
	@BeforeMethod
	
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
				
	}
	

	
	
	
	
	
	
	
	
	
	@Test
public void nameofthepagetitle1() {	
		
		WebDriver driver = new ChromeDriver ();
		WebDriverWait X =  new WebDriverWait(driver, Duration.ofSeconds(0.5));
WebElement	a =	X.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))) ;
		System.out.println(a.isDisplayed());
		a.sendKeys("Admin");
WebElement	b =	X.until(ExpectedConditions.visibilityOfElementLocated(By.name("Password"))) ;
		System.out.println(b.isDisplayed());
	b.sendKeys("admin123");
		
	}	

		
}


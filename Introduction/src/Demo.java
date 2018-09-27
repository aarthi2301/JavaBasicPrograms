import java.io.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code....
		// create Driver object (WebDriver- Interface)
		//invoke .exe file for 3rd party browser drivers
		
				
		System.setProperty("webdriver.chrome.driver", "/home/ilan/Desktop/Aarthi_2018 Jobs/Udemy_Selenium course_2018/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println("Testing Ilan");
		driver.get("http://www.facebook.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); //it closes current browser
		//driver.quit(); //it closes all browser opened by selenium
		
		driver.findElement(By.id("email")).sendKeys("this is my key");
		
	    //driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//"));
		
		//TakesScreenshot tss = (TakesScreenshot)driver;
		//File source = tss.getScreenshotAs(OutputType.FILE);
		
		
		}
}

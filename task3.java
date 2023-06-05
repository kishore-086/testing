package com.tasks.day8.day_8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
		public static void main(String args[]) throws InterruptedException
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			
			 WebElement val = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
			 val.sendKeys("401");
			 WebElement sub = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
			 sub.click();
			 
			 Alert a=driver.switchTo().alert();
			 a.dismiss();
			 
			 val.clear();
			 Thread.sleep(5000);
			 val.sendKeys("402");
			 sub.click();
			 
			 a.accept();
			 
			 Alert b=driver.switchTo().alert();
			 String text = b.getText();
			 b.accept();
			 System.out.print(text);
			 driver.quit();
		
		}

	}

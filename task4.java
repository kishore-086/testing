package com.tasks.day8.day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		WebElement org = driver.findElement(By.xpath("//*[@id=\"source\"]"));
		org.sendKeys("Coimbatore");
		Thread.sleep(3000);
		org.sendKeys(Keys.ENTER);
		
		org.click();

		 
		  Thread.sleep(3000);
		WebElement des = driver.findElement(By.name("destination"));
		des.click();
		Thread.sleep(3000);
		des.sendKeys("Chidambaram");
		Thread.sleep(3000);
		des.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"todaydiv\"]/h4")).click();
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
		
		
	}
}

package testngProject.Day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class task1 {
	@Test
	  public void f() {
		  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver =new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  //task1
		  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		  String actualTitle=driver.getTitle();
		  Assert.assertEquals(actualTitle, "Guest Registration Form – User Registration");
		  driver.quit();
		  
	  }

}

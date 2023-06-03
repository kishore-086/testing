package testngProject.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
	public static void main( String[] args ) throws InterruptedException
	  {
		  	WebDriverManager.chromedriver().setup();
		      WebDriver driver=new ChromeDriver();
		      driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		      driver.manage().window().maximize();
		      driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("kishore");
		      driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("m");
		  	JavascriptExecutor js = (JavascriptExecutor)driver;
		  	js.executeScript("window.scrollBy(0,800)", "");
		      driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("kishore@gmail.com");
		      driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("4433");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	  }
	
}

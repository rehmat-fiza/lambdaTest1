package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lambdatest {
	
	WebDriver driver;
	

	
	 public void singleInputField() {
		 
	    	WebElement enterMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
			enterMessage.sendKeys("Hi , this is Rehmat here");
			WebElement getCheckedValue = driver.findElement(By.xpath("//button[@id='showInput']"));
			getCheckedValue.click();

	   	
	   }
	 
	 public void twoInputField() {
	    	WebElement getTextOne = driver.findElement(By.xpath("//input[@id='sum1']"));
			getTextOne.sendKeys("Hi!!!");
			WebElement getTextTwo = driver.findElement(By.xpath("//input[@id='sum2']"));
			getTextTwo.sendKeys("from Rehmat");
			WebElement getValue = driver.findElement(By.xpath("(//button[@type = 'button'])[2]"));
			getValue.click();
	    	
	    }

	

}

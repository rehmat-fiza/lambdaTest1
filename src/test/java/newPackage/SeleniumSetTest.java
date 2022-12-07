package newPackage;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import methods.Lambdatest;

public class SeleniumSetTest {
	
	WebDriver driver;
	Lambdatest objectrepo;
	Lambdatest objectrepo2;
	
	
	@BeforeTest
	public void setup()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	

	
	
	
	
	
	@Test(priority = 1)
	public void verifyPageTitleTest()throws InterruptedException {
    	String title = driver.getTitle();
    	System.out.println("The page title is:" +title);
    	
    	Assert.assertEquals(title, "Selenium Grid Online | Run Selenium Test On Cloud");
    		
	}
	
	@Test(priority =2)
    public void clickOnLink() {
   	WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() ='Simple Form Demo']"));
    	simpleFormDemo.click();
    	
  	
    
  }
	
	
	
	

    
    @Test(priority = 3)
   public void singleInputField() {
 
    	WebElement enterMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
		enterMessage.sendKeys("Hi , this is Rehmat here");
		WebElement getCheckedValue = driver.findElement(By.xpath("//button[@id='showInput']"));
		getCheckedValue.click();
		
		//String expectedMsg = "Hi , this is Rehmat here";
		String expectedMsg = "Your Message:";
		String actualMsg = driver.findElement(By.xpath("(//label[@class= 'font-semibold text-black text-size-15'])[1]")).getAttribute("class");
//		String actualMsg = driver.findElement(By.xpath("//p[contains(text(),'Hi , this is Rehmat here')]")).getAttribute("id");
//		WebElement msg = driver.findElement(By.xpath("//p[text() ='Hi , this is Rehmat here']"));
//		Assert.assertEquals(msg, "Hi , this is Rehmat here");
//		

		Assert.assertEquals(actualMsg, expectedMsg, "Text varification failed");
   	
   }
    
    @Test(priority = 4)
    public void twoInputField() {
    	WebElement getTextOne = driver.findElement(By.xpath("//input[@id='sum1']"));
		getTextOne.sendKeys("Hi!!!");
		WebElement getTextTwo = driver.findElement(By.xpath("//input[@id='sum2']"));
		getTextTwo.sendKeys("from Rehmat");
		WebElement getValue = driver.findElement(By.xpath("(//button[@type = 'button'])[2]"));
		getValue.click();
    	
    }
    
    
    
    
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
    

}

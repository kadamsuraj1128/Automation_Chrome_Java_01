package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_navigate_activeElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    
	    ChromeOptions	co=new ChromeOptions();
      
	     co.addArguments("--remote-allow-origins=*");
       
         WebDriver driver=new ChromeDriver(co);
         driver.manage().window().maximize();
         Thread.sleep(2000);
         
         driver.navigate().to("https://www.google.com/");
         driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
         Thread.sleep(2000);
         driver.navigate().back();
          
         driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
         Thread.sleep(2000);
         driver.navigate().refresh();
         driver.navigate().back();
         driver.navigate().forward();
         
         
	}

}




package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_navigate_activeElement{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    driver.navigate().forward();
	    driver.navigate().back();
	    driver.quit();
	    
	    
	    
	
	}

}

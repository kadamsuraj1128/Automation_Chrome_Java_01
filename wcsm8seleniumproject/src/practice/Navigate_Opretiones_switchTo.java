package practice;

import java.awt.Dimension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_Opretiones_switchTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Point targetPositin=new Point(350,450);
		driver.manage().window().setPosition(targetPositin);
		
	    Thread.sleep(2000);
	
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Automation testing",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
		
		
	}

}

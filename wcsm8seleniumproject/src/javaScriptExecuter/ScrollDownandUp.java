package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.instagram.com");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,800)");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-600)");

	}

}

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AirIndia_Booking_using_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.airindia.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@id='lblOneWay']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Pune, Lohegaon Airport, PNQ, India, IN",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='to']")).click();
		Thread.sleep(900);
		driver.switchTo().activeElement().sendKeys("Delhi, Indira Gandhi International Airport, DEL, India, IN",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_depdateeu1']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(" ui-datepicker-week-end  ui-datepicker-current-day"));
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		driver.switchTo().activeElement().sendKeys("8",Keys.TAB);
	}

}

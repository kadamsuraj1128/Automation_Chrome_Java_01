package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_Booking_using_contains_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		 
		driver.navigate().to("https://www.redbus.in/bus-tickets");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'txtSource')]")).click();
		Thread.sleep(4000);
		driver.switchTo().activeElement().findElement(By.xpath("//input[contains(@id,'txtSource')]")).sendKeys("Sangamwadi, Pune",Keys.ENTER);
		Thread.sleep(2000);
		driver.switchTo().activeElement().findElement(By.xpath("//input[contains(@id,'txtDestination')]")).sendKeys("Surat",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		

	}

}

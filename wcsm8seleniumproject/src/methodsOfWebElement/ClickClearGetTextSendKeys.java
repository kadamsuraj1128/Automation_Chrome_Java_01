package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickClearGetTextSendKeys {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.shoppersstack.com/user-signin");
	WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
	username.sendKeys("surajk30june@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	password.sendKeys("suraj@123");
	//driver.findElement(By.xpath("//span[.='Login']")).click();
	Thread.sleep(1000);
	username.clear();
	Thread.sleep(1000);
	password.clear();
	Thread.sleep(3000);
	

	}

}

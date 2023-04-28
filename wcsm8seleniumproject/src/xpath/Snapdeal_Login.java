package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("surajk30june@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("surajk@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='userSignup']")).click();
		Thread.sleep(4000);
        driver.quit();
	}

}

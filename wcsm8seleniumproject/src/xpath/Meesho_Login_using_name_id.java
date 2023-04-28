package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Meesho_Login_using_name_id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://supplier.meesho.com/panel/v3/new/root/login");
		Thread.sleep(2000);
		driver.findElement(By.id("mui-1")).sendKeys("surajk30june@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("suraj@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}

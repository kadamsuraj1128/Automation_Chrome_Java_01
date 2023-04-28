package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_order_using_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	   WebDriver	driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	   Thread.sleep(8000);
	   driver.findElement(By.xpath("//div[text()='3. MOTOROLA g72 (Meteorite Gre...']")).click();

	}

}

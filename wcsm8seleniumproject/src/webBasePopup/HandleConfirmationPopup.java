package webBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/Submit.html");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
		Thread.sleep(2000);
        driver.quit();

	}

}

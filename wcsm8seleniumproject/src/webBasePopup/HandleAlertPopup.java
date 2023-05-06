package webBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/Alrt.html");
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();

		Thread.sleep(2000);
		String text = al.getText();
		System.out.println(text);
		al.accept();
		Thread.sleep(2000);
		driver.quit();

	}

}

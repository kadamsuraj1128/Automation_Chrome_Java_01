package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter URL (Bluestone)
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		// move to coin
		WebElement targetElement = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetElement).perform();
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("Coins")).click();

	}

}

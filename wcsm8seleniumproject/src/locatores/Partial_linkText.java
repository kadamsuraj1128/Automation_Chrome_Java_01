package locatores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partial_linkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/Link.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Flipk")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}

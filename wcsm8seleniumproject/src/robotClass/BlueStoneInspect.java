package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BlueStoneInspect {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();

		Actions act = new Actions(driver);
		WebElement te = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		act.moveToElement(te).perform();
		Thread.sleep(2000);
		act.contextClick().perform();
		Robot robot = new Robot();

		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			if (i == 5) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		}
		Thread.sleep(4000);
		driver.quit();

	}

}

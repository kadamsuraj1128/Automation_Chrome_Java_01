package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsMultiSelectDropeDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/multiSelectStaticDropedown.html");
		WebElement dropeDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropeDown);
		for (int i = 0; i <= 4; i++) {
			if (i % 2 == 0) {
				Thread.sleep(2000);
				sel.selectByIndex(i);

			} else {
				System.out.println("Odd menue");
			}

		}

			Thread.sleep(2000);
			sel.deselectByValue("v3");
			Thread.sleep(1000);
			sel.deselectByValue("v1");
	        sel.deselectByVisibleText("Poha");
		    sel.deselectAll();

	}

}

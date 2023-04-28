package methodsOfWebDrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PENDING_FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Hp laptop");
		Thread.sleep(2000);
		List<WebElement> hpOptions = driver.findElements(By.xpath("//input[@class='_3704LK']"));
		for(int i=1;i<hpOptions.size();i++)
		{
			String values = hpOptions.get(i).getText();
			System.out.println(values);
			Thread.sleep(2000);
			
		}

	}

	
}

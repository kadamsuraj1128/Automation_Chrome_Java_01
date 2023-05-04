package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		driver.findElement(By.xpath("//a[.='Watch Jewellery ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Band']")).click();
		Actions act = new Actions(driver);
		WebElement targetElement = driver.findElement(By.xpath("//div[.='Filter by']"));
		targetElement.click();
		act.moveToElement(targetElement).perform();
        
        for(int i=0;i<2;i++)
        {  Thread.sleep(2000);
		   act.clickAndHold(targetElement).build().perform();
        }

	}

}

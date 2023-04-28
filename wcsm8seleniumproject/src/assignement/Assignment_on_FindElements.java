package assignement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_on_FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> nameOfmobail = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> prizeOfMobail = driver.findElements(By.xpath("//div[@class='col col-7-12']/ancestor::a[@class='_1fQZEK']/descendant::div[@class='_30jeq3 _1_WHN1']"));
				 

		for (int i = 0; i < nameOfmobail.size(); i++) {
			String name = nameOfmobail.get(i).getText();
			for (int j = i; j <= i; j++) {
				String prize = prizeOfMobail.get(j).getText();
				System.out.println(name + "      " + prize);
				Thread.sleep(2000);
			}

			System.out.println();
		}

	}

}

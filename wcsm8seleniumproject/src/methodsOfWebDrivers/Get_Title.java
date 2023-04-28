package methodsOfWebDrivers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("instageam login",Keys.ENTER);
		String Title= driver.getTitle();
		System.out.println(Title);
		
 
	}

}

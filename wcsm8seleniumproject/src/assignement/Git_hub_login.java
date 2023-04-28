package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Git_hub_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("login_field")).sendKeys("kadamsuraj1128");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("surajsambhajikadam");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='btn btn-primary btn-block js-sign-in-button']")).click();
		Thread.sleep(2000);
		driver.close();		

	}

}

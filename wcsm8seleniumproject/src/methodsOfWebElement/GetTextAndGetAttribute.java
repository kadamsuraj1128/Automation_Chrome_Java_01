package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/user-signin");
		String username = driver.findElement(By.xpath("//span[.='Login']")).getText();
		System.out.println(username);
		String attribute = driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("class");
		System.out.println(attribute);

	}

}

package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.shoppersstack.com/user-signin");
	//Longest way we can do like this
	WebElement tagname = driver.findElement(By.id("Password"));
	String tn = tagname.getTagName();
	System.out.println(tn);
	//Shortest way 
	 String tn1 = driver.findElement(By.id("Password")).getTagName();
	 System.out.println(tn1);
	

	}

}

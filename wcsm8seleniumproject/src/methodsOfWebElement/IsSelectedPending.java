package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedPending {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
	    WebElement a = driver.findElement(By.xpath("SDkEP"));
	    boolean verify = a.isSelected();
	    System.out.println(verify);
	    WebElement b = driver.findElement(By.xpath("SDkEP"));
	    b.click();
	    boolean verify1 = b.isDisplayed();
	    System.out.println(verify1);
	    
	    

	}

}

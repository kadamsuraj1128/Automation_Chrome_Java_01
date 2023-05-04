package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/user-signin");
	    WebElement usrTb = driver.findElement(By.xpath("//input[@id='Email']"));
	    boolean id = usrTb.isDisplayed();
	    System.out.println(id);
	    //here we passing condition if WebElement is displayed input will be pass in textBox
	    if(usrTb.isDisplayed())
	    {
	    usrTb.sendKeys("Suraj@123");
	    }
	    else
	    {
	    	System.out.println("we get exception");
	    }
	    Thread.sleep(3000);
	    driver.close();
		

	}

}

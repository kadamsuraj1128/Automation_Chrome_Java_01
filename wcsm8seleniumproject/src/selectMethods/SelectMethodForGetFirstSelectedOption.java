package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodForGetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/SingleSelectDropedown.html");
		WebElement dropeDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropeDown);
		for(int i=0;i<4;i++)
		{
			sel.selectByIndex(i);
		}	
		Thread.sleep(2000);
		WebElement firstOption = sel.getFirstSelectedOption( );
		String value = firstOption.getText();
		System.out.println(value);
			

	}

}

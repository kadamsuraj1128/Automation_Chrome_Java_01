package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/SingleSelectDropedown.html");
		WebElement dropeDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropeDown);
		WebElement options = sel.getWrappedElement();
		String value = options.getText();
		System.out.println(value);

	}

}

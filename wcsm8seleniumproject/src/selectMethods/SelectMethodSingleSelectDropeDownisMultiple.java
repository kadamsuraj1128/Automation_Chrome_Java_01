package selectMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodSingleSelectDropeDownisMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver	driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/SingleSelectDropedown.html");
		WebElement dropeDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropeDown);
		
	    List<WebElement> options = sel.getOptions();
	    
//	    for(int i=0;i<options.size();i++)
//	    {       String allOptions = options.get(i).getText();
//	    	System.out.println(allOptions);
//	    }
// Advance for loop
	    for(WebElement op:options)
	    {
	    	String allOptions = op.getText();
	    	System.out.println(allOptions);
	
	    }
		

	}

}

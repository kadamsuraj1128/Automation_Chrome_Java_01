package assignement;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElimineteDublicatees_TreeSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/multiSelectStaticDropedown.html");
		WebElement dropeDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropeDown);

		List<WebElement> allOptions = sel.getOptions();
	// To eliminate the duplicates & maintain the order of Ascending
		TreeSet<String> ts = new TreeSet<String>();
      // To read the list by eliminating duplicates  
		for (int i = 0; i < allOptions.size(); i++) {
			
		//get the options & text of options
			
			String op = allOptions.get(i).getText();

    	// add the text of options to TreeSet

			ts.add(op);
		}
		
		//to read the options from TreeSet
		
		for (String options : ts) {
			Thread.sleep(2000);
			System.out.println(options);
			

		}

	}

}

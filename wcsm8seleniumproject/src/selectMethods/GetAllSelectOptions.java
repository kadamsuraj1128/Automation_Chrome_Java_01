package selectMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/susha/OneDrive/Desktop/WebElement/multiSelectStaticDropedown.html");
		WebElement dropeDown = driver.findElement(By.name("menu"));
        Select sel=new Select(dropeDown);
        for(int i=0;i<8;i++)
        {
        	sel.selectByIndex(i);
        }
        List<WebElement> allOptions = sel.getAllSelectedOptions();
        for(WebElement op:allOptions)
        {
            String options = op.getText();
        System.out.println(options);
        }
       
	}

}

package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetreRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.shoppersstack.com/user-signin");
        WebElement username = driver.findElement(By.xpath("//span[.='Login']"));
        Rectangle rect = username.getRect();
        int h=rect.getHeight();
        int w=rect.getWidth();
        System.out.println("HightOfWebelement: "+h+", WidthOfWebelement "+ w);
        
        int x=rect.getX();
        int y=rect.getY();
        System.out.println("Xaxis: "+x+", Yaxis: "+y);
         
        

	}

}

package assignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insta_login_using_wait {
                                                  //handling Exception  
	public static void main(String[] args) throws InterruptedException {
		
		// Launch chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        //By applying implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //To launch web page using get method
        driver.get("https://www.instagram.com/");
        
        //To provide delay we use Thread.sleep method
        
        driver.findElement(By.name("username")).sendKeys("suraj@12345");
        
        driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d' and (@name='password')]")).sendKeys("kadam@123");
        
        driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
       
        //To close complete Browser
        driver.quit();
	}

}

package practice;

import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_navigate {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("select browser which you want");
		String browserValue=sc.next();
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driverchrome", "./drivers/chromedriver.exe");
		    ChromeOptions co=new ChromeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    WebDriver driver=new ChromeDriver(co);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.navigate().to("https://www.google.com/");
		    driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		    Thread.sleep(5000);
		    driver.navigate().refresh();
		    Thread.sleep(2000);
		    driver.close();
		    
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.close();
		}
		else
		{
			System.out.println("Enter valid browser name");
		}

	}

}

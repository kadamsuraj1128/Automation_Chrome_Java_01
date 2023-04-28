package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fireflink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeOptions	co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(co);
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.get("https://app.fireflink.com/signin?_gl=1*1n11nm0*_ga*MTkxMTcyOTg4Ny4xNjc5MzI5NDk1*_ga_XT2HK8QEM5*MTY4MDMzOTYwNy4xNy4wLjE2ODAzMzk2MDcuNjAuMC4w&_ga=2.49088037.2002710236.1680227221-1911729887.1679329495");
	    driver.findElement(By.id("mui-1")).sendKeys("surajk30june@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("mui-2")).sendKeys("Password@123");
	    Thread.sleep(2000);
	    driver.findElement(By.className("primary-btn")).click();
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}

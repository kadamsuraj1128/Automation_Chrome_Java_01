package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart_Xpath_by_using_Axis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(co);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
        Thread.sleep(2000);
        driver.switchTo().activeElement().sendKeys("Hp laptop");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[text()='Core i5']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Brand']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[text()='HP']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Windows 11']")).click();
        Thread.sleep(3000);
        String textPrise =driver.findElement(By.xpath("(//div[@class='_13oc-S']/ancestor::div[@class='_1YokD2 _3Mn1Gg']/descendant::div[@class='col col-5-12 nlI3QM'])[1]")).getText(); 
        System.out.println(textPrise);
        driver.quit();
        
	}

}

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amzone_Login_using_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dprime%26adgrpid%3D60612964962%26ext_vrnc%3Dhi%26hvadid%3D610714031509%26hvdev%3Dc%26hvlocphy%3D9301536%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D1958343110295590123%26hvtargid%3Dkwd-11783746%26hydadcr%3D14454_2316419%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("surajk30june@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("suraj@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}

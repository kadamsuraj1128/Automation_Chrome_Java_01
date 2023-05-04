package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amezon_Order_using_text_span {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=15034506403393188853&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-49491430&hydadcr=14454_2316419");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

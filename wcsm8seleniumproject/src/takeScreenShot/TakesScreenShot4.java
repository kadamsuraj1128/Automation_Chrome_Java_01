package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakesScreenShot4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://www.instagram.com/");
	 File src = efw.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./ScreenShot/s4.png");
	 Files.copy(src, dest);

	}

}

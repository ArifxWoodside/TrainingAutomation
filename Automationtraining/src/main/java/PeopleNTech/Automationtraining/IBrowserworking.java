package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowserworking {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1) How to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Automation\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	Thread.sleep(6000);
	String windowhandle = driver.getWindowHandle();
	System.out.println(windowhandle);
	String getURL = driver.getCurrentUrl();
	System.out.println(getURL);

	}

}

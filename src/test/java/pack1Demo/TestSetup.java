package pack1Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetup {
		
	public static WebDriver driver;
	
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	//	driver.manage().wait();
		System.out.println("Driver lounch successfully");
		driver.close();
		
	}
}

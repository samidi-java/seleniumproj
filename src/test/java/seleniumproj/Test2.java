package seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void googleTest()
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\batch6\\selenium\\driver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bangalore");
		driver.findElement(By.name("btnK")).click();
		driver.quit();
		
	}

}

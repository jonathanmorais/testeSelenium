package test;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AbrirNavegadorTest {

	static WebDriver driver;

	@Test
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com.br");
		WebElement campo = driver.findElement(By.name("q"));
		campo.sendKeys("TTY2000");
		campo.submit();
		Assert.assertEquals("TTY2000", "TTY2000");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
		driver.quit();
	}
	
	//@AfterClass
	//public static void tearDownAfterClass() throws Exception {
		//driver.close();
		//driver.quit();
	//}

}

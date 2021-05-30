package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Shop;

public class TestNG {

	
	WebDriver driver;
	
	@BeforeClass
	public void openDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spaso\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void firstArticle() {
		
		Shop.byFirstOption(driver, "2");
		
		String current = driver.findElement(By.id("ispis")).getAttribute("style");
		String expacted = "display: block;";
		
		Assert.assertEquals(current, expacted);
		
	}
	
	
	
	
	
	
}

package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import resource.Constants;
import objects.Home;


public class Shop {

	
public static void shopSection(WebDriver driver) {
		
	Home.openHome(driver);
	driver.manage().window().maximize();
	driver.findElement(By.xpath(Constants.SHOP_XPATH)).click();
	}
	
public static void byFirstOption(WebDriver driver, String num) {
	
	
	shopSection(driver);
	
	driver.findElement(By.id(Constants.CHECHBOX1_ID)).click();
	
	driver.findElement(By.id(Constants.NUMBERARTICLE1_ID)).sendKeys(Keys.BACK_SPACE);
	
	driver.findElement(By.id(Constants.NUMBERARTICLE1_ID)).sendKeys(num);

	driver.findElement(By.xpath(Constants.BUTTONBUY_XPATH)).click();
	
}



}

package objects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import resource.Constants;
import resource.ConstantsForm;
import objects.Home;

public class Shop {

	public static void shopSection(WebDriver driver) {

		Home.openHome(driver);
		driver.manage().window().maximize();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath(Constants.SHOP_XPATH)).sendKeys(selectLinkOpeninNewTab);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	}

	public static void byFirstOption(WebDriver driver, String num) {

		shopSection(driver);

		driver.findElement(By.id(Constants.CHECHBOX1_ID)).click();

		driver.findElement(By.id(Constants.NUMBERARTICLE1_ID)).sendKeys(Keys.BACK_SPACE);

		driver.findElement(By.id(Constants.NUMBERARTICLE1_ID)).sendKeys(num);

		driver.findElement(By.xpath(Constants.BUTTONBUY_XPATH)).click();

	}

	public static void fillingForm(WebDriver driver, String name, String address, String postalCod, String city,
			String phone, String mail, String note) {

		driver.findElement(By.xpath(ConstantsForm.NAME_XPATH)).sendKeys(name);
		driver.findElement(By.xpath(ConstantsForm.ADDRES_XPATH)).sendKeys(address);
		driver.findElement(By.xpath(ConstantsForm.POSTALCODE_XPATH)).sendKeys(postalCod);
		driver.findElement(By.xpath(ConstantsForm.CITY_XPATH)).sendKeys(city);
		driver.findElement(By.xpath(ConstantsForm.PHONE_XPATH)).sendKeys(phone);
		driver.findElement(By.xpath(ConstantsForm.EMAIL_XPATH)).sendKeys(mail);
		driver.findElement(By.xpath(ConstantsForm.NOTE_XPATH)).sendKeys(note);
		driver.findElement(By.xpath(ConstantsForm.ORDER_XPATH)).click();

	}

}

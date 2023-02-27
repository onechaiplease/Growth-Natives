package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.Utilities;

public class Tests extends BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void IntializeDriver() throws IOException {

		driver = intializeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void AddToCart() throws InterruptedException {

		driver.get(prop.getProperty("url"));
		Utilities testAddToCart = new Utilities(driver);

		testAddToCart.searchItem();
		testAddToCart.search();
		testAddToCart.goToPdp();
		testAddToCart.switchtab();
		testAddToCart.atc();

	}

//	@AfterMethod
//
//	public void quitBrowser() {
//
//		driver.quit();
//
//	}

}

package Resources;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilities {
	public WebDriver driver;

	By searchBox = By.id("twotabsearchtextbox");
	By itemToBeAdded = By.linkText("Apple iPhone 14 Pro 128GB Space Black");
	By search = By.id("nav-search-submit-button");
	By atc = By.id("add-to-cart-button");

	public Utilities(WebDriver driver) {
		this.driver = driver;
	}

	public void searchItem() {

		driver.findElement(searchBox).sendKeys("iphone 14 pro");
	}

	public void goToPdp() {

		driver.findElement(itemToBeAdded).click();

	}

	public void search() {

		driver.findElement(search).click();

	}

	public void atc() {

		driver.findElement(atc).click();
	}

	public void switchtab() {

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);

	}

}

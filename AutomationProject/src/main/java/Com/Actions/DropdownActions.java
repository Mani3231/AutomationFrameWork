package Com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Com.Locators.DropdownLocators;
import Commons.Commons;

public class DropdownActions {
	static WebDriver driver = null;

	public static boolean launchBrowser(String url) {
		driver = Commons.getwebDriver();
		driver.get(url);
		return true;
	}
	public static boolean dropDownHandles() {
		WebElement ele = driver.findElement(By.name(DropdownLocators.Dropdown_name));
		Select sel = new Select(ele);
		sel.selectByVisibleText(DropdownLocators.selectByVisibleText);
		return true;
	}

}

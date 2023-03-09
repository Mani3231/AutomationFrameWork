package Com.Test;

import org.testng.annotations.Test;
import Com.Actions.DropdownActions;
import Utils.PropertyFileReader;

public class DropDownTest {
	@Test
	public void verifyDropDowns() {
		if (DropdownActions.launchBrowser(PropertyFileReader.getProperty("url"))) {
			if (DropdownActions.dropDownHandles()) {

			} else {
				System.out.println("Dropdown handle faild");
			}
		} else {
			System.out.println("Launch url faild");
		}
	}

}

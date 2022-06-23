package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class AccessDetailsPageObject extends BasePage {
    WebDriver driver;

    public AccessDetailsPageObject(WebDriver driver) {
        this.driver = driver;
    }

}

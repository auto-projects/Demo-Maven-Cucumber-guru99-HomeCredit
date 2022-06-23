package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSuccessfulMessageDisplayed(WebDriver driver, String messageValue) {
        waitForElementVisible(driver, HomePageUI.SUCCESSFUL_MESSAGE, messageValue);
        return isElementDisplayed(driver, HomePageUI.SUCCESSFUL_MESSAGE, messageValue);
    }

    public boolean isUserIDDisplayed(WebDriver driver, String userID) {
        waitForElementVisible(driver, HomePageUI.USER_ID_MESSAGE, userID);
        return isElementDisplayed(driver, HomePageUI.USER_ID_MESSAGE, userID);
    }

    public void inputToAddressTextbox(WebDriver driver, String address) {
        waitForElementVisible(driver, HomePageUI.ADDRESS_TEXTBOX);
        sendkeyToElement(driver, HomePageUI.ADDRESS_TEXTBOX, address);
    }

    public boolean theSuccessfulMessageIsDisplayed(WebDriver driver, String messageValue) {
        waitForElementVisible(driver, HomePageUI.SUCCESSFUL_MESSAGE_OF_NEW_CUSTOMER, messageValue);
        return isElementDisplayed(driver, HomePageUI.SUCCESSFUL_MESSAGE_OF_NEW_CUSTOMER, messageValue);
    }
}

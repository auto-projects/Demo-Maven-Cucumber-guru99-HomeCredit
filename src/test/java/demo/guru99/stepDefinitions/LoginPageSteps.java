package demo.guru99.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class LoginPageSteps {
    WebDriver driver;
    LoginPageObject loginPage;
    HomePageObject homePage;

    public LoginPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getLoginPage(driver);
    }
    @Then("^Enter to Username textbox$")
    public void input_to_Username_textbox() {
       loginPage.inputToUserIDTextbox(RegisterPageSteps.userID);
    }

    @Then("^Enter to Password textbox$")
    public void input_to_password_textbox() {
        loginPage.inputToPasswordTextbox(RegisterPageSteps.password);
    }

    @Then("^Click on Login button$")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @And("^Successful page is displayed$")
    public void successfulPageIsDisplayed() {
        Assert.assertTrue(homePage.isSuccessfulMessageDisplayed(driver, "Welcome To Manager's Page of Guru99 Bank"));
        Assert.assertTrue(homePage.isUserIDDisplayed(driver, "Manger Id : " + RegisterPageSteps.userID));
    }

}

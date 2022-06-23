package demo.guru99.stepDefinitions;

import commons.DataUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.AccessDetailsPageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;

    public class RegisterPageSteps {
    WebDriver driver;
    RegisterPageObject registerPage;
    AccessDetailsPageObject accessDetailsPage;
    LoginPageObject loginPage;
    DataUtil dataFaker;
    String email;
    static String userID, password;

    public RegisterPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getLoginPage(driver);
        dataFaker = DataUtil.getData();
        email = dataFaker.getEmailAddress();
    }

        @When("^Click on Here button$")
        public void click_on_here_button() {
        loginPage.clickOnHereButton();
        registerPage = PageGeneratorManager.getRegisterPage(driver);
        }

        @Then("^Close the Ads$")
        public void click_on_close_button_on_the_ads() {
        registerPage.closeAdsPopup();
        }

        @Then("^Enter to Email textbox$")
        public void input_to_email_textbox_with() {
        registerPage = PageGeneratorManager.getRegisterPage(driver);
        registerPage.inputToEmailTextbox(email);

        }

        @Then("^Click on Submit$")
        public void click_on_submit_button() {
        registerPage.clickOnSubmitButton();
        accessDetailsPage = PageGeneratorManager.getAccessDetailsPage(driver);

        }

        @Then("^Get UserID info$")
        public void get_userid_info() {
        userID = registerPage.getUsernameInformation();

        }

        @Then("^Get Password info$")
        public void get_password_info() {
        password = registerPage.getPasswordInformation();

        }
        @Then("^Open Login Page again$")
        public void open_login_page_again() {
        accessDetailsPage.openLoginPage(driver);
        //loginPage = PageGeneratorManager.getLoginPage(driver);

        }

}

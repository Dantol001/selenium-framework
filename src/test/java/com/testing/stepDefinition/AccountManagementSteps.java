package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;
    @Given("User is on create an account page")
    public void userIsOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccount();
    }

    @When("User enters {string} {string} {string} {string} {string}")
    public void userEnters(String firstname, String lastname, String email, String password, String confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(firstname);
        createAccountPagePO.enterLastName(lastname);
        createAccountPagePO.enterEMail(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterConfirmPassword(confirmpassword);
    }

    @And("User clicks on create an account")
    public void userClicksOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }


    @Given("User is on sign in page")
    public void user_is_on_sign_in_page() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignIn();

    }
    @When("User enters {string} {string}")
    public void user_enters(String email, String password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEMail(email);
        signInPagePO.enterPass(password);

    }
    @And("User clicks on sign in")
    public void user_clicks_on_sign_in() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.clickSignInButton();
    }
    @Then("Home page is displayed and user is signed in successfully")
    public void home_page_is_displayed() {

    }














}

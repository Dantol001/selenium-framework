package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element locators

    @FindBy(id = "firstname")
    public static WebElement FirstNameField;


    @FindBy(id = "lastname")
    public static WebElement LastNameField;


    @FindBy(name = "email")
    public static WebElement EMailField;


    @FindBy(name = "password")
    public static WebElement PasswordField;


    @FindBy(name = "password_confirmation")
    public static WebElement Password_ConfirmationField;


    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;











    // Initialize web elements using selenium webdriver
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    // Page specific method
    public void enterFirstName(String firstname){
        FirstNameField.sendKeys(firstname);

    }

    public void enterLastName(String lastname){
        LastNameField.sendKeys(lastname);

    }

    public void enterEMail(String email){
        EMailField.sendKeys(email);

    }

    public void enterPassword(String password){
        PasswordField.sendKeys(password);

    }

    public void enterConfirmPassword(String confirmpassword){
        Password_ConfirmationField.sendKeys(confirmpassword);

    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }































}

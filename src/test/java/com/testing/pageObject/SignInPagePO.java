package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {
    // Element locators

    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PassField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;



    // Initialize web elements using selenium webdriver

    public SignInPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    // Page specific method

    public void enterEMail(String email){
        EmailField.sendKeys(email);

    }

    public void enterPass(String pass){
        PassField.sendKeys(pass);

    }

    public void clickSignInButton(){
        SignInButton.click();

    }










}


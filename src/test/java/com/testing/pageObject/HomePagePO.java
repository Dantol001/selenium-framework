package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    // Initialize web elements using selenium webdriver
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Page specific method
    public void clickCreateAccount(){
        CreateAccountLink.click();
    }

    public void clickSignIn(){
        SignInLink.click();
    }






















}

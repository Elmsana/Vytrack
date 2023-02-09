package com.Vytrack.pages;

import com.Vytrack.Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement password;

    @FindBy(xpath ="//button[@id='_submit']")
    public WebElement submit;




    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }
}


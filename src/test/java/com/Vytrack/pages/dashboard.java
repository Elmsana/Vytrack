package com.Vytrack.pages;

import com.Vytrack.Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard extends BasePage{
    public dashboard(){
        PageFactory.initElements(Driver.get(),this);}


    @FindBy(xpath ="//a/i[@class=\"fa-caret-down\"]")
    public WebElement dashbord;

    @FindBy(xpath = "//li[@class=\"mobile-hide\"]")
    public WebElement MyConfiguration;

    @FindBy(xpath ="//a/i[@class=\"fa-caret-down\"]")
    public WebElement dashbord1;

    @FindBy(xpath ="//*[@class=\"no-hash\"]")
    public WebElement logout;

}

package com.Vytrack.pages;

import com.Vytrack.Utility.BrowserUtils;
import com.Vytrack.Utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public BasePage(){PageFactory.initElements(Driver.get(),this);}

    public void logOut() {
        BrowserUtils.waitFor(2);
//        BrowserUtils.clickWithJS(userName);
//        BrowserUtils.clickWithJS(logOutL);
//    }
//    public String getPageSubTitle() {
//        //ant time we are verifying page name, or page subtitle, loader mask appears
//        waitUntilLoaderScreenDisappear();
////        BrowserUtils.waitForStaleElement(pageSubTitle);
//        return pageSubTitle.getText();
//    }
//
//
//    /**
//     * Waits until loader screen present. If loader screen will not pop up at all,
//     * NoSuchElementException will be handled  bu try/catch block
//     * Thus, we can continue in any case.
//     */
//    public void waitUntilLoaderScreenDisappear() {
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    public void navigateToModule(String tab, String module) {
//        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
//        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
//        try {
//            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
//            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
//            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
//        } catch (Exception e) {
//            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
//        }
//        try {
//            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
//            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
//            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
//            Driver.get().findElement(By.xpath(moduleLocator)).click();
//        } catch (Exception e) {
////            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
//            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
//        }
//    }


    }


}

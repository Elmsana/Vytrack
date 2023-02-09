package com.Vytrack.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clickWithWait(By by, int attempts) {
        int counter = 0;
        //click on element as many as you specified in attempts parameter
        while (counter < attempts) {
            try {
                //selenium must look for element again
                clickWithJS(Driver.get().findElement(by));
                //if click is successful - then break
                break;
            } catch (WebDriverException e) {
                //if click failed
                //print exception
                //print attempt
                e.printStackTrace();
                ++counter;
                //wait for 1 second, and try to click again
                waitFor(1);
            }
        }
    }

//    public static void waitForPresenceOfElement(By by, long time) {
//        new WebDriverWait(Driver.get(), time).until(ExpectedConditions.presenceOfElementLocated(by));
//    }
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }
//    public static WebElement waitForClickablility(WebElement element, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
//        return wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//    public static void scrollToElement(WebElement element) {
//        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
//    }
//    public static WebElement waitForVisibility(By locator, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }

}

package com.Bitrix24.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
    public static void explicitWait(WebElement element, long time){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

        wait.until(ExpectedConditions.visibilityOf(element));



    }
    public static void wait(int seconds)  {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static  void clickWithJS(WebElement element){
        ((JavascriptExecutor)Driver.getDriver()).executeScript(
                " arguments[0].scrollIntoView(true);",element);
        ((JavascriptExecutor)Driver.getDriver()).executeScript(
                " arguments[0].click();",element);
    }
    public static void hoverOverElement(WebElement element){
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(element).perform();
        wait(2);
    }
}

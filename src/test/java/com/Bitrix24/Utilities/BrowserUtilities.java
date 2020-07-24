package com.Bitrix24.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
    public static void explicitWait(WebElement element, long time){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

        wait.until(ExpectedConditions.visibilityOf(element));



    }
}

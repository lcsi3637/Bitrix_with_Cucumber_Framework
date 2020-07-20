package com.Bitrix24.Pages;

import com.Bitrix24.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 20);
    
}

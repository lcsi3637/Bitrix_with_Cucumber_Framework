package com.Bitrix24.Pages;

import com.Bitrix24.Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends BasePage {



   @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement username;

   @FindBy(xpath = "//input[@name='USER_PASSWORD']")
   private WebElement password;

   @FindBy(xpath = "//input[@type='submit']")
   private WebElement submitButton;

   public void login(String userName, String passWord){
      wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(userName);
      wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passWord);
      wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();


   }
   public void login(){
      wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(ConfigurationReader.getProperty("username"));
       wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("password"));
       wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

   }

}

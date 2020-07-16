package com.Bitrix24.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
   private static WebDriver driver;

   private Driver(){}

   public static WebDriver getDriver (){
      if(driver==null){
         String browser= ConfigurationReader.getProperty("browser");

         switch (browser){
            case "chrome":
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
               break;
            case "Chrome":
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
               break;
            case "CHROME":
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
               break;
            case "chrome-headless":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
               break;
            case "firefox-headless":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
               break;
            case "Firefox":
               WebDriverManager.firefoxdriver().setup();
               driver=new FirefoxDriver();
               break;
            case "firfox":
               WebDriverManager.firefoxdriver().setup();
               driver=new FirefoxDriver();
               break;
            case "FireFox":
               WebDriverManager.firefoxdriver().setup();
               driver=new FirefoxDriver();
               break;
            case "edge":
               WebDriverManager.edgedriver().setup();
               driver=new EdgeDriver();
               break;
            case "ie":
               WebDriverManager.iedriver().setup();
               driver=new InternetExplorerDriver();
               break;
            default:
               System.out.println("No Such Driver");


         }

      }

      return driver;
   }

   public static void closeDriver(){
      if(driver!=null){
         driver.close();
         driver=null;
      }
}


}

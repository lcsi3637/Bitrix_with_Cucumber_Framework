package com.Bitrix24.Utilities;

import java.util.concurrent.TimeUnit;

public class utilities {

    public static void getURL(){
     //  Driver.getDriver().get(ConfigurationReader.getProperty("browser"));
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }


}

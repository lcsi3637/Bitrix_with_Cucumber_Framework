package com.Bitrix24.StepDifinations;

import com.Bitrix24.Utilities.Driver;
import com.Bitrix24.Utilities.utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
public void setupDriver(){

        utilities.getURL();

    }



    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenShot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());

        }
        Driver.closeDriver();

    }
}

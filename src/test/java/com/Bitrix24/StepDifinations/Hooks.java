package com.Bitrix24.StepDifinations;

import com.Bitrix24.Utilities.ConfigurationReader;
import com.Bitrix24.Utilities.Driver;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        Driver.getDriver().close();
    }

}
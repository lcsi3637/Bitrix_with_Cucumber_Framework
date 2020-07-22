package com.Bitrix24.StepDifinations;

import com.Bitrix24.Pages.loginPage;
import com.Bitrix24.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AssignTaskStepDef {
loginPage loginPage=new loginPage();



    @When("user enters {string} and {string}")
    public void userEntersAnd(String UserName, String Password) {
        loginPage.login(UserName, Password);
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedTitle) throws InterruptedException {

        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
   Thread.sleep(2000);
    }
}

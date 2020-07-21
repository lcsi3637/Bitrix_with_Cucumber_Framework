package com.Bitrix24.StepDifinations;

import com.Bitrix24.Pages.loginPage;
import io.cucumber.java.en.Given;

public class SendMessageFunctionality {

    loginPage loginPage = new loginPage();



 //   @Given("when a user enters {string} and {string}")
  //  public void whenAUserEntersAnd(String UserName, String Password) {

  //      loginPage.login(UserName, Password);
 //   }

  //  @Then("user should see {string}")
 //   public void userShouldSee(String expectedTitle) {
 //   }

    @Given("user enter username and password")
    public void userEnterUsernameAndPassword() {
        loginPage.loginFromConfig();
    }
}
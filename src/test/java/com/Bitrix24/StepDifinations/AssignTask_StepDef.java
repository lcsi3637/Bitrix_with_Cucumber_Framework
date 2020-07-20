package com.Bitrix24.StepDifinations;

import com.Bitrix24.Pages.loginPage;
import io.cucumber.java.en.Given;

public class AssignTask_StepDef {

    loginPage loginPage= new loginPage();






    @Given("when a user enters <username> and <password>")
    public void whenAUserEntersUsernameAndPassword() {
    loginPage.login();
    }
 }
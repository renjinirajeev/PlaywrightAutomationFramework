package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String usernameKey, String passwordKey) {
        loginPage.doLogin(ConfigReader.getConfigProperty(usernameKey),ConfigReader.getConfigProperty(passwordKey))
        
    }

}

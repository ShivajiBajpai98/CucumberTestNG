package com.atmecs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps
{

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {

        System.out.println("I am on login page");
    }
    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials() {

        System.out.println(" I entered user name and password");
    }
    @When("hits submit")
    public void hits_submit() {

        System.out.println(" I click on submit");
    }
    @Then("the user should be logged in successfully.")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("yes i am logged in");

    }

}

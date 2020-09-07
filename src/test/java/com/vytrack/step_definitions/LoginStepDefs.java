package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I am in login page");
    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        System.out.println("I entered the driver credentials");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I am in dashboard page");
    }

    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        System.out.println("I entered the sales manager credentials");
    }

    @When("the user enter the store manager information")
    public void the_user_enter_the_store_manager_information() {
        System.out.println("I entered the store manager credentials");
    }
}

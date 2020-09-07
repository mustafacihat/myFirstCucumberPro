package com.vytrack.step_definitions;

import com.vytrack.pages.LibraryLoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibraryLoginStepDefs {


    @Given("the user is on the Library app login page")
    public void the_user_is_on_the_Library_app_login_page() {
        Driver.get().get("http://library2.cybertekschool.com/login.html");
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String email, String password) throws InterruptedException {

        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.loginLibrary(email, password);

        Thread.sleep(3000);


    }

    @Then("the user should be able to login on Library app bookpage")
    public void the_user_should_be_able_to_login_on_Library_app_bookpage() {
        Assert.assertEquals("http://library2.cybertekschool.com/#books", Driver.get().getCurrentUrl());
    }

    @Then("the user should be able to login on Library app dashbord")
    public void the_user_should_be_able_to_login_on_Library_app_dashbord() {
        Assert.assertEquals("http://library2.cybertekschool.com/#dashboard", Driver.get().getCurrentUrl());
    }

    @Then("the user should not be able to login on Library app")
    public void the_user_should_not_be_able_to_login_on_Library_app() {
        Assert.assertEquals("http://library2.cybertekschool.com/login.html", Driver.get().getCurrentUrl());
    }



}

package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends com.vytrack.pages.BasePage {

    @FindBy(css = "h1.user-name")
    public WebElement fullName;

    @FindBy(css = "a.email")
    public WebElement email;

    @FindBy(css = "a.phone")
    public WebElement phone;


}

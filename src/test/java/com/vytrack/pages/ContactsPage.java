package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends com.vytrack.pages.BasePage {

    //since we are extending BasePage we do not need explicit constructor for this class



   /* @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')and@data-column-label='Email']")
    public WebElement email;*/

    //create a method getContactEmail that accepts email as a String , and return webelement based on that email;

    public WebElement getContactEmail(String email){
        String xpath = "//td[contains(text(),'"+email+"')and@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }
/*
    @FindBy(css= ".dropdown.dropdown-level-1.active")  this is my attribution not orginal code
    WebElement customerTab;
    @FindBy(xpath = "//span[.='Contacts']")
    WebElement contactsModule;*/
}

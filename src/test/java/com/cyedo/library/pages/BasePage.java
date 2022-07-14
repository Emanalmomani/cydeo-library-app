package com.cyedo.library.pages;

import com.cyedo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = about:blank
public abstract class BasePage { // abstract class we extends this element to all other classes
    // No page elements added

    public BasePage(WebDriver driver) {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//span[.='Dashboard']")
        public WebElement dashboardLink;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksLink;



    @FindBy(id = "navbarDropdown")
    public WebElement userNameLink;

}
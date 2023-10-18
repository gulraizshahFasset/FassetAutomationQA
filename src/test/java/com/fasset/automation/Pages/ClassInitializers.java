package com.fasset.automation.Pages;

import com.fasset.automation.Pages.ActionClasses.*;
import org.openqa.selenium.WebDriver;

public class ClassInitializers {
    public static WelcomePageActions welcomePageActions;
    public static CreateAccountPageActions createAccountPageActions;
    public static LoginPageActions loginPageActions;
    public static HomePageActions homePageActions;
    public void initializePages(WebDriver driver) {
        welcomePageActions = new WelcomePageActions(driver);
        createAccountPageActions = new CreateAccountPageActions(driver);
        loginPageActions = new LoginPageActions(driver);
        homePageActions = new HomePageActions(driver);
    }
}

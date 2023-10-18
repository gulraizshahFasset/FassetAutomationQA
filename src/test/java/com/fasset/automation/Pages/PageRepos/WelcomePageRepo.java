package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePageRepo {

    @FindBy(xpath="//*[@text='Have an account? Login']")
    public WebElement welcome_Text;
    @FindBy(xpath="//*[text()='Have an account? Login']")
    public WebElement welcome_TextWeb;

    @FindBy(xpath="//*[@text='Sign Up']")
    public WebElement createAccount_Button;
    @FindBy(xpath="//*[text()='Sign Up']")
    public WebElement createAccount_ButtonWeb;

    @FindBy(xpath = "//*[@text='Have an account? Login']")
    public WebElement login_Button;
    @FindBy(xpath = "//*[text()='Have an account? Login']")
    public WebElement login_ButtonWeb;


}

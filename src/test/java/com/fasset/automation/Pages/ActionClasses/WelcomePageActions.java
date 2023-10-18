package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.WelcomePageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static Utilities.CommonFunctions.*;

public class WelcomePageActions extends WelcomePageRepo {
    WebDriver driver = null;

    public WelcomePageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyUserIsOnScreen(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed",waitUntilElementDisplayed(welcome_Text, 10));
        }
        else{
            Assert.assertTrue("Element is not displayed",waitUntilElementDisplayed(welcome_TextWeb, 5));
        }
    }
    public void userClickOnCreateAccountButton(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            click(createAccount_Button);
        }
        else{
            click(createAccount_ButtonWeb);
        }
    }
    public void userClickOnLoginButton() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            click(login_Button);
        }
        else{
            click(login_ButtonWeb);
        }
    }
}

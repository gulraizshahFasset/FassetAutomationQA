package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.LoginPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static DataReader.EnvConfig.*;
import static Utilities.CommonFunctions.*;

public class LoginPageActions extends LoginPageRepo {

    WebDriver driver = null;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userClickOnLoginButton() {
            click(login_Button);
    }

    public void verifyUserIsOnScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(login_screen_text, 5));
        }
        else{
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(login_screen_textWeb, 5));
        }
    }
    public void verifyUserIsOnOtpSelectionScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(otp_selection_screen_text, 5));
        }
        else {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(otp_selection_screen_textWeb, 5));
        }
    }
    public void verifyUserIsOnLoginCredentialsScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(loginCreds_screen_text, 5));
        }
        else{
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(loginCreds_screenWeb_text, 5));
        }
    }

    public void enterDataInForm(String formData) {
        switch (formData.toUpperCase()) {
            case "VALID":
                enterDataInFullForm();
                break;
            case "INVALID ACCOUNT":
                enterInvalidEmailInForm();
                break;
        }


    }

    private void enterDataInFullForm() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            clickAndEnterDataInInputField(email_Input, LoginValidData.get("Email"));
            clickAndEnterDataInInputField(password_Input, LoginValidData.get("Password"));
            hideKeyboard_Android();
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
            click(loginMain_button);
        }
        else{
            clickAndEnterDataInInputField(email_InputWeb, LoginValidData.get("Email"));
            clickAndEnterDataInInputField(password_InputWeb, LoginValidData.get("Password"));
            waitUntilElementClickable(loginMain_buttonWeb);
            click(loginMain_buttonWeb);
        }
    }
    public void userClickOnLoginScreenButton(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            click(loginButton);
        }
        else{
            click(login_ButtonWeb);
        }
    }

    private void enterInvalidEmailInForm(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            clickAndEnterDataInInputField(email_Input, InvalidEmailAccountDetails.get("Email"));
            clickAndEnterDataInInputField(password_Input, InvalidEmailAccountDetails.get("Password"));
            hideKeyboard_Android();
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
            click(loginMain_button);
        }
        else{
            clickAndEnterDataInInputField(email_InputWeb, InvalidEmailAccountDetails.get("Email"));
            clickAndEnterDataInInputField(password_InputWeb, InvalidEmailAccountDetails.get("Password"));
            waitUntilElementClickable(loginMain_buttonWeb);
            click(loginMain_buttonWeb);
        }
    }

    public void userNotFoundError(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(userNotFoundErrorText, 20));
        }
        else{
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(userNotFoundErrorTextWeb, 20));
        }
    }

}

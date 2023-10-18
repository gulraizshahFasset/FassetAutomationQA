package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepo {

    @FindBy(xpath = "//*[@text='Have an account? Login']")
    public WebElement login_Button;

    @FindBy(xpath = "//*[text()='Have an account? Login']")
    public WebElement login_ButtonWeb;

    @FindBy(xpath = "//*[@text='Login to your']")
    public WebElement login_screen_text;

    @FindBy(xpath = "//*[text()='Login to your']")
    public WebElement login_screen_textWeb;

    @FindBy(xpath = "//*[@resource-id='heading']")
    public WebElement otp_selection_screen_text;

    @FindBy(xpath = "//*[text()='Select Verification Method']")
    public WebElement otp_selection_screen_textWeb;

    @FindBy(xpath = "//*[@text='Forgot password?']")
    public WebElement loginCreds_screen_text;
    @FindBy(xpath = "//*[text()='Forgot Password?']")
    public WebElement loginCreds_screenWeb_text;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='emailField']")
    public WebElement email_Input;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email_InputWeb;

    @FindBy(xpath = "//*[@text='Enter Password']")
    public WebElement password_Input;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password_InputWeb;

    @FindBy(xpath = "(//*[@text='Login'])[2]/../android.view.ViewGroup")
    public WebElement loginMain_button;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginMain_buttonWeb;

    @FindBy(xpath = "//*[@text='Invalid email or password']")
    public WebElement userNotFoundErrorText;
    @FindBy(xpath = "//*[text()='Invalid email or password']")
    public WebElement userNotFoundErrorTextWeb;

    @FindBy(xpath="//*[@text='Login with email']")
    public WebElement loginButton;

    @FindBy(xpath="//*[text()='Login with email']")
    public WebElement loginButtonWeb;
}

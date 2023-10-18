package com.fasset.automation.StepDefinitions;
import com.fasset.automation.Pages.ClassInitializers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static APIToBeUsed.UsefulApi.*;
import static DataReader.JsonReader.getSizeofObject;
import static Driver.DriverManager.getDriver;
import static Utilities.CommonFunctions.*;
import static com.fasset.automation.Pages.PageRepos.HomePageRepo.*;

public class StepDefinition extends ClassInitializers {
    public StepDefinition() {
        initializePages(getDriver());
    }
    @Given("User is able to {string} via Api")
    public void user_is_able_to_use_api(String task) {
        boolean flag = false;
        switch (task.toUpperCase()){
            case "CREATE ACCOUNT RANDOM":
                //createRandomUser();
                break;
        }
    }
    @Given("Verify user is on {string} screen")
    public void user_is_on_screen(String screenName) {
        boolean flag = false;
        switch (screenName.toUpperCase()){
            case "LOGIN CREDENTIALS":
                loginPageActions.verifyUserIsOnLoginCredentialsScreen();
                break;
            case "WELCOME":
                welcomePageActions.verifyUserIsOnScreen();
                break;
            case "CREATE ACCOUNT":
                createAccountPageActions.verifyUserIsOnScreen();
                break;
            case "EMAIL VALIDATION":
                createAccountPageActions.verifyUserIsOnEmailValidationScreen();
                break;
            case "LOGIN":
                loginPageActions.verifyUserIsOnScreen();
                break;
            case "HOMEPAGE":
                homePageActions.verifyUserIsOnScreen();
            case "OTP SELECTION":
                loginPageActions.verifyUserIsOnOtpSelectionScreen();
                break;
            case "CREATE ACCOUNT BUTTON":
                createAccountPageActions.verifyCreateAccountButton();
                break;
        }
    }
    @Given("Verify {string} element is present")
    public void element_is_present_on_screen(String elementName) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "MENU":
                homePageActions.verifyElementIsPresentOnScreen();
                break;
            case "MENU HAMBURGER":
                homePageActions.verifyMenuHamburgerIsPresentOnScreen();
                break;
            case "TOP BANNER IMAGE":
                homePageActions.verifyTopBannerImageIsPresentOnScreen();
                break;
            case "TOP BANNER SUBCATEGORY":
                homePageActions.verifyTopBannerSubcategoryIsPresentOnScreen();
                break;
            case "TOP BANNER DESCRIPTION":
                homePageActions.verifyTopBannerDescriptionIsPresentOnScreen();
                break;
            case "NEWS SECTION":
                homePageActions.verifyNewsSectionIsPresentOnScreen();
                break;
            case "NEWS TITLE":
                homePageActions.verifyNewsTitleIsPresentOnScreen();
                break;
            case "NEWS DESCRIPTION":
                homePageActions.verifyNewsDescriptionIsPresentOnScreen();
                break;
            case "NEWS CREATER":
                homePageActions.verifyNewsCreaterIsPresentOnScreen();
                break;
            case "NEWS MAIN TITLE":
                homePageActions.verifyNewsMainTitleIsPresentOnScreen();
                break;
            case "NEWS MAIN DESCRIPTION":
                homePageActions.verifyNewsMainDescriptionIsPresentOnScreen();
                break;
            case "SEE OTHER NEWS":
                homePageActions.verifyOtherNewsIsPresentOnScreen();
                break;
            case "BACK BUTTON":
                homePageActions.verifyBackButtonIsPresentOnScreen();
                break;
            case "ARTICLE SECTION":
                homePageActions.verifyArticleSectionIsPresentOnScreen();
                break;
            case "ARTICLE SEE ALL":
                homePageActions.verifyArticleSeeAllIsPresentOnScreen();
                break;
            case "ARTICLE TILE":
                homePageActions.verifyArticleTileIsPresentOnScreen();
                break;
            case "TOP VIEWED SECTION":
                homePageActions.verifyTopViewedSectionIsPresentOnScreen();
                break;
            case "TOP VIEWED TILE":
                homePageActions.verifyTopViewedTileIsPresentOnScreen();
                break;
            case "TOP VIEWED CREATER":
                homePageActions.verifyTopViewedCreaterIsPresentOnScreen();
                break;
            case "TOP VIEWED TITLE":
                homePageActions.verifyTopViewedTitleIsPresentOnScreen();
                break;
            case "DISCOVER":
                homePageActions.verifyDiscoverBadgeIsPresentOnScreen();
                break;
            case "RECENTLY VIEW":
                homePageActions.verifyRecentlyViewBadgeIsPresentOnScreen();
                break;
            case "QUIZ CHOICE":
                homePageActions.verifyQuizChoiceIsPresentOnScreen();
                break;
            case "POLL CHOICE":
                homePageActions.verifyPollChoiceIsPresentOnScreen();
                break;
            case "MATCHES TILE":
                homePageActions.verifyMatchesIsPresentOnScreen();
                break;
        }
    }
    @Given("Verify {string} element is not present")
    public void element_is_not_present_on_screen(String elementName) {
        boolean flag = false;
        switch (elementName.toUpperCase()) {
            case "QUIZ COUNT":
                homePageActions.verifyQuizCountElementIsNotPresentOnScreen();
                break;
            case "POLL COUNT":
                homePageActions.verifyPollCountElementIsNotPresentOnScreen();
                break;
        }
    }
    @Given("Verify {string} element is present on top")
    public void element_is_present_on_top_of_screen(String elementName) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerIsPresentOnTopOfScreen();
                break;
        }
    }
    @Given("Verify {string} element count is {string}")
    public void element_count_to_be(String elementName,String countOfElement) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerCount(countOfElement);
                break;
            case "ARTICLES":
                homePageActions.verifyArticlesCount(countOfElement);
                break;
        }
    }
    @Given("Verify {string} element count is greater than {string}")
    public void element_count_to_be_greater(String elementName,String countOfElement) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerCountIsGreater(countOfElement);
                break;
        }
    }
    @Given("Verify {string} element count can have maximum {string}")
    public void element_count_to_be_less(String elementName,String countOfElement) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerCountIsLesser(countOfElement);
                break;
        }
    }
    @Given("Verify {string} element to be swipe {string}")
    public void element_to_be_swipe(String elementName,String direction) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifySwipeActionTopBanner(direction);
                break;
            case "TOP BANNER COUNT":
                homePageActions.verifyTopBannerSwipeAccordingToCountOfCarousal(direction);
                break;
            case "NEWS":
                homePageActions.verifySwipeActionNews(direction);
                break;
            case "TOP VIEWED":
                homePageActions.verifySwipeActionTopViewed(direction);
                break;
        }
    }
    @Given("Verify {string} element to be swipe {string} with a count of {string}")
    public void element_to_be_swipe_with_count(String elementName,String direction,String count) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifySwipeActionTopBannerCount(direction,count);
                break;
            case "NEWS COUNT":
                homePageActions.verifySwipeActionNewsCount(direction,count);
                break;
            case "TOP VIEWED COUNT":
                homePageActions.verifySwipeActionTopViewedCount(direction,count);
                break;
        }
    }
    @Given("Scroll {string} into view {string} Section")
    public void scroll_into_view_section(String direction,String elementName) {
        switch (elementName.toUpperCase()){
            case "NEWS":
                scrollToElement(direction,news_Time);
                break;
            case "ARTICLES":
                scrollToElement(direction,article_Title_End);
                break;
            case "ARTICLES HEADING":
                scrollToElement(direction,article_Section);
                break;
            case "TOP VIEWED":
                scrollToElement(direction,topViewed_Title);
                scrollByDirection(direction);
                break;
            case "QUIZ":
                if(getSizeofObject("questionsData","data","total_quizzes") > 0) {
                    scrollToElement(direction, quiz_Choice);
                    scrollByDirection(direction);
                }

                break;
            case "POLL":
                if(getSizeofObject("questionsData","data","total_polls") > 0) {
                    scrollToElement(direction, poll_Choice);
                    scrollByDirection(direction);
                }

                break;

            case "MATCHES":
                scrollToElement(direction, matches_Tile);
                scrollByDirection(direction);
                break;
        }
    }
    @Given("Verify {string} screen according to file name {string}")
    public void screen_to_be_verified_with_fileData(String elementName,String fileName) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerAccordingToFile(fileName);
                break;
            case "6TH NEWS":
                homePageActions.verify6thNewsAccordingToFile(fileName);
                break;
            case "NEWS":
                homePageActions.verifyNewsAccordingToFile(fileName);
                break;
            case "QUIZ":
                homePageActions.verifyQuizAccordingToFile(fileName);
                break;
            case "POLL":
                homePageActions.verifyPollAccordingToFile(fileName);
                break;
            case "QUIZ SUMMARY":
                homePageActions.verifyQuizSummaryScreen();
                break;
            case "QUIZ SUMMARY ARROW":
                homePageActions.verifyQuizSummaryArrow();
                break;
            case "QUIZ SUMMARY ARROW FORWARD":
                homePageActions.answerMultipleQuizAccordingToFile(fileName);
                break;
            case "QUIZ SUMMARY ARROW REVIEWING COUNT":
                homePageActions.reviewingQuizCount(fileName);
                break;
            case "POLL SUMMARY":
                homePageActions.verifyPollSummaryScreen();
                break;
            case "POLL SUMMARY ARROW FORWARD":
                homePageActions.answerMultiplePollsAccordingToFile(fileName);
                break;
            case "POLL SUMMARY ARROW REVIEWING COUNT":
                homePageActions.reviewingPollCount(fileName);
                break;
            case "RIGHT QUIZ SUMMARY":
                homePageActions.verifyQuestionSummaryScreenAccordingToFile(fileName,"right");
                break;
            case "WRONG QUIZ SUMMARY":
                homePageActions.verifyQuestionSummaryScreenAccordingToFile(fileName,"wrong");
                break;
            case "QUIZ ICON":
                homePageActions.verifyQuestionAnsweredScreenAccordingToFile(fileName,"quiz");
                break;
            case "POLL PERCENTAGE":
                homePageActions.verifyQuestionAnsweredScreenAccordingToFile(fileName,"poll");
                break;
            case "LEAGUE":
                homePageActions.verifyMatchesLeagueScreen();
                break;
            case "LEAGUE HEADER":
                homePageActions.verifyLeaguesHeader(fileName);
                break;
        }
    }
    @When("Verify Validation Error {string} present on {string} screen")
    public void validation_error_on_screen(String error,String screenName) {
        switch (screenName.toUpperCase()) {
            case "CREATE ACCOUNT":
                switch (error.toUpperCase()) {
                    case "EXISTING EMAIL":
                        createAccountPageActions.existingEmailValidationError();
                        break;
                    case "EXISTING FACEBOOK EMAIL":
                        createAccountPageActions.existingFacebookEmailValidationError();
                        break;
                    case "EXISTING USERNAME":
                        createAccountPageActions.existingUserNameError();
                        break;
                    case "INVALID EMAIL":
                        createAccountPageActions.invalidEmailError();
                        break;
                }
            case "LOGIN":
                switch (error.toUpperCase()) {
                    case "USER NOT FOUND":
                        loginPageActions.userNotFoundError();
                        break;
                }
        }
    }
    @When("User clicks {string} button on {string} screen")
    public void user_click_on_button(String button,String screenName) {
        switch (screenName.toUpperCase()) {
            case "WELCOME":
                switch (button.toUpperCase()) {
                    case "CREATE ACCOUNT":
                        welcomePageActions.userClickOnCreateAccountButton();
                        break;
                    case "LOGIN":
                        welcomePageActions.userClickOnLoginButton();
                        break;
                }
                break;
            case "LOGIN":
                switch (button.toUpperCase()){
                    case "LOGIN":
                        loginPageActions.userClickOnLoginScreenButton();
                        break;
                }
                break;
        }
    }
    @Then("User fills {string} form data on {string} screen")
    public void user_fills_form_data(String formData,String screenName) throws InterruptedException {
        switch (screenName.toUpperCase()) {
            case "CREATE ACCOUNT":
                createAccountPageActions.enterDataInForm(formData);
                break;
            case "LOGIN":
                loginPageActions.enterDataInForm(formData);
                break;
            case "LOGIN FORM DATA":
                loginPageActions.enterDataInForm(formData);

        }
    }

    @Given("Create account from {string}")
    public void createAccountFrom(String user) {
        switch (user.toUpperCase()){
            case "SKIP":
                break;
            case "API ACCOUNT":
                //createRandomUser();
                break;
            case "UI":
                createAccountPageActions.verifyCreateAccountButton();
                createAccountPageActions.enterDataInForm("ALL");
                break;
        }
    }
}

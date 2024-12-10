package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeMessage;

    @CacheLookup
    @FindBy(css = "#Email")
    WebElement email;

    @CacheLookup
    @FindBy(css = "#Password")
    WebElement pass;

    @CacheLookup
    @FindBy(css = "input[value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    WebElement errorMessage;

    /**
     * This method will verify welcome message
     */
    public void verifyWelcomeMessage(String expected,String msg){
        CustomListeners.test.log(Status.PASS, "Verify welcome message");
        Reporter.log("Verify message" + welcomeMessage.toString());
        verifyText(getTextFromElement(welcomeMessage),expected,msg);
    }
    /**
     * This method will enter email
     */
    public void setEmail(String e){
        CustomListeners.test.log(Status.PASS, "Enter email ");
        Reporter.log("Enter email" + email.toString());
        sendTextToElement(email,e);
    }
    /**
     * This method will enter password
     */
    public void setPassword(String password){
        CustomListeners.test.log(Status.PASS, "Enter password ");
        Reporter.log("Enter password" + pass.toString());
        sendTextToElement(pass,password);
    }
    /**
     * This method will click on login button
     */
    public void clickOnLoginButton(){
        CustomListeners.test.log(Status.PASS, "Click on login button ");
        Reporter.log("Click on login button" + loginButton.toString());
        clickOnElement(loginButton);
    }
    /**
     * This method will verify error message
     */
    public void verifyErrorMessage(String expected,String msg){
        CustomListeners.test.log(Status.PASS, "Verify error message");
        Reporter.log("Verify error message" + errorMessage.toString());
        verifyText(getTextFromElement(errorMessage),expected,msg);
    }



}

package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement verifyRegisterText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(css = "span[for='FirstName']")
    WebElement requireFirstName;

    @CacheLookup
    @FindBy(css="span[for='LastName']")
    WebElement requireLastName;

    @CacheLookup
    @FindBy(css = "span[for='Email']")
    WebElement requireEmail;

    @CacheLookup
    @FindBy(css = "span[for='Password']")
    WebElement requirePassword;

    @CacheLookup
    @FindBy(css = "span[for='ConfirmPassword']")
    WebElement requireConfirmPassword;

    @CacheLookup
    @FindBy(css = "#gender-female")
    WebElement femaleRadioButton;

    @CacheLookup
    @FindBy(css = "#FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(css = "#LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "#Email")
    WebElement emailId;

    @CacheLookup
    @FindBy(css = "#Password")
    WebElement password;

    @CacheLookup
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement registeredUser;


    /**
     * This method will Verify computer text
     */
    public void verifyText(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "Verify computer text");
        Reporter.log("Verify computer text" + verifyRegisterText.toString());
        verifyText(getTextFromElement(verifyRegisterText), expectedText, msg);
    }
    /**
     * This method will click on register button
     */
    public void clickOnRegisterButton(){
        CustomListeners.test.log(Status.PASS, "click on register button");
        Reporter.log("click on register button" + registerButton.toString());
        clickOnElement(registerButton);
    }
    /**
     * This method will verify required first name
     */
    public void setRequireFirstName(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "verify required first name");
        Reporter.log("verify required first name" + requireFirstName.toString());
        verifyText(getTextFromElement(requireFirstName), expectedText, msg);
    }
    /**
     * This method will verify required last name
     */
    public void setRequireLastName(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "verify required last name");
        Reporter.log("verify required last name" + requireLastName.toString());
        verifyText(getTextFromElement(requireLastName), expectedText, msg);
    }
    /**
     * This method will verify required email
     */
    public void setRequireEmail(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "verify required email");
        Reporter.log("verify required email" + requireEmail.toString());
        verifyText(getTextFromElement(requireEmail), expectedText, msg);
    }
    /**
     * This method will verify required password
     */
    public void setRequirePassword(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "verify required password");
        Reporter.log("verify required password" + requirePassword.toString());
        verifyText(getTextFromElement(requirePassword), expectedText, msg);
    }
    /**
     * This method will verify required confirm password
     */
    public void setRequireConfirmPassword(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "verify required confirm password");
        Reporter.log("verify required confirm password" + requireConfirmPassword.toString());
        verifyText(getTextFromElement(requireConfirmPassword), expectedText, msg);
    }
    /**
     * This method will click on female radio button
     */
    public void clickOnFemaleRadioButton(){
        CustomListeners.test.log(Status.PASS, "click on female radio button");
        Reporter.log("click on female radio button" + femaleRadioButton.toString());
        clickOnElement(femaleRadioButton);
    }
    /**
     * This method will enter the first name
     */
    public void getFirstName(String fName){
        CustomListeners.test.log(Status.PASS, "Enter the first name");
        Reporter.log("Enter the first name" + firstName.toString());
        sendTextToElement(firstName,fName);
    }
    /**
     * This method will enter the last name
     */
    public void getLastName(String lName){
        CustomListeners.test.log(Status.PASS, "Enter the last name");
        Reporter.log("Enter the last name" + lastName.toString());
        sendTextToElement(lastName,lName);
    }
    /**
     * This method will enter the email
     */
    public void getEmail(String email){
        CustomListeners.test.log(Status.PASS, "Enter the email");
        Reporter.log("Enter the email" + emailId.toString());
        sendTextToElement(emailId,email);
    }
    /**
     * This method will enter the password
     */
    public void getPassword(String pass){
        CustomListeners.test.log(Status.PASS, "Enter the password");
        Reporter.log("Enter the password" + password.toString());
        sendTextToElement(password,pass);
    }
    /**
     * This method will enter the confirm password
     */
    public void getConfirmPassword(String cPass){
        CustomListeners.test.log(Status.PASS, "Enter the confirm password");
        Reporter.log("Enter the confirm password" + confirmPassword.toString());
        sendTextToElement(confirmPassword,cPass);
    }
    /**
     * This method will verify user registered or not
     */
    public void setVerifyRegisterText(String expectedText, String msg){
        CustomListeners.test.log(Status.PASS, "verify user registered or not");
        Reporter.log("verify user registered or not" + registeredUser.toString());
        verifyText(getTextFromElement(registeredUser),expectedText,msg);
    }

}

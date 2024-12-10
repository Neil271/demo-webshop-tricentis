package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.pages.TopMenuPage;
import com.tricentis.demowebshop.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    TopMenuPage topMenuPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage = new TopMenuPage();
        registerPage = new RegisterPage();
    }


    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        System.out.println("This test is running from sanity group ");
        //Click on the Register Link
        topMenuPage.clickOnRegisterLink();

        // Verify "Register" text
        registerPage.verifyText("Register", "user not registered");

    }

    @Test(groups = {"smoke"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {

        System.out.println("This test is running from smoke group");
        //Click on the Register Link
        topMenuPage.clickOnRegisterLink();

        //Click on the "Register" button
        registerPage.clickOnRegisterButton();

        //Verify the error message "First name is required."
        registerPage.setRequireFirstName("First name is required.", "First field empty");

        //Verify the error message "Last name is required."
        registerPage.setRequireLastName("Last name is required.", "Last field empty");

        //Verify the error message "Email is required."
        registerPage.setRequireEmail("Email is required.", "Email field empty");

        //Verify the error message "Password is required."
        registerPage.setRequirePassword("Password is required.", "Password field empty");

        //Verify the error message "Password is required."
        registerPage.setRequireConfirmPassword("Password is required.", "Confirm Password field empty");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {

        System.out.println("This test is running from regression group");

        // Click on the Register Link
        topMenuPage.clickOnRegisterLink();

        // Select gender "Female"
        registerPage.clickOnFemaleRadioButton();

        // Enter the first name
        registerPage.getFirstName("Neil");

        // Enter the last name
        registerPage.getLastName("Patel");

        // Enter email
        registerPage.getEmail("xyz133@yahoo.com");

        // Enter password
        registerPage.getPassword("xyz333@");

        // Enter Confirm Password
        registerPage.getConfirmPassword("xyz333@");

        // Click on the "Register" button
        registerPage.clickOnRegisterButton();

        // Verify the message "Your registration completed"
        registerPage.setVerifyRegisterText("Your registration completed", "Registration not successful");

    }
}

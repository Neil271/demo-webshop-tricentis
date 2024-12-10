package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.MyAccountPage;
import com.tricentis.demowebshop.pages.TopMenuPage;
import com.tricentis.demowebshop.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginPageTest extends TestBase {

    TopMenuPage topMenuPage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage = new TopMenuPage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();

    }


    @Test(groups = {"sanity"})
    public void userShouldNavigateToLoginPageSuccessFully() {

        System.out.println("This test is running from sanity group");

        //Click on the login link
        topMenuPage.clickOnLoginLink();

        //verify that the "Welcome, Please Sign In!" message display
        loginPage.verifyWelcomeMessage("Welcome, Please Sign In!", "Welcome text not displayed");


    }

    @Test(groups = {"smoke"}, dataProvider = "inValidLoginCredentials", dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String email, String password) {

        System.out.println("This test is running from smoke group");

        //Click on the login link
        topMenuPage.clickOnLoginLink();

        //Enter EmailID
        loginPage.setEmail(email);

        //Enter Password
        loginPage.setPassword(password);

        //Click on the Login Button
        loginPage.clickOnLoginButton();

        //Verify that the Error message
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        loginPage.verifyErrorMessage(expected, "Error message not displayed");

    }

    @Test(groups = {"regression"}, dataProvider = "validLoginCredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String email, String password) {

        System.out.println("This test is running from regression group");

        //Click on the login link
        topMenuPage.clickOnLoginLink();

        //Enter EmailId
        loginPage.setEmail(email);

        //Enter Password
        loginPage.setPassword(password);

        //Click on the Login Button
        loginPage.clickOnLoginButton();

        //Verify that the LogOut link is displayed
        myAccountPage.verifyLogoutLinkIsDisplayed("Log out", "Logout link not displayed");
    }

    @Test(groups = {"regression"}, dataProvider = "validLoginCredentials", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldLogOutSuccessFully(String email, String password) {

        //Click on the login link
        System.out.println("This test is running from regression group");

        topMenuPage.clickOnLoginLink();

        //Enter EmailId
        loginPage.setEmail(email);

        //Enter Password
        loginPage.setPassword(password);

        //Click on the Login Button
        loginPage.clickOnLoginButton();

        //Click on the LogOut Link
        myAccountPage.clickOnLogoutLink();

        //Verify that the LogIn Link Display
        //topMenuPage.verifyLoginLink("Log in", "Login link not displayed");
    }
}

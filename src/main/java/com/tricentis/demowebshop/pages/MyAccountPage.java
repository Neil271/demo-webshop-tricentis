package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    /**
     * This method will verify logout link displayed
     */
    public void verifyLogoutLinkIsDisplayed(String expected, String msg){
        CustomListeners.test.log(Status.PASS, "Verify logout link displayed");
        Reporter.log("Verify logout link displayed" + logoutLink.toString());
        verifyText(getTextFromElement(logoutLink),expected,msg);
    }
    /**
     * This method will click on logout link
     */
    public void clickOnLogoutLink(){
        CustomListeners.test.log(Status.PASS, "Click on logout link");
        Reporter.log("Click on logout link" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
}

package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TopMenuPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement computerTab;

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement categoriesName;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    //@FindBy(linkText = "Log in")
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    /**
     * This method will Click on computer tab
     */
    public void clickOnComputerTab() {
        CustomListeners.test.log(Status.PASS, "Click on Computer Tab");
        Reporter.log("Click on computer Tab" + computerTab.toString());
        clickOnElement(computerTab);
    }
    /**
     * This method will Click on login link
     */
    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS, "Click on Login Link");
        Reporter.log("Click on login link" + loginLink.toString());
        clickOnElement(loginLink);
    }
    /**
     * This method will verify login link
     */
    public void verifyLoginLink(String expected, String msg ){
        CustomListeners.test.log(Status.PASS, "verify login link");
        Reporter.log("verify login link" + loginLink.toString());
        verifyText(getTextFromElement(loginLink),expected,msg);
    }

    /**
     * This method will Verify computer text
     */
    public void verifyText(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, "Verify computer text");
        Reporter.log("Click on login link" + categoriesName.toString());
        verifyText(getTextFromElement(categoriesName), expectedText, msg);
    }

    /**
     * This method will click on register link
     */
    public void clickOnRegisterLink(){
        CustomListeners.test.log(Status.PASS, "Click on Register Link");
        Reporter.log("Click on Register link" + registerLink.toString());
        clickOnElement(registerLink);
    }

}

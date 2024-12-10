package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktop;

    /**
     * This method will click on Desktop
     */
    public void clickOnDesktop() {
        CustomListeners.test.log(Status.PASS, "Click on Desktop Tab");
        Reporter.log("Click on Desktop Tab" + desktop.toString());
        clickOnElement(desktop);

    }
}

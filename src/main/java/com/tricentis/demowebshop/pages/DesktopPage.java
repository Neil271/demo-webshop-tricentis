package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerProduct;


    /**
     * This method will click on build your own computer
     */
    public void clickOnBuildYourOwnComputer(){
        CustomListeners.test.log(Status.PASS, "Click on Build Your Own Computer");
        Reporter.log("Click on Desktop Tab" + buildYourOwnComputerProduct.toString());
        clickOnElement(buildYourOwnComputerProduct);
    }



}

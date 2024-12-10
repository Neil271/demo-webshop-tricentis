package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductDescriptionPage extends Utility {
    @CacheLookup
    @FindBy(css = "#product_attribute_16_5_4")
    WebElement processor;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_6_5")
    WebElement selectRAM;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_3_6_18")
    WebElement hddradioButton;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_3_6_19")
    WebElement hdd400GBradioButton;

    @CacheLookup
    @FindBy(css="#product_attribute_16_4_7_44")
    WebElement osUbuntuRadioButton;

    @CacheLookup
    @FindBy(css="#product_attribute_16_4_7_20")
    WebElement osWindows7RadioButton;

    @CacheLookup
    @FindBy(css="#product_attribute_16_4_7_21")
    WebElement osWindows10RadioButton;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_8_8_22")
    WebElement microsoftOffice;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_8_8_23")
    WebElement acrobatReader;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_8_8_24")
    WebElement totalCommander;

    @CacheLookup
    @FindBy(xpath = "//div[@class='add-to-cart-panel']/input[2]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement shoppingCartMessage;


    /**
     * This method will select processor
     */
    public void selectProcessorType(String option) {
        CustomListeners.test.log(Status.PASS, "select processor");
        Reporter.log("select processor" + processor.toString());
        selectByVisibleTextFromDropDown(processor, option);
    }

    /**
     * This method will select RAM
     */
    public void selectRAMType(String option) {
        CustomListeners.test.log(Status.PASS, "Select RAM");
        Reporter.log("Select RAM" + selectRAM.toString());
        selectByVisibleTextFromDropDown(selectRAM, option);
    }
    /**
     * This method will click on HDD Radio Button
     */
    public void clickOnHDD320GBRadioButton(String radio) {
        CustomListeners.test.log(Status.PASS, "Click on HDD Radio Button");
        Reporter.log("Click on HDD Radio Button" + hddradioButton.toString());
        clickOnElement(hddradioButton);
    }

    /**
     * This method will click on HDD Radio Button
     */
    public void clickOnHDD400GBRadioButton(String radio) {
        CustomListeners.test.log(Status.PASS, "Click on HDD Radio Button");
        Reporter.log("Click on HDD Radio Button" + hdd400GBradioButton.toString());
        clickOnElement(hdd400GBradioButton);
    }
    /**
     * This method will Click on OS Ubuntu Radio Button
     */
    public void clickOnOsUbuntuRadioButton(String osRadio) {
        CustomListeners.test.log(Status.PASS, "Click on OS Ubuntu Radio Button");
        Reporter.log("Click on OS Ubuntu Radio Button" + osUbuntuRadioButton.toString());
        clickOnElement(osUbuntuRadioButton);
    }
    /**
     * This method will Click on OS windows 7[+50.00]Radio Button
     */
    public void clickOnOsWindows7RadioButton(String osRadio) {
        CustomListeners.test.log(Status.PASS, "Click on OS windows 7[+50.00]Radio Button");
        Reporter.log("Click on OS windows 7[+50.00]Radio Button" + osWindows7RadioButton.toString());
        clickOnElement(osWindows7RadioButton);
    }
    /**
     * This method will Click on OS windows 10[+60.00]Radio Button
     */
    public void clickOnOsWindows10RadioButton(String osRadio) {
        CustomListeners.test.log(Status.PASS, "OS windows 10[+60.00]Radio Button");
        Reporter.log("OS windows 10[+60.00]Radio Button" + osWindows10RadioButton.toString());
        clickOnElement(osWindows10RadioButton);
    }

    /**
     * This method will Click microsoft office Checkbox
     */
    public void clickOnMicrosoftOfficeCheckBox(String checkbox) {
        CustomListeners.test.log(Status.PASS, "Click microsoft office Checkbox");
        Reporter.log("Click microsoft office Checkbox" + microsoftOffice.toString());
        clickOnElement(microsoftOffice);
    }
    /**
     * This method will Click acrobat reader Checkbox
     */
    public void clickOnAcrobatReaderCheckBox(String checkbox) {
        CustomListeners.test.log(Status.PASS, "Click acrobat reader Checkbox");
        Reporter.log("Click acrobat reader Checkbox" + acrobatReader.toString());
        clickOnElement(acrobatReader);
    }

    /**
     * This method will Click Commander Checkbox
     */
    public void clickOnCommanderCheckBox(String checkbox) {
        CustomListeners.test.log(Status.PASS, "Click Commander Checkbox");
        Reporter.log("Click Commander Checkbox" + totalCommander.toString());
        clickOnElement(totalCommander);
    }

    /**
     * This method will Click on Add To Cart Button
     */
    public void clickOnAddToCartButton() {
        CustomListeners.test.log(Status.PASS, "Click on Add To Cart Button");
        Reporter.log("Click on Add To Cart Button" + addToCart.toString());
        clickOnElement(addToCart);
    }

    /**
     * This method will Verify computer text
     */
    public void verifyText(String expectedText, String msg) {
        CustomListeners.test.log(Status.PASS, " Verify computer text");
        Reporter.log(" Verify computer text" + shoppingCartMessage.toString());
        verifyText(getTextFromElement(shoppingCartMessage), expectedText, msg);
    }
}

package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopPage;
import com.tricentis.demowebshop.pages.ProductDescriptionPage;
import com.tricentis.demowebshop.pages.TopMenuPage;
import com.tricentis.demowebshop.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {

    TopMenuPage topMenuPage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    ProductDescriptionPage productDescriptionPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage = new TopMenuPage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        productDescriptionPage = new ProductDescriptionPage();
    }


    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        System.out.println("This test is running from sanity group");
        //Click on the COMPUTER tab
        topMenuPage.clickOnComputerTab();

        //Verify "Computer" text
        topMenuPage.verifyText("Computers", "Computer text not displayed");
    }

    @Test(groups = {"smoke"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        System.out.println("This test is running from smoke group");
        //Click on the COMPUTER tab
        topMenuPage.clickOnComputerTab();

        //Click on the Desktops link
        computerPage.clickOnDesktop();

        //Verify "Desktops" text
        topMenuPage.verifyText("Desktops", "Desktop text not displayed");
    }

    @Test(groups = {"regression"}, dataProvider = "buildYourOwnComputerData", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        System.out.println("This test is running from regression group");

        //Click on the COMPUTER tab
        topMenuPage.clickOnComputerTab();

        //Click on the Desktops link
        computerPage.clickOnDesktop();

        //Click on the product name "Build your own computer"
        desktopPage.clickOnBuildYourOwnComputer();

        //Select processor "processor"
        productDescriptionPage.selectProcessorType(processor);

        //Select RAM "ram"
        productDescriptionPage.selectRAMType(ram);

        //Select HDD "hdd"
        if(hdd.equals("320 GB")) {
            System.out.println(hdd);
            productDescriptionPage.clickOnHDD320GBRadioButton(hdd);

        }else{
            System.out.println(hdd);
            productDescriptionPage.clickOnHDD400GBRadioButton(hdd);
        }

        //Select OS "os"
       // productDescriptionPage.clickOnOsRadioButton(os);
        if(os.equals("Ubuntu")){
            productDescriptionPage.clickOnOsUbuntuRadioButton(os);
        }else if (os.equals("Windows 7 [+50.00]")){
            productDescriptionPage.clickOnOsWindows7RadioButton(os);
        }else{
            productDescriptionPage.clickOnOsWindows10RadioButton(os);
        }

        //Select Software "software"
        if(software.equals("Microsoft Office [+50.00]")) {
            productDescriptionPage.clickOnCommanderCheckBox(software);
        }
        if(software.equals("Acrobat Reader [+10.00]")) {
            productDescriptionPage.clickOnCommanderCheckBox(software);
        }

        if(software.equals("Total Commander [+5.00]")) {
            productDescriptionPage.clickOnCommanderCheckBox(software);
        }

        //Click on "ADD TO CART" Button
        productDescriptionPage.clickOnAddToCartButton();

        //Verify the message "The product has been added to your shopping cart"
//        String actualShoppingCartMessage = productDescriptionPage.getShoppingCartMessage();
//        String expectedShoppingCartMessage = "The product has been added to your shopping cart";
//        verifyText(actualShoppingCartMessage, expectedShoppingCartMessage, "The Message The product has been added to your shopping cart is not displayed");
            productDescriptionPage.verifyText("The product has been added to your shopping cart","Product not added");

    }

}

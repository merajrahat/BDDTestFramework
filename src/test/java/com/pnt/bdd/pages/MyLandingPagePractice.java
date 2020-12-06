package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyLandingPagePractice {

    @FindBy(linkText = "AUTO")
    private WebElement clickOnAuto;

    public void userClickOnAuto() {

        clickOnAuto.click();

    }

    public void validateSlickdealsURL(){
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
    }

    public void validateAutoURL(){
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/deals/auto/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
    }

}

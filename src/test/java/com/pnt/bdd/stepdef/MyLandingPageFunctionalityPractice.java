package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.MyLandingPagePractice;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MyLandingPageFunctionalityPractice {

    private MyLandingPagePractice myLandingPagePractice;

    @Given("^user opens the browser and navigate to slickdeals\\.net$")
    public void user_opens_the_browser_and_navigate_to_slickdeals_net() {
        TestBase.setupBrowser();
        TestBase.driver.get("https://slickdeals.net");
        TestBase.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @When("^user sees the homepage$")
    public void user_sees_the_homepage() {
        myLandingPagePractice = PageFactory.initElements(TestBase.driver, MyLandingPagePractice.class);
        myLandingPagePractice.validateSlickdealsURL();
    }

    @Then("^user clicks on auto$")
    public void user_clicks_on_auto() {
        myLandingPagePractice = PageFactory.initElements(TestBase.driver, MyLandingPagePractice.class);
        myLandingPagePractice.userClickOnAuto();

    }

    @Then("^user sees auto deals$")
    public void user_sees_auto_deals() {
        myLandingPagePractice = PageFactory.initElements(TestBase.driver, MyLandingPagePractice.class);
        myLandingPagePractice.validateAutoURL();

    }

    @Then("^user closes the browser$")
    public void user_closes_the_browser() {
        TestBase.driver.close();

    }
}
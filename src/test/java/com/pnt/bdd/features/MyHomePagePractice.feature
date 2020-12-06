Feature: HomePage Functionality features

  @Smoke
  Scenario: user able to check auto deals
    Given user opens the browser and navigate to slickdeals.net
    When user sees the homepage
    Then user clicks on auto
    And user sees auto deals
    Then user closes the browser

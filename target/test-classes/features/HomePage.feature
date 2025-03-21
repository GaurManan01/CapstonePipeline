Feature: Home Page Validation

  Scenario: Verify Home Page Sections
    Given User is on UrbanLadder homepage
    Then Search box should be visible
    And Lighting & Decor section should be visible
    And Stores section should be visible

  Scenario: Search Functionality with Suggestions
    Given User is on UrbanLadder homepage
    Then User searches for "Sofa"
    



@driver
Feature:  Feature


@drive-away-insurance-outline 
  Scenario Outline: Login Check using Scenario Outline
    Given user open insurance portal website
    When user navigates to insuranc portal page
    And enter registration number as "<registrationNumber>" 
    Then user should see vehicle insurance cover start and end date and the status is "<status>"

    Examples: 
      | registrationNumber | status |
      | OV12UYY            | Pass   |
      
     

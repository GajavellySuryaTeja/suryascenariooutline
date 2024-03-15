Feature: Orangehrm login

  Scenario Outline: valid credintials in Orangehrm
    Given open browser
    And valid "<username>" and "<password>"
    Then click on login

    Examples: 
      | username   | password  |
      | Admin      | admin123  |
      | suryateja  | surya123  |
      | akhilkumar | akhil4526 |

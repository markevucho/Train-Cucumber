Feature: Multiplication of integers


  Scenario: go to input numbers page
    Given open Home Page of Primitive Calculator
    When click on "Go to input numbers page"
    Then get Primitive Calculator input numbers page

  Scenario Outline: integers multiplication
    Given go to input numbers page
    When enter <first> and <second>
    And click "Calculate"
    Then go to Result Page
    And get result <result>

    Examples:
    |first|second|result|
    |5    |10    |50    |
    |12   |2     |24    |
    |10   |4     |40    |



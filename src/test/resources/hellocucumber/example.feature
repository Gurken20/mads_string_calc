Feature: An example

  Scenario: Adding empty string
    #Given an example scenario
    When adding calculating the string ""
    Then the calculator returns 0

  Scenario: Adding "1" string
    #Given an example scenario
    When adding calculating the string "1"
    Then the calculator returns 1


  Scenario: Adding "1,2" string
    #Given an example scenario
    When adding calculating the string "1,2"
    Then the calculator returns 3

  Scenario: Adding "1,2,5,6,7" string
    #Given an example scenario
    When adding calculating the string "1,2,5,6,7"
    Then the calculator returns 21

  Scenario: Adding "1\n2" string
    #Given an example scenario
    When adding calculating the string "1\n2"
    Then the calculator returns 3

  Scenario: Adding "1\n2\n5\n6\n7" string
    #Given an example scenario
    When adding calculating the string "1\n2\n5\n6\n7"
    Then the calculator returns 21

  Scenario: Adding "1,2,5\n6\n7" string
    #Given an example scenario
    When adding calculating the string "1,2,5\n6\n7"
    Then the calculator returns 21
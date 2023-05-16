Feature: Builder design pattern

  Scenario: Create custom pizza
    Given a pizza builder
    When the customer selects toppings and size
    Then a custom pizza should be created with the selected options
  
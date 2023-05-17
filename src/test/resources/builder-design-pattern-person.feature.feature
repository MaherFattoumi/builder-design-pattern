Feature: Create a Person using Builder pattern

Scenario: Create a Person with basic information
	Given a person builder
  When I set the first name as "John"
  And I set the last name as "Doe"
  Then the person should have the first name "John"
  And the person should have the last name "Doe"
  
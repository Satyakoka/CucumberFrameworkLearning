#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Amazon Search
Scenario: Search a product
Given I have a search page on Amazon
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed
#WHEN WE RUN THE ABOVE FEATURE FILE IT DOESNT WORK IT THROWS AN ERROR BCOZ THE STEP DEFINITIONS ARE NOT CREATED 
#GIVEN WHEN THEN 
#SO CREATE ANOTHER PACKAGE stefdefintions and create class called step definitions class
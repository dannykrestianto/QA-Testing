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
@Test1
Feature: Keranjang

  Scenario Outline: Menambah item kedalam keranjang
    Given User menuju homepage
    When User mencari item <keyword>
    And User klik tombol search
    And User klik item
    Then User klik tombol add to cart
    And User klik tombol shopping cart
    And User melihat item di shopping cart
    

    Examples: 
      | keyword  |
      |   Mac    |
      
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
@Hosting
Feature: Hosting Unlimited
  User membeli Unlimited Hosting

  Scenario Outline: Checkout paket unlimited
    Given User menuju website Niagahoster
    And User login
    And User memasukkan <username> dan <password>
    When User kembali ke halaman utama
    And User memilih menu Hosting Unlimited
    And User memilih paket
    And User pilih jangka waktu berlangganan
    Then User registrasi <domain>
    And User melanjutkan setelah domain tersedia
    And User menambah fitur paket
    And User lanjut
    And User checkout
    And User konfirmasi
    And User tergistrasi dengan paket yang dipilih

    Examples: 
      |            username            |         password         |     domain      | 
      | danny.krestianto@hostinger.com | JaobsbVDc5MtEDhB7FSlLg== | loremipsumdolorsit |
      
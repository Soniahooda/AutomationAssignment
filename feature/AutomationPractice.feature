Feature: Launch Application
    @OrderShirt
    Scenario: Order t-shirt and verify in Order History
      Given I loggedIn into application with email address as "sonia.hooda2509@gmail.com" and password as "shooda"
      When  I go to T-shirt page and add a T-shirt into cart
      And   I place order by doing payment
      Then  i can see order in order History

  @ChangeName
  Scenario Outline: update first name of Logged in User
    Given I loggedIn into application with email address as "sonia.hooda2509@gmail.com" and password as "shooda"
    When I click on My Personal Info
    And I enter "<Firstname>" and "<password>" as
    And I click on Save Button
    Then I can see updated name of user next to Signout option
    Examples:
      |Firstname|password|
      |soniaaa    |shooda|


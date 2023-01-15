Feature: Add contact

  Background:
    Given I am logged in

  @add_new_contact
  Scenario: Clicking on the Add new contact button really opens the window for adding a contact
    When I click on Add new contact button
    Then I see window with an inscription

      """
      Добавить контакт
      """

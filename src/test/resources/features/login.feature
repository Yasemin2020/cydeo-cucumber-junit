@Regression @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  @Librarian
  Scenario: Login as librarian
    When user enter librarian username
    And user enters librarian password
    Then user should see dashboard

  @student @db
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see dashboard

#this is how we add comments in feature file


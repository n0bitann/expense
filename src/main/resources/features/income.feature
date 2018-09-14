Feature: Income
    As a user
    I can add money and see income
    so that I can know money I have

Scenario: Add Income
    Given a user have 0 balance
    When I earn 100 from other
    Then I have balance 100


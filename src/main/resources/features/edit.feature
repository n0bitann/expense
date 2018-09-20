Feature: Edit
    As a User I can edit my income and spend history
    so that I can see my new transaction

Scenario: Edit receive
    Give a user has 100 bucks and description " recieve from dad 100 "
    When edit description to " recieve from dad 200"
    Then user money is 300

Scanario: Edit spend
    Give a user has 400 bucks and description " spend for food 200 "
    When edit description to " spend for food 100 "
    Then user has 300

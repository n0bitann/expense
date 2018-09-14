Feature : Spend
    As a user
    I can send money and see how many I spend
    so that I can see how many money I have

Scenario: Spend money
     Given a user 300 in balance
     When I use 50 of money to buy something
     Then I have 250 monry left


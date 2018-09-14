package csku;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefAccount {
    Account account;

    @Before
    public void intit(){
        account = new Account();
    }

    @Given("user have (\\d+) in ballance")
    public void user_have_in_balance(int amount){
        account = new Account(amount);
    }
    @When("I use (\\d+) of money from (.*)")
    public void i_use_money(int amount){
        account.addToSpend(amount);
    }



}

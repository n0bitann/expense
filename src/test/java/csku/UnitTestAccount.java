package csku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestAccount {
    Account account;

    @BeforeEach
    void init(){
        account = new Account();
        account.recieve(100);

    }

    @Test
    void testReceive(){
        account.recieve(100);
        assertEquals(200,account.getMoney());
    }

    @Test
    void testSpend(){
        account.spend(100);
        assertEquals(0,account.getMoney());

    }
}

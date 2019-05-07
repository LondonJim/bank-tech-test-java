package first.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
  
    @Test public void testAccountHasABalance() {
        Account accountOne = new Account();
        assertEquals(0.00, accountOne.balance, 0.00);
        Account accountTwo = new Account(100.00, 200.00);
        assertEquals(100.00, accountTwo.balance, 0.00);
    }

    @Test public void testAccountHasAnOverdraft() {
        Account accountOne = new Account();
        assertEquals(0.00, accountOne.overdraft, 0.00);
        Account accountTwo = new Account(100.00, 200.00);
        assertEquals(200.00, accountTwo.overdraft, 0.00);
    }
}

package first.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

  @Test public void testCurrentBalanceReturnsDouble() {
    Account accountOne = new Account();
    assertEquals(0.00, accountOne.currentBalance(), 0.00);
    Account accountTwo = new Account(100.00, 200.00);
    assertEquals(100.00, accountTwo.currentBalance(), 0.00);
  }

  @Test public void testCurrentOverdraftReturnsDouble() {
    Account accountOne = new Account();
    assertEquals(0.00, accountOne.currentOverdraft(), 0.00);
    Account accountTwo = new Account(100.00, 200.00);
    assertEquals(200.00, accountTwo.currentOverdraft(), 0.00);
  }
}

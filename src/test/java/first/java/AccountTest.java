package first.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountTest {

  @Test
  @DisplayName("instantiate with 0.00 balance, overdraft")
  public void testCurrentBalanceReturnsDouble() {
    Account accountOne = new Account();
    assertEquals(0.00, accountOne.currentBalance(), 0.00);
    Account accountTwo = new Account(100.00, 200.00);
    assertEquals(100.00, accountTwo.currentBalance(), 0.00);
  }

  @Test
  @DisplayName("instantiate with balance and overdraft")
  public void testCurrentOverdraftReturnsDouble() {
    Account accountOne = new Account();
    assertEquals(0.00, accountOne.currentOverdraft(), 0.00);
    Account accountTwo = new Account(100.00, 200.00);
    assertEquals(200.00, accountTwo.currentOverdraft(), 0.00);
  }

  @Test
  @DisplayName("#deposit returns correct balance")
  public void testDepositReturnsBalance() {
    Account account = new Account();
    assertEquals(90.99, account.deposit(90.99), 0.00);
    assertEquals(100.99, account.deposit(10.00), 0.00);
  }

  @Test
  @DisplayName("#withdraw returns correct balance")
  public void testWithdrawReturnsCorrectBalance() {
    Account account = new Account();
    account.deposit(100.00);
    assertEquals(40.00, account.withdraw(60.00), 0.00);
  }

  @Test
  @DisplayName("#withdraw returns correct balance when amount is over overdraft")
  public void testWithdrawReturnsSameBalance() {
    Account account = new Account();
    account.deposit(100.00);
    assertEquals(100.00, account.withdraw(110.00), 0.00);
  }

}

package first.java;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

  private AccountStatement accountStatementMock;

  @Before
  public void setUp() {
    accountStatementMock = mock(AccountStatement.class);
    when(accountStatementMock.addToTransactions(100.00, 100.00))
      .thenReturn("26/10/1986 || 100.0 || || 100.0");
    when(accountStatementMock.displayStatement())
      .thenReturn("Date || credit || debit || balance \n26/10/1986 || 100.0 || || 100.0");
  }

  // .Account instantiation #currentBalance
  @Test
  public void testCurrentBalanceReturnsDouble() {
    Account accountOne = new Account(accountStatementMock);
    assertEquals(0.00, accountOne.currentBalance(), 0.00);
    Account accountTwo = new Account(accountStatementMock, 100.00, 200.00);
    assertEquals(100.00, accountTwo.currentBalance(), 0.00);
  }

  // .Account instantiation #currentOverdraft
  @Test
  public void testCurrentOverdraftReturnsDouble() {
    Account accountOne = new Account(accountStatementMock);
    assertEquals(0.00, accountOne.currentOverdraft(), 0.00);
    Account accountTwo = new Account(accountStatementMock, 100.00, 200.00);
    assertEquals(200.00, accountTwo.currentOverdraft(), 0.00);
  }

  // #deposit
  @Test
  public void testDepositReturnsBalance() {
    Account account = new Account(accountStatementMock);
    assertEquals(90.99, account.deposit(90.99), 0.00);
    assertEquals(100.99, account.deposit(10.00), 0.00);
  }

  // #withdraw
  @Test
  public void testWithdrawReturnsCorrectBalance() {
    Account account = new Account(accountStatementMock);
    account.deposit(100.00);
    assertEquals(40.00, account.withdraw(60.00), 0.00);
  }

  @Test
  public void testWithdrawReturnsSameBalance() {
    Account account = new Account(accountStatementMock);
    account.deposit(100.00);
    assertEquals(100.00, account.withdraw(110.00), 0.00);
  }

  // #statementUpdate
  @Test
  public void testStatementUpdateReturnsString() {
    Account account = new Account(accountStatementMock);
    assertEquals("26/10/1986 || 100.0 || || 100.0", account.statementUpdate(100.00, 100.00));
  }

  // #displayStatement
  @Test
  public void testDisplayStatementReturnsString() {
    Account account = new Account(accountStatementMock);
    assertEquals("Date || credit || debit || balance \n26/10/1986 || 100.0 || || 100.0", account.displayStatement());
  }
}

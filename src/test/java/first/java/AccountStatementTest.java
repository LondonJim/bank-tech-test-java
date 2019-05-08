package first.java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Date;

public class AccountStatementTest {

  @Test
  public void testAccountStatementInstantiatesWithArray() {
    AccountStatement accountStatement = new AccountStatement();
    ArrayList emptyArrayList = new ArrayList<>();
    assertEquals(emptyArrayList, accountStatement.returnStatement());
  }

  @Test
  public void testAddToTransactionsReturnsLastTransactions() {
    AccountStatement accountStatement = new AccountStatement();
    AccountStatement accountStatementMock = spy(AccountStatement.class);
    when(accountStatementMock.parseCurrentDate()).thenReturn("26-10-1986");
    assertEquals("26-10-1986 || 100.0 || || 100.0", accountStatementMock.addToTransactions(100.00, 100.00));
  }

  @Test
  public void testParseCurrentDateReturnsDateString() {
    AccountStatement accountStatement = new AccountStatement();
    AccountStatement accountStatementMock = spy(AccountStatement.class);
    Date date = new Date(85, 9, 26);
    when(accountStatementMock.returnDate()).thenReturn(date);
    assertEquals("26-10-1985", accountStatementMock.parseCurrentDate());
  }

}
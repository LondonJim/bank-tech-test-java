package first.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;

public class AccountStatementTest {

  @Test
  @DisplayName("instantiate with empty transactions array")
  public void testAccountStatementInstantiatesWithArray() {
    AccountStatement accountStatement = new AccountStatement();
    ArrayList emptyArrayList = new ArrayList<>();
    assertEquals(emptyArrayList, accountStatement.returnStatement());
  }

  @Test
  @DisplayName("return transactions")
  public void testAddToTransactionsReturnsTransactions() {

  }

  @Test
  @DisplayName("returns the date string")
  public void testParseCurrentDateReturnsDateString() {
    AccountStatement accountStatement = new AccountStatement();
    Date date = new Date(1985, 10, 26);
    assertSame("26/10/1985", accountStatement.parseCurrentDate(date));
  }

}

package first.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    Date testDate = new Date();
    assertEquals(testDate, accountStatement.parseCurrentDate(testDate));
  }

}

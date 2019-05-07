package first.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class AccountStatementTest {

  @Test
  @DisplayName("instantiate with empty transactions array")
  public void testAccountStatementInstantiatesWithArray() {
    AccountStatement accountStatement = new AccountStatement();
    ArrayList emptyArrayList = new ArrayList<>();
    assertEquals(emptyArrayList, accountStatement.returnStatement());
  }

  @Test
  @DisplayName("returns the date string")
  public void testAddToTransactionsReturnsDateString() {
    AccountStatement accountStatement = new AccountStatement();
    String testString = "07-05-2019";
    assertEquals(testString, accountStatement.addToTransactions(0.00, 0.00));
  }

}

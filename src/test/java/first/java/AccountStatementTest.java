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

}

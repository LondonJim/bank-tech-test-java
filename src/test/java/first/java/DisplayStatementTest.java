package first.java;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class DisplayStatementTest {

  private DisplayStatement displayStatement = DisplayStatement.getInstance();

  // #display
  @Test
  public void testDisplayReturnsString() {
    ArrayList transactions = new ArrayList<>();
    transactions.add("26-10-1986 || 100.0 || || 100.0\n");
    transactions.add("27-10-1986 || 150.0 || || 250.0\n");
    transactions.add("28-10-1986 || 50.0 || || 300.0\n");
    String transactionsExample = "date || credit || debit || balance\n28-10-1986 || 50.0 || || 300.0\n27-10-1986 || 150.0 || || 250.0\n26-10-1986 || 100.0 || || 100.0\n";
    assertEquals(transactionsExample, displayStatement.display(transactions));
  }

}

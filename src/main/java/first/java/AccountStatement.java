package first.java;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Format;

public class AccountStatement {

  private ArrayList transactions = new ArrayList<>();

  public AccountStatement() {
    ArrayList transactions[];
  }

  public String addToTransactions(double amount, double balance) {
    String currentDate = parseCurrentDate();
    String amountStr = String.valueOf(amount);
    String balanceStr = String.valueOf(balance);

    if (amount >= 0) {
      transactions.add(currentDate + " || " + amountStr + " || || " + balanceStr);
    } else {
      transactions.add(currentDate + " || || " + balanceStr.substring(1) + " || " + balanceStr);
    }

    return String.valueOf(transactions.get(transactions.size() -1));
  }

  public String displayStatement() {
    // static method in .DisplayStatement
    return DisplayStatement.display(transactions);
  }

  public String parseCurrentDate() {
    Date date = returnDate();
    String pattern = "dd-MM-yyyy";
    Format formatter = new SimpleDateFormat(pattern);
    String currentDate = formatter.format(date);
    return currentDate;
  }

  public Date returnDate() {
    return new Date();
  }
}

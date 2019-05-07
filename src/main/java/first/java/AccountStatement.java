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

  public ArrayList returnStatement() {
    return transactions;
  }

  public void addToTransactions(double amount, double balance) {

  }

  public String parseCurrentDate(Date date) {
    String pattern = "dd-MM-yyyy";
    Format formatter = new SimpleDateFormat(pattern);
    String currentDate = formatter.format(date);
    return currentDate;
  }

  public Date date() {
    return new Date();
  }
}

package first.java;

public class Account {

  double balance;
  double overdraft;

  public Account() {
    double balance = 0.00;
    double overdraft = 0.00;
  }

  public Account(double balance, double overdraft) {
    this.balance = balance;
    this.overdraft = overdraft;
  }

}

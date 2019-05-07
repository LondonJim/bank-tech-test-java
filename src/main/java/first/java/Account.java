package first.java;

public class Account {

  private double balance;
  private double overdraft;

  public Account() {
    double balance = 0.00;
    double overdraft = 0.00;
  }

  public Account(double balance, double overdraft) {
    this.balance = balance;
    this.overdraft = overdraft;
  }

  public double currentBalance() {
    return balance;
  }

  public double currentOverdraft() {
    return overdraft;
  }

}

package first.java;

public class Account {

  private AccountStatement accountStatement;
  private double balance;
  private double overdraft;

  public Account() {
    this.accountStatement = new AccountStatement();
    this.balance = 0.00;
    this.overdraft = 0.00;
  }

  public Account(AccountStatement accountStatement) {
    this.accountStatement = accountStatement;
    this.balance = 0.00;
    this.overdraft = 0.00;
  }

  public Account(AccountStatement accountStatement, double balance, double overdraft) {
    this.accountStatement = accountStatement;
    this.balance = balance;
    this.overdraft = overdraft;
  }

  public double currentBalance() {
    System.out.println(balance);
    return balance;
  }

  public double currentOverdraft() {
    System.out.println(overdraft);
    return overdraft;
  }

  public double deposit(double amount) {
    balance += amount;
    statementUpdate(amount, balance);
    return balance;
  }

  public double withdraw(double amount) {
    if (balance - amount >= overdraft) {
      balance -= amount;
      statementUpdate(-amount, balance);
    };
    return balance;
  }

  public String statementUpdate(double amount, double balance) {
    return accountStatement.addToTransactions(amount, balance);
  }

  public String displayStatement() {
    String returnedStatement = accountStatement.displayStatement();
    System.out.println(returnedStatement);
    return returnedStatement;
  }

}

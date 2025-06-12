public class Bank {
  int balance = 1000;

  public static void main(String[] args) {
    new Bank().transfer(200);
  }

  void transfer(int amount) {
    withdraw(amount);
    deposit(amount);
    System.out.println("Transfer complete. Balance: " + balance);
  }

  void withdraw(int amount) {
    if (authWithdraw()) {
      balance -= amount;
    }
  }

  boolean authWithdraw() {
    return checkBalance();
  }

  boolean checkBalance() {
    // int x = 10 / 0;
    return balance >= 0;
  }

  void deposit(int amount) {
    if (authDeposit()) {
      balance += amount;
    }
  }

  boolean authDeposit() {
    return updateLedger();
  }

  boolean updateLedger() {
    // int x = 10 / 0;
    return true;
  }
}

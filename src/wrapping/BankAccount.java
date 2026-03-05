package wrapping;

public class BankAccount {
    private double balance;
    public int number;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
        else {
            this.balance = 0;
        }
    }
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }
    public void deposit(double amount) {
        this.balance += amount;

    }
}

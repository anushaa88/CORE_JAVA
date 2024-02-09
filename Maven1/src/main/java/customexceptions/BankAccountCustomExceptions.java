package customexceptions;

// BankAccount class
public class BankAccountCustomExceptions {
    private double balance;

    // Constructor
    public BankAccountCustomExceptions(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw more than the balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
    }
}

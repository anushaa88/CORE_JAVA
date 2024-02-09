package test_customexceptions;

import customexceptions.BankAccountCustomExceptions;
import customexceptions.InsufficientFundsException;
import customexceptions.InvalidWithdrawalException;

import java.util.Scanner;

// Main class for testing
public class TestCustomExceptions {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccountCustomExceptions account = new BankAccountCustomExceptions(1000);

        // Demonstrate withdrawals
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter withdrawal amount: $");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}

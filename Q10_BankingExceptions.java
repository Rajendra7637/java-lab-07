import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Q10_BankAccount {
    private double balance;

    Q10_BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient account balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

public class Q10_BankingExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q10_BankAccount account = new Q10_BankAccount(1000);
        try {
            System.out.print("Enter withdrawal amount: ");
            account.withdraw(sc.nextDouble());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

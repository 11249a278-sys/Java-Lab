class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Withdrawal cannot be completed."
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Withdrawn Amount : " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class ATMExample {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        try {
            atm.withdraw(7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
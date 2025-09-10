// 1. Banking System – Insufficient Balance

// You are building a banking system. A user tries to withdraw more money than available in their account.

// Which exception would you throw?

// Will you use a checked or unchecked exception? Why?

// Write a custom exception InsufficientBalanceException.

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String masseg) {
        super(masseg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialbalance) {
        this.balance = initialbalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("hello your bank balance is not enogh ");
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10000);
        b1.getBalance();
        try{
            b1.withdraw(6000);
            System.out.println("your balance " + b1.getBalance());
            b1.withdraw(5000);
            System.out.println("your balance " + b1.getBalance());
            

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
         System.out.println(b1.getBalance());

        }
    }
}
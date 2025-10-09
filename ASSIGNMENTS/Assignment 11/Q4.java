/*
Problem 4: Banking System 🏦

Abstract class BankAccount:

accountNumber, balance fields

abstract methods: deposit(), withdraw()

concrete method showBalance()

Subclasses:

SavingsAccount (cannot withdraw below ₹1000)

CurrentAccount (no min balance required)

Interface LoanEligible with method checkLoanEligibility().

Only SavingsAccount is loan eligible.
*/

abstract class BankAccount {

    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        if (balance < 1000)
            System.out.println(" you have to put atleast 5000 in your account ");
        else
            this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    abstract void deposit(int amount);

    abstract void withdraw(int amount);

    void showBalance() {
        System.out.println(this.getBalance());
    }

}

interface LoanEligible {
    void checkLoanEligibility();

}

class SavingsAccount extends BankAccount implements LoanEligible {

    public SavingsAccount(int accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public void checkLoanEligibility() {
        if (this.getBalance() < 10000) {
            System.out.println("not eligible for loan");
        }
    }

    @Override
    void deposit(int amount) {
        System.out.println("depositing " + amount);
        this.setBalance(this.getAccountNumber() + amount);

    }

    @Override
    void withdraw(int amount) {
        if (amount < 1000) {
            System.out.println("you cannot withdraw < 1000 your account balance is :" + this.getBalance());
        } else if (amount > this.getBalance())
            System.out.println("balance low " + this.getBalance());
        else {
            System.out.println("withdrawing " + amount);
            this.setBalance(this.getBalance() - amount);
        }
    }

}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, int balance) {
        super(accountNumber, balance);

    }

    @Override
    void deposit(int amount) {
        System.out.println("depositing " + amount);
        this.setBalance(this.getAccountNumber() + amount);
    }

    @Override
    void withdraw(int amount) {
        if (amount > this.getBalance())
            System.out.println("balance low " + this.getBalance());
        else {
            System.out.println("withdrawing " + amount);
            this.setBalance(this.getBalance() - amount);
        }
    }
}

class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, 12000);
        System.out.println("Savings Account created with balance: " + sa.getBalance());
        sa.deposit(3000);
        sa.showBalance();
        sa.withdraw(2000);
        sa.showBalance();
        sa.checkLoanEligibility();
        System.out.println("-------------------------");

        CurrentAccount ca = new CurrentAccount(102, 8000);
        System.out.println("Current Account created with balance: " + ca.getBalance());
        ca.deposit(4000);
        ca.showBalance();
        ca.withdraw(10000);
        ca.showBalance();
    }
}
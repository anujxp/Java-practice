// 7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
import java.util.ArrayList;
class Account {
    private String name;
    private int accountNumber;
    private double balance;
    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
class Bank{
    private ArrayList<Account> accounts = new ArrayList<>();
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Name: " + account.getName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println();
        }
    }

}
class TestMain {
    public static void main(String[] args){
        Bank bank = new Bank();
        Account account1 = new Account("John", 123456, 1000.0);
        Account account2 = new Account("Jane", 789012, 500.0);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.deposit(account1, 500.0);
        bank.withdraw(account2, 200.0);
        bank.displayAccounts();     
        bank.removeAccount(account1);
        bank.displayAccounts();         

    }
}


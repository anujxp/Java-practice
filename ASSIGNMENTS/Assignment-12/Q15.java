// 5. ATM PIN Validation

// If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.

// Which exception handling mechanism will you use?

// Should it be checked (force the programmer to handle) or unchecked?
import java.util.Scanner;

class AccountLockedException extends Exception {
    public AccountLockedException(String msg) {
        super(msg);
    }
}

class ATM {
    private final int pin;
    private int count = 0;
    private boolean status = false;

    public ATM(int pin) {
        this.pin = pin;
    }

    public void check(int pin) throws AccountLockedException {
        if (this.pin == pin) {
            System.out.println("correct");

        } else
            throw new AccountLockedException("Incorrect Pin : remaining chance " + (2 - this.count));
    }

    public void pinValidation() {
        Scanner se = new Scanner(System.in);
        while (this.count < 3 && !this.status) {
            try {
                int pin1 = se.nextInt();
                check(pin1);
                this.status = true;
            } catch (AccountLockedException e) {
                System.out.println(e.getMessage());
                se.nextLine();
                this.count++;
            }
        }
        if (!status) {
            System.out.println("You havae exceeded the limit ");
            System.out.println("your account is blocked ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        ATM a1 = new ATM(1234);
        System.out.println("enter you r pin for pin validation------");
        a1.pinValidation();
    }

}
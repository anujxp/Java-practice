/*-------------------------------------------------
🔹 Problem Set on Abstract Class, Inheritance & Interface
Problem 1: Payment Gateway System 💳

Create an abstract class Payment with:

amount field

abstract method pay()

concrete method paymentDetails()

Subclasses:

CreditCardPayment

DebitCardPayment

UPIPayment

Create an interface Refundable with processRefund() method.

Only CreditCardPayment and UPIPayment should implement Refundable.

In main class, create different payments and process refund where applicable.

*/
//____-----------------------------payment gateway

// abstract class Paymentwith{
//     private int amount;
//     public Paymentwith(int amount)
//     {
//         this.amount = amount;

//     }
//     abstract void pay();
//     void paymentDetails(){
//         System.out.println("payment done");
//     }

// }
// // Interface Refundable
interface Refundable {
    void processRefund(double refundAmount);
}

// Abstract class Payment
abstract class Payment {
    protected double amount;   // field

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    public abstract void pay();

    // Concrete method
    public void paymentDetails() {
        System.out.println("Payment of ₹" + amount + " is being processed.");
    }
}

class CreditCardPayment extends Payment implements Refundable {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    public void pay(){
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }

    public void processRefund(double refundAmount) {
        System.out.println("Refund of ₹" + refundAmount + " processed to Credit Card: " + cardNumber);
    }
}

class DebitCardPayment extends Payment {
    private String cardNumber;

    public DebitCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void pay() {
        System.out.println("Paid ₹" + amount + " using Debit Card: " + cardNumber);
    }
}


class UPIPayment extends Payment implements Refundable {
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

  
    public void pay() {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }

   
    public void processRefund(double refundAmount) {
        System.out.println("Refund of ₹" + refundAmount + " processed to UPI ID: " + upiId);
    }
}


 class Main {
    public static void main(String[] args) {
      
        Payment p1 = new CreditCardPayment(5000, "1234-5678-9012-3456");
        Payment p2 = new DebitCardPayment(2000, "4321-8765-2109-6543");
        Payment p3 = new UPIPayment(1500, "anuj@upi");
        p1.paymentDetails();
        p1.pay();
        p2.paymentDetails();
        p2.pay();
        p3.paymentDetails();
        p3.pay();
        System.out.println("---- Processing Refunds ----");
        if (p1 instanceof Refundable) {
            ((Refundable)p1).processRefund(1000);
        }
        if (p2 instanceof Refundable) {
            ((Refundable)p2).processRefund(500);
        } else {
            System.out.println("Debit Card payment cannot be refunded.");
        }
        if (p3 instanceof Refundable) {
            ((Refundable)p3).processRefund(700);
        }
    }
}



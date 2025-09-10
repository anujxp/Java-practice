// 4. E-commerce Discount Calculation

// Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?

// Which exception will occur?

// How will you ensure the program continues and doesn’t stop execution?
class Product{
    private int quantity;
    // int totalamount;
    public Product(int n) {
        this.quantity = n;
        // this.totalamount = amount;
    }
    public int getQuantity() {
        return quantity;
    }

}

class Main {
    static void getPerItemprice(int quantity, int amount) {
        int price = amount / quantity;

        System.out.println(price);
    }

    public static void main(String[] args) {
        Product p1 = new Product(4);
        Product p2 = new Product(0);
        try{
            getPerItemprice(p1.getQuantity(), 400);
            getPerItemprice(p2.getQuantity(), 400);
        } catch (ArithmeticException e) {
            System.out.println("exception cought :"+ e.getMessage());
        }

    }
}
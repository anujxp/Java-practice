import java.util.ArrayList;
import java.util.List;

class Product {
    private Double price;

    // Constructor
    public Product(Double price) {
        this.price = price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}

class Main {
    public static double calculateTotal(List<Product> cart) {
        double total = 0.0;
        for (Product product : cart) {
            Double price = product.getPrice();
            total += (price != null) ? price : 0.0; // default to 0.0
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> ps = new ArrayList<>();

        ps.add(new Product(1.99)); // Apple with price
        ps.add(new Product(null)); // Banana with null price

        double total = calculateTotal(ps);
        System.out.println("Total: " + total);
    }
}

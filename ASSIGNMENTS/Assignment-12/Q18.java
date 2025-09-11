import java.util.ArrayList;
import java.util.List;

class Product {
    private Double price;

    
    public Product(Double price) {
        this.price = price;
    }

    public void setPrice(Double price) {
        this.price = price;
    } // if (price != null)
      // total += price;
      // else
      // throw new NullPointerException();

    public Double getPrice() {
        return price;
    }
}

class Main {
    public static double calculateTotal(List<Product> cart) {
        double total = 0.0;
        for (Product product : cart) {
            Double price = product.getPrice();
            // total += (price != null) ? price : throw new NullPointerException(); // default to 0.0
            // if (price != null)
            //     total += price;
            // else
            //     throw new NullPointerException();
            try{
                total += price;
            }
            catch (NullPointerException e) {
                continue;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> ps = new ArrayList<>();

        ps.add(new Product(1.99)); 
        ps.add(new Product(null)); 

        double total = calculateTotal(ps);
        System.out.println("Total: " + total);
    }
}

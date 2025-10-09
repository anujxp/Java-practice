import java.util.ArrayList;

// Product class
class Product {
    String name;
    int quantity;

    // Constructor
    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Method to display product
    void display() {
        System.out.println("Product: " + name + ", Quantity: " + quantity);
    }
}

// Inventory class
class Inventory {
    ArrayList<Product> products;  // Collection of products

    // Constructor
    Inventory() {
        products = new ArrayList<Product>();
    }

    // Add product
    void addProduct(String name, int quantity) {
        products.add(new Product(name, quantity));
        System.out.println(name + " added successfully.");
    }

    // Remove product by name
    void removeProduct(String name) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(name)) {
                products.remove(i);
                System.out.println(name + " removed successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " not found in inventory.");
        }
    }

    // Check for low inventory
    void checkLowInventory(int threshold) {
        System.out.println("Products with quantity less than " + threshold + ":");
        for (Product p : products) {
            if (p.quantity < threshold) {
                p.display();
            }
        }
    }

    // Display all products
    void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product p : products) {
            p.display();
        }
    }
}

// Main class
 class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        // Adding products
        inv.addProduct("Pen", 50);
        inv.addProduct("Notebook", 5);
        inv.addProduct("Eraser", 2);

        // Display inventory
        inv.displayInventory();

        // Check low inventory
        inv.checkLowInventory(10);

        // Remove a product
        inv.removeProduct("Notebook");

        // Display after removal
        inv.displayInventory();
    }
}

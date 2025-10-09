import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Objects;

/**
 * Simple showroom example:
 * - Category and Product override equals/hashCode (based on name)
 * - ShowRoom manages a Map<Category, Set<Product>>
 * - Interactive menu in main()
 */
class Category {
    private String category;

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return category;
    }

    // Important: equals & hashCode so HashMap/HashSet behave by category name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category other = (Category) o;
        return Objects.equals(category, other.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return name;
    }

    // equals & hashCode so HashSet<Product> works by product name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product other = (Product) o;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class ShowRoom {
    // Map from Category to set of Products
    private Map<Category, Set<Product>> items;

    public ShowRoom() {
        this.items = new HashMap<>();
    }

    public ShowRoom(Map<Category, Set<Product>> items) {
        this.items = items;
    }

    // Add a new category (if not exists)
    public void addCategory(String categoryName) {
        Category c = new Category(categoryName);
        items.putIfAbsent(c, new HashSet<>());
    }

    // Add product to a category (creates category if not present)
    public void addProductToCategory(String categoryName, String productName) {
        Category c = new Category(categoryName);
        items.putIfAbsent(c, new HashSet<>());
        items.get(c).add(new Product(productName));
    }

    // Remove a product from a category (returns true if removed)
    public boolean removeProductFromCategory(String categoryName, String productName) {
        Category c = new Category(categoryName);
        Set<Product> set = items.get(c);
        if (set == null) return false;
        return set.remove(new Product(productName));
    }

    // Remove entire category
    public boolean removeCategory(String categoryName) {
        Category c = new Category(categoryName);
        return items.remove(c) != null;
    }

    // Display inventory
    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Showroom is empty.");
            return;
        }
        System.out.println("Showroom Inventory:");
        for (Map.Entry<Category, Set<Product>> e : items.entrySet()) {
            System.out.println("- Category: " + e.getKey().getCategory());
            Set<Product> prods = e.getValue();
            if (prods.isEmpty()) {
                System.out.println("   (no products)");
            } else {
                for (Product p : prods) {
                    System.out.println("   * " + p.getName());
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShowRoom s = new ShowRoom();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        // pre-populate an example (optional)
        s.addCategory("furniture");
        s.addProductToCategory("furniture", "chair");

        while (!quit) {
            System.out.println("\n--- Showroom Menu ---");
            System.out.println("1. Add Category");
            System.out.println("2. Add Product to Category");
            System.out.println("3. Remove Product from Category");
            System.out.println("4. Remove Category");
            System.out.println("5. Display Inventory");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = -1;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
            } else {
                sc.nextLine(); // consume invalid token
                System.out.println("Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter category name: ");
                    String cat = sc.nextLine().trim();
                    s.addCategory(cat);
                    System.out.println("Category added: " + cat);
                }
                case 2 -> {
                    System.out.print("Enter category name: ");
                    String cat = sc.nextLine().trim();
                    System.out.print("Enter product name: ");
                    String prod = sc.nextLine().trim();
                    s.addProductToCategory(cat, prod);
                    System.out.println("Product '" + prod + "' added to category '" + cat + "'");
                }
                case 3 -> {
                    System.out.print("Enter category name: ");
                    String cat = sc.nextLine().trim();
                    System.out.print("Enter product name: ");
                    String prod = sc.nextLine().trim();
                    boolean removed = s.removeProductFromCategory(cat, prod);
                    System.out.println(removed ? "Removed." : "Product not found.");
                }
                case 4 -> {
                    System.out.print("Enter category name to remove: ");
                    String cat = sc.nextLine().trim();
                    boolean removedCat = s.removeCategory(cat);
                    System.out.println(removedCat ? "Category removed." : "Category not found.");
                }
                case 5 -> s.displayInventory();
                case 0 -> {
                    quit = true;
                    System.out.println("Exiting.");
                }
                default -> System.out.println("Unknown option. Try again.");
            }
        }

        sc.close();
    }
}

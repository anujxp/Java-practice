import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Category{
    private String category;
    // private HashSet<Product> products  = new HashSet<Product>();
    public Category(String category){
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }



}

class Product{
    private String name;
    public Product(String name ){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
class ShowRoom{
    private HashMap<Category,HashSet<Product>> item ;
    public ShowRoom()
    {
        this.item = new HashMap<>();
    }
    public void addCategory(){
        Scanner se = new Scanner(System.in);
        
        
    }
}
class Main{
    public static void main(String[] args) {
        Category c1 = new Category("furniture");
        HashSet<Product> p1 = new HashSet<Product>();
        Product p2 = new Product("chair");
        p1.add(p2);
        ShowRoom s1 = new ShowRoom(new );

    }
}
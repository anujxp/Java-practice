import java.util.HashMap;
import java.util.HashSet;

class ShowRoom{
        HashSet <String> furniture = new HashSet<String>();
        HashSet <String> Cosmatic = new HashSet<String>();
        HashSet <String> Electronic = new HashSet<String>();
        HashMap<String,HashSet<String>> product  = new HashMap<String,HashSet<String>>();
       
        public ShowRoom(){
            furniture.add("Chair");
            furniture.add("Table");
            furniture.add("Bed");
            
            Cosmatic.add("Vasiline");
            Cosmatic.add("EyeLiner");
            Cosmatic.add("Lipstick"); 
            
            Electronic.add("Mobile");
            Electronic.add("Laptop");
            Electronic.add("Television");

            product.put("cosmetic", Cosmatic);
            product.put("furniture", furniture);
            product.put("Electronic", Electronic);
        }

        public void display(){
            System.out.println(product);
        }
       
    }


class Category{
    public static void main(String args[]){

        ShowRoom product = new ShowRoom();

         product.display();


   }
}
package Inventory_management;
import java.util.Scanner;
public class Inventory_management_system {
    Product[] product; // Declared as an array of Product
    Scanner sc=new Scanner(System.in);
    Inventory_management_system() {
        // Initialize the arrays with the correct sizes
        product = new Product[20]; // This array can store 25 products of any type
    }
    void addproducts(Product p,int i){
     product[i]=p;
    }
    void display(){
        for(int i=0;i<20;i++){
            if(product[i]!=null){
                System.out.println(product[i]);
            }
        }
    }
    void remove(Product p){
        for(int i=0;i<20;i++){
            if(product[i]!=null&& product[i]==p){
               product[i]=null;
            }
        }
    }
    public void search(int id) {
        boolean productFound = false;

        for (int i = 0; i < 20; i++) {
            if (product[i] != null && product[i].getProduct_id() == id) {
                System.out.println(product[i]);
                productFound = true;

            }
        }

        if (!productFound) {
            System.out.println("No product found with ID: " + id);
        }
    }
  void update(int id){
      System.out.println("this updatd function is just for stock and price....");
      boolean productFound = false;
   int price;
   int stock;

      for (int i = 0; i < 20; i++) {
          if (product[i] != null && product[i].getProduct_id() == id) {
              System.out.println("enter updated price...");
              price=sc.nextInt();
              System.out.println("enter updated stock quantity...");
              stock=sc.nextInt();
              product[i].price=price;
              product[i].Stockquantity=stock;
              System.out.println(product[i]);


              productFound = true;

          }
      }

      if (!productFound) {
          System.out.println("No product found with ID: " + id);
      }


  }


}

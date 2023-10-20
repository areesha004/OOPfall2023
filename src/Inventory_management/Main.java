package Inventory_management;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p = new Laptop(01,"Laptop", 2000, 20, "300", 2, "2 years", "200MB", "2GB", 25);
          Product p1 = new Table( 02,"Table", 150, 5, "200","wood","2d","round");
         Product p2   = new Smartphone( 03,"Smartphone", 900, 15, "1000", 2,"2years","android","25Gb",25);

  Inventory_management_system s1=new Inventory_management_system();
  s1.addproducts(p,0);
        s1.addproducts(p1,1);
        s1.addproducts(p2,2);
        System.out.println("product list .....\n");
        s1.display();
//        System.out.println("\n removing a product....\n");
//        s1.remove(p1);
//        s1.display();
//        System.out.println("enter id to search a product");
//        int id;
//        id=sc.nextInt();
//        s1.search(id);
        System.out.println("enter id to update a product");
        int id;
        id=sc.nextInt();
        s1.update(id);

    }
}

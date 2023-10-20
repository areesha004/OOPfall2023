package Inventory_management;
import java.util.Scanner;
public class Inventory_management_system {
    Product[] product; // Declared as an array of Product
    Scanner sc=new Scanner(System.in);
    Inventory_management_system() {
        // Initialize the arrays with the correct sizes
        product = new Product[20]; // This array can store 25 products of any type




    }
    void displaylist(){
        System.out.println("enter how many products you want to enter");
        int no=sc.nextInt();

        for(int i=0;i<no;i++) {
        System.out.println("enter your choice to add product");
        System.out.println("1. laptop");
        System.out.println("2. seating");
        System.out.println("3. smartphone");
        System.out.println("4. table");


    int choice;
    choice = sc.nextInt();
    switch (choice) {
        case 1:
            laptop();
            break;
        case 2:
            seating();
            break;
        case 3:
            smartphone();
            break;
        case 4:
            table();
            break;
    }
}
    }
    void laptop(){
        System.out.println("enter product id..");
        int product_id=sc.nextInt();
        System.out.println("enter productname...");
        String productname=sc.next();
        System.out.println("enter price");
        int price=sc.nextInt();
        System.out.println("enter stiockquantity");
        int stock=sc.nextInt();
        System.out.println("enter index at which you want to enter product");
        int index=sc.nextInt();
        product[index]=new Laptop(product_id,productname,price,stock);
    }
    void seating(){
        System.out.println("enter product id..");
        int product_id=sc.nextInt();
        System.out.println("enter productname...");
        String productname=sc.next();
        System.out.println("enter price");
        int price=sc.nextInt();
        System.out.println("enter stiockquantity");
        int stock=sc.nextInt();
        System.out.println("enter material..");
        String material=sc.next();
        System.out.println("enter index at which you want to enter product");
        int index=sc.nextInt();
        product[index]=new Seating(product_id,productname,price,stock,material);

    }
    void smartphone(){
        System.out.println("enter product id..");
        int product_id=sc.nextInt();
        System.out.println("enter productname...");
        String productname=sc.next();
        System.out.println("enter price");
        int price=sc.nextInt();
        System.out.println("enter stiockquantity");
        int stock=sc.nextInt();
        System.out.println("enter storage quantity");
        String storage=sc.next();
        System.out.println("enter index at which you want to enter product");
        int index=sc.nextInt();
        product[index]=new Smartphone(product_id,productname,price,stock,storage);
    }
    void table(){
        System.out.println("enter product id..");
        int product_id=sc.nextInt();
        System.out.println("enter productname...");
        String productname=sc.next();
        System.out.println("enter price");
        int price=sc.nextInt();
        System.out.println("enter stiockquantity");
        int stock=sc.nextInt();
        System.out.println("enter material..");
        String material=sc.next();
        System.out.println("enetr shapee of table");
        String shape=sc.next();
        System.out.println("enter index at which you want to enter product");
        int index=sc.nextInt();
        product[index]=new Table(product_id,productname,price,stock,material,shape);
    }
    void display(){
        for(int i=0;i<20;i++){
            if(product[i]!=null){
                System.out.println(product[i]);
            }
        }
    }
    void remove(int index){

        for(int i=0;i<20;i++){
            if(product[index]!=null&& product[i]==product[index]){
               product[index]=null;
            }
        }
        display();
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
   display();

  }
    void stockreport(){
        System.out.println("============= stock reports ===========");
        for(int i=0;i<20;i++){
            if(product[i]!=null){
                System.out.println( product[i].productname +"\t\t"+product[i].product_id + "\t\t"+ stock(i));


            }
        }
    }
    String stock(int i){


            if(product[i]!=null && product[i].Stockquantity>10){
               return "stock is available";
            }
            else if(product[i]!=null && product[i].Stockquantity<10 && product[i].Stockquantity>0){
                return "stock is running low";
            }
           else if(product[i]!=null && product[i].Stockquantity==0){
                return " product is out of stock ";
            }


        return null;
    }





}

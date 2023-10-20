package Inventory_management;

public class Furniture extends Product {
    String material;


    public Furniture(int product_id,String productname, double price, int stockquantity, String material) {
        super( product_id,productname, price, stockquantity);
        this.material = material;

    }
}

package Inventory_management;

public class Furniture extends Product {
    String material;
    String dimension;

    public Furniture(int product_id,String productname, double price, int stockquantity, String tax, String material, String dimension) {
        super( product_id,productname, price, stockquantity, tax);
        this.material = material;
        this.dimension = dimension;
    }
}

package Inventory_management;

public class Electronics extends Product{
    int powerconsumption;
    String warranty;

    public Electronics(int product_id,String productname, double price, int stockquantity, String tax, int powerconsumption, String warranty) {
        super(product_id,productname, price, stockquantity, tax);
        this.powerconsumption = powerconsumption;
        this.warranty = warranty;

    }
}

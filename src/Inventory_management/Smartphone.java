package Inventory_management;

public class Smartphone extends Electronics{

    String storagecapacity;


    public Smartphone(int product_id,String productname, double price, int stockquantity,  String storagecapacity) {
        super( product_id,productname, price, stockquantity);

        this.storagecapacity = storagecapacity;

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                " product_id='" + product_id + '\'' +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +
                ", storagecapacity='" + storagecapacity + '\'' +

                '}';
    }
}

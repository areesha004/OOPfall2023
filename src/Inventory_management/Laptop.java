package Inventory_management;

public class Laptop extends Electronics{



    public Laptop(int product_id,String productname, double price, int stockquantity) {
        super( product_id,productname, price, stockquantity);

    }



    @Override
    public String toString() {
        return "Laptop{" +
                " product_id='" + product_id + '\'' +

                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +

                '}';
    }
}

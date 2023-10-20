package Inventory_management;

public class Seating extends Furniture{

     int loadcapacity;

    public Seating(int product_id,String productname, double price, int stockquantity,  String material) {
        super( product_id,productname, price, stockquantity, material);

    }

    @Override
    public String toString() {
        return "Seating{" +
                " product_id='" + product_id + '\'' +

                ", material='" + material + '\'' +

                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +

                '}';
    }
}

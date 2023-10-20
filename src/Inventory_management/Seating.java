package Inventory_management;

public class Seating extends Furniture{

     int loadcapacity;

    public Seating(int product_id,String productname, double price, int stockquantity, String tax, String material, String dimension, int loadcapacity) {
        super( product_id,productname, price, stockquantity, tax, material, dimension);
        this.loadcapacity = loadcapacity;
    }

    @Override
    public String toString() {
        return "Seating{" +
                " product_id='" + product_id + '\'' +
                ",loadcapacity=" + loadcapacity +
                ", material='" + material + '\'' +
                ", dimension='" + dimension + '\'' +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +

                ", tax='" + tax + '\'' +
                '}';
    }
}

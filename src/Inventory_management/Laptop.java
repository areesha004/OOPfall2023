package Inventory_management;

public class Laptop extends Electronics{
    String  accessor;
    String RAMsize;
    int screendimension;


    public Laptop(int product_id,String productname, double price, int stockquantity, String tax, int powerconsumption, String warranty, String accessor, String RAMsize, int screendimension) {
        super( product_id,productname, price, stockquantity, tax, powerconsumption, warranty);
        this.accessor = accessor;
        this.RAMsize = RAMsize;
        this.screendimension = screendimension;
    }



    @Override
    public String toString() {
        return "Laptop{" +
                " product_id='" + product_id + '\'' +
                ",accessor='" + accessor + '\'' +
                ", RAMsize='" + RAMsize + '\'' +
                ", screendimension=" + screendimension +
                ", powerconsumption=" + powerconsumption +
                ", warranty='" + warranty + '\'' +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +

                ", tax='" + tax + '\'' +
                '}';
    }
}

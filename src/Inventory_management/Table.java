package Inventory_management;

public class Table extends Furniture{
    String shape;

    public Table(int product_id,String productname, double price, int stockquantity, String material,  String shape) {
        super(product_id,productname, price, stockquantity, material);
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Table{" +
                " product_id=" + product_id +
                ",shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +

                '}';
    }
}

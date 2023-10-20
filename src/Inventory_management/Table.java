package Inventory_management;

public class Table extends Furniture{
    String shape;

    public Table(int product_id,String productname, double price, int stockquantity, String tax, String material, String dimension, String shape) {
        super(product_id,productname, price, stockquantity, tax, material, dimension);
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Table{" +
                " product_id=" + product_id +
                ",shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", dimension='" + dimension + '\'' +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +
                ", tax='" + tax + '\'' +
                '}';
    }
}

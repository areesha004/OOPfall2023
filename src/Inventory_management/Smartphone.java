package Inventory_management;

public class Smartphone extends Electronics{
    String operatingsystem;
    String storagecapacity;
    int camera_resolution;

    public Smartphone(int product_id,String productname, double price, int stockquantity,  String tax, int powerconsumption, String warranty, String operatingsystem, String storagecapacity, int camera_resolution) {
        super( product_id,productname, price, stockquantity, tax, powerconsumption, warranty);
        this.operatingsystem = operatingsystem;
        this.storagecapacity = storagecapacity;
        this.camera_resolution = camera_resolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                " product_id='" + product_id + '\'' +
                ",operatingsystem='" + operatingsystem + '\'' +
                ", storagecapacity='" + storagecapacity + '\'' +
                ", camera_resolution=" + camera_resolution +
                ", powerconsumption=" + powerconsumption +
                ", warranty='" + warranty + '\'' +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +

                ", tax='" + tax + '\'' +
                '}';
    }
}

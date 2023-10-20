package Inventory_management;

public class Product {
    String productname;
    double price;
    int Stockquantity;
    int product_id;
    String tax;

    public Product(int product_id,String productname, double price, int stockquantity , String tax) {
        this.product_id = product_id;
        this.productname = productname;
        this.price = price;
        Stockquantity = stockquantity;
        this.tax = tax;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockquantity() {
        return Stockquantity;
    }

    public void setStockquantity(int stockquantity) {
        Stockquantity = stockquantity;
    }

    public int getProduct_id()
    {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +
                ", product_id='" + product_id + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }
}

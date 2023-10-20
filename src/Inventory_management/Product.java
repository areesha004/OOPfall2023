package Inventory_management;

public class Product {
    String productname;
    double price;
    int Stockquantity;
    int product_id;

    public Product(int product_id,String productname, double price, int stockquantity) {
        this.product_id = product_id;
        this.productname = productname;
        this.price = price;
        Stockquantity = stockquantity;


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





    @Override
    public String toString() {
        return "Product{" +
                "productname='" + productname + '\'' +
                ", price=" + price +
                ", Stockquantity=" + Stockquantity +
                ", product_id='" + product_id + '\'' +

                '}';
    }
    public boolean equals(Object o){
        Product p1=(Product)o;
        if(this.product_id==p1.product_id){
            return true;
        }
        return false;

    }
    public Product clone (){
        return new Product(product_id,productname,price,getStockquantity());
    }

}

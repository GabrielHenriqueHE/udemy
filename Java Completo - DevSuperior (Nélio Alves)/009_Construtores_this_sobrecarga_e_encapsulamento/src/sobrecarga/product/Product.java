package sobrecarga.product;

public class Product {

    public String name;
    public float price;
    public int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String data () {
        return "Product: " + this.name + "\nPrice: " + this.price + "\nQuantity: " + this.quantity;
    }

}

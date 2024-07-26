package construtores.product;

public class Product {

    String name;
    float price;
    int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String data () {
        return "Product: " + this.name + "\nPrice: " + this.price + "\nQuantity: " + this.quantity;
    }

}

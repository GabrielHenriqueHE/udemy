package problemaProduto;

import java.util.ArrayList;

public class Product {

    String name;
    double price;
    int quantity;

    public Product (String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

        System.out.printf("Dados do produto: %s, R$%.2f, %d unidades. Total: R$ %.2f\n", this.name, this.price, this.quantity, (this.price * this.quantity));

    }

    public double totalValueInStock() {

        return this.price * this.quantity;

    }

    public void addProducts(int quantity) {

        this.quantity += quantity;
        System.out.printf("Dados atualizados: %s, R$%.2f, %d unidades. Total: R$%.2f\n", this.name, this.price, this.quantity, (this.price * this.quantity));

    }

    public void removeProducts(int quantity) {

        this.quantity -= quantity;
        System.out.printf("Dados atualizados: %s, R$%.2f, %d unidades. Total: R$%.2f\n", this.name, this.price, this.quantity, (this.price * this.quantity));

    }

}

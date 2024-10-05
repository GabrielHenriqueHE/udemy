package aula199;

import aula199.entities.Product;
import aula199.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sumT = ps.filteredSum(products, p -> p.getName().charAt(0) == 'T');
        double sumM = ps.filteredSum(products, p -> p.getName().charAt(0) == 'M');

        System.out.println("Sum = " + String.format("%.2f", sumT));
        System.out.println("Sum = " + String.format("%.2f", sumM));
    }
}

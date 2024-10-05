package aula186;

import aula186.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> productSet = new TreeSet<>();
        productSet.add(new Product("TV", 900.00));
        productSet.add(new Product("Notebook", 1200.00));
        productSet.add(new Product("Tablet", 400.00));

        for (Product p : productSet) {
            System.out.println(p.toString());
        }
    }
}

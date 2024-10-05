package aula185;

import aula185.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("TV", 900.00));
        productSet.add(new Product("Notebook", 1200.00));
        productSet.add(new Product("Tablet", 400.00));

        Product prod = new Product("Notebook", 1200);

        System.out.println(productSet.contains(prod));
    }
}
